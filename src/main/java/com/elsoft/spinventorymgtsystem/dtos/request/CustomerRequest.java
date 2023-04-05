package com.elsoft.spinventorymgtsystem.dtos.request;

import com.elsoft.spinventorymgtsystem.enums.CustomerType;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Customer} entity
 */
public record CustomerRequest(String lastName, String firstName, String otherName, String email, CustomerType customerType,
                              AddressRequest address) implements Serializable {
}