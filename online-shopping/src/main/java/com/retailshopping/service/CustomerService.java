package com.retailshopping.service;

import com.retailshopping.model.Customer;

public interface CustomerService {
	
	public Customer getCustomerByContactnumber(String contactNumber);
	public String saveCustomer(Customer dbCustomer);

}
