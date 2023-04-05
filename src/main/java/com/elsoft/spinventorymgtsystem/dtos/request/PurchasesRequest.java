package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Purchases} entity
 */
public record PurchasesRequest(
        String invoiceNo,
        double totalAmount,
        double purchaseDiscount,
        double totalVAT,
                              double amountDue,
        Set<PurchasesItemsDetailsRequest> purchaseItemDetails
) implements Serializable {
}