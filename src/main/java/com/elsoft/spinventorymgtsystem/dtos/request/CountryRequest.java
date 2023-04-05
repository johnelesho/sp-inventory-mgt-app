package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Country} entity
 */
public record CountryRequest(String name, String code) implements Serializable {
}