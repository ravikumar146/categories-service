package com.nextgen.categoriesservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@WebMvcTest(controllers = {CategoryController.class},
        properties = {
                "spring.config.import="
        })
public class CategoryControllerTest {

    @Test
    void applicationTest() {
        assertTrue(true);
    }
}
