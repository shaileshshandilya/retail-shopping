package com.retailshopping.controllers;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.retailshopping.model.Customer;
import com.retailshopping.service.CartLineService;
import com.retailshopping.service.CartService;
import com.retailshopping.service.CustomerService;
import com.retailshopping.service.DiscountService;
import com.retailshopping.service.ProductService;

@Controller
@RequestMapping("/bill")
public class BillController {

	@Autowired
	@Qualifier("cartLineService")
	private CartLineService cartLineService;

	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	@Autowired
	@Qualifier("cartService")
	private CartService cartService;

	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@Autowired
	private DiscountService discountService;

	@GetMapping("/show/{totalAmount}")
	public ModelAndView showCart(@PathVariable double totalAmount) {
		System.out.println("Show Method" + totalAmount);
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("userClickShowBill", true);
		modelAndView.addObject("title", "Bill");
		Customer customer = new Customer();

		modelAndView.addObject("customer", customer);
		modelAndView.addObject("cartLines", cartLineService.findCartLines());
		return modelAndView;
	}

	private static final DecimalFormat decfor = new DecimalFormat("0.00");
	@PostMapping(value = "/addCustomer")
	public ModelAndView handleCustomerSubmission(@Valid @ModelAttribute("customer") Customer customer,
		BindingResult bindingResult, Model model, HttpServletRequest request) {
		String message;
		double discountedamount;
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("userClickShowFinalBill", true);
		modelAndView.addObject("title", "Bill");

		Optional<Customer> dbCustomer = Optional
				.ofNullable(customerService.getCustomerByContactnumber(customer.getContactNumber()));

		Customer discountedCustomer=null;
		if (dbCustomer.isPresent()) {
			dbCustomer.get().setTotalAmount(customer.getTotalAmount());
			discountedCustomer=discountService.getDiscount(dbCustomer.get());
			 discountedamount=(customer.getTotalAmount()-discountedCustomer.getTotalAmount());
			message= "Hi "+dbCustomer.get().getName()+" , You save "+ decfor.format(discountedamount)  +" And your total Bill is "+decfor.format(discountedCustomer.getTotalAmount());
		}
		else {
			customer.setResigteredDate(new Date());
			customerService.saveCustomer(customer);
			discountedCustomer=discountService.getDiscount(customer);
			 discountedamount=(customer.getTotalAmount()-discountedCustomer.getTotalAmount());
				message= "Hi "+customer.getName()+" , You save "+ decfor.format(discountedamount)  +" And your total Bill is "+decfor.format(discountedCustomer.getTotalAmount());
		}
		
		
		
		
		
		
		model.addAttribute("message",message);

		return modelAndView;
	}
}
