package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Sales} entity
 */
public record SalesRequest(String invoiceNo, double salesDiscount, double totalAmount, double totalVAT,
                           double amountDue, Set<SalesItemsDetailsRequest> salesItemsDetails) implements Serializable {
}