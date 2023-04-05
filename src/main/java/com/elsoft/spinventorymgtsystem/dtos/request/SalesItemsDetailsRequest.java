package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.SalesItemsDetails} entity
 */
public record SalesItemsDetailsRequest(
        double price, int quantity,
        double cost,
                                       double unitDiscount,
        Long product
) implements Serializable {
}