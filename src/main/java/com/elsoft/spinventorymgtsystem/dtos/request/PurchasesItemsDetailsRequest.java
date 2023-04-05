package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.PurchasesItemsDetails} entity
 */
public record PurchasesItemsDetailsRequest(
        double price,
        int quantity,
        double cost,
        double unitDiscount,
        Long supplier
) implements Serializable {
}