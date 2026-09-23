package com.nextgen.categoriesservice.service;

import com.nextgen.categoriesservice.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories(String categoryDomain);
}
