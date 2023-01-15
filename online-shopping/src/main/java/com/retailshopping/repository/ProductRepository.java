package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.Product;

import java.util.List;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductByCategoryId(Integer categoryId);

}
