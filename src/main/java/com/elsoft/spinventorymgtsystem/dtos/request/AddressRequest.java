package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Address} entity
 */
public record AddressRequest(String houseNo, String street, String city, StateRequest state,
                             CountryRequest country) implements Serializable {
}