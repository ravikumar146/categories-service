package com.nextgen.categoriesservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        properties = {
                "spring.config.import=optional:"
        }
)
class CategoriesServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
