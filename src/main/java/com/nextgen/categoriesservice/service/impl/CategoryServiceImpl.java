package com.nextgen.categoriesservice.service.impl;

import com.nextgen.categoriesservice.entity.Category;
import com.nextgen.categoriesservice.exception.ResourceNotFoundException;
import com.nextgen.categoriesservice.repository.CategoryRepository;
import com.nextgen.categoriesservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories(String categoryDomain) {
        List<Category> categories = categoryRepository.findByCategoryDomain(categoryDomain);
        if (categories == null || categories.isEmpty()) {
            throw new ResourceNotFoundException("No categories found for domain: " + categoryDomain);
        }
        return categories;
    }
}
