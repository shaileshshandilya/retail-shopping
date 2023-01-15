package com.retailshopping.service;

import com.retailshopping.model.Cart;

public interface CartService {

    boolean saveCart(Cart cart);

    boolean updateCart(Cart cart);

    Cart findCart();

}
