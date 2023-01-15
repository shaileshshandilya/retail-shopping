package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.Cart;

@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
