package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.Customer;
import com.retailshopping.model.Product;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	Customer findCustomerByContactNumber(String contactNumber);

}
