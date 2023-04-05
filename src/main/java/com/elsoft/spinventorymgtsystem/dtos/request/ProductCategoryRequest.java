package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.ProductCategory} entity
 */
public record ProductCategoryRequest(
        String name, String code
) implements Serializable {
}