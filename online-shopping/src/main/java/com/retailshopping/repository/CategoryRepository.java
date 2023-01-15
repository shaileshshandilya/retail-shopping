package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.Category;

;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
