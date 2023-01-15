package com.retailshopping.service;

import com.retailshopping.model.User;

public interface UserService {

    boolean saveUser(User user);

    User findUserByEmail(String email);

}
