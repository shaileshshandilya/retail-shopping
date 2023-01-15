package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

}
