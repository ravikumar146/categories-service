package com.nextgen.categoriesservice.controller;

import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;

@WebMvcTest(controllers = {CategoryController.class},
        properties = {
                "spring.config.import="
        })
public class CategoryControllerTest {
}
