package com.retailshopping.service;

import java.util.List;

import com.retailshopping.model.Category;

public interface CategoryService {

    String saveCategory(Category category);

    List<Category> findAllCategories();

    Category findCategoryById(Integer id);

    String deleteCategory(Integer id);

    String updateCategory(Category branch);

}
