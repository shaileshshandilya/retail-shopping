package com.retailshopping.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.retailshopping.model.Customer;

@Service
public class DiscountService {
	
	public Customer getDiscount(Customer customer)
	{
		 SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");  
		 Date date1 = customer.getResigteredDate();   
         Date date2 = new Date(); 
         long time_difference = date2.getTime() - date1.getTime();  
         long years_difference = (time_difference / (1000l*60*60*24*365));   
		
		if("Y".equalsIgnoreCase(customer.getIsEmployee()))
		{
			//30% discount for Store Employee  
			double discountedAmount=customer.getTotalAmount()*(0.3);
			customer.setTotalAmount(customer.getTotalAmount()-discountedAmount);
		}
		else if("Y".equalsIgnoreCase(customer.getIsAffiliated()))
		{
			//10% discount for affiliated customer  
			double discountedAmount=customer.getTotalAmount()*(0.1);
			customer.setTotalAmount(customer.getTotalAmount()-discountedAmount);
		}
		else if(years_difference>=2)
		{
			//5% discount for customer more than 2 years 
			double discountedAmount=customer.getTotalAmount()*(0.05);
			customer.setTotalAmount(customer.getTotalAmount()-discountedAmount);
		}
		//Common Discount 5  for every 100 spend on overall amount to customer 
		int count=(int) (customer.getTotalAmount())/100;
		double discountedAmount=count*5;
		customer.setTotalAmount(customer.getTotalAmount()-discountedAmount);
		return customer; 
	}
	

}
