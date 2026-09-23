package com.nextgen.categoriesservice.controller;

import com.nextgen.categoriesservice.entity.Category;
import com.nextgen.categoriesservice.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(
        name = "Categories",
        description = "APIs for managing all categories"
)
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "Get all categories")
    @GetMapping("{domain}/list/")
    public List<Category> getAllCategories(@Parameter(description = "Category Domain", example = "Health Care")
                                           @PathVariable String domain) {
        return categoryService.getAllCategories(domain);
    }
}
