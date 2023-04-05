package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Supplier} entity
 */
public record SupplierRequest(
        String lastName, String firstName, String otherName,
                              String email) implements Serializable {
}