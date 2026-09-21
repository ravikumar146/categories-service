package com.nextgen.categoriesservice.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

/**
 * Category entity representing to which the product belongs to.
 */
@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(
        name = "Category",
        description = "Tells a category where product available in the system."
)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String categoryName;

    @Column(nullable = false, length = 150)
    private String categoryDomain;

    @Column(length = 500)
    private String icon;
}
