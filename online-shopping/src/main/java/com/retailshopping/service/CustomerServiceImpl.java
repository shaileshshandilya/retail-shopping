package com.retailshopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.retailshopping.model.Customer;
import com.retailshopping.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Qualifier("customerRepository")
    @Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomerByContactnumber(String contactNumber) {
		return customerRepository.findCustomerByContactNumber(contactNumber);
	}
	@Override
	public String saveCustomer(Customer customer)
	{
		customerRepository.saveAndFlush(customer);
		return "Customer Detail Save Sucessfully";
	}

}
