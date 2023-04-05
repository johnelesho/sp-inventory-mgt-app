package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Product} entity
 */
public record ProductRequest(
        String name,
        double costPrice,
        double sellingPrice,
        int availableQuantity,
        int minQuantity,
        Long supplier
) implements Serializable {
}