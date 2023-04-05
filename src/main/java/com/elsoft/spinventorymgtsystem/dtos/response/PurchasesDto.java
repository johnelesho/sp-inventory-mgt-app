package com.elsoft.spinventorymgtsystem.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Purchases} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class PurchasesDto extends AppModelDto implements Serializable {
    private  String invoiceNo;
    private  double totalAmount;
    private  double purchaseDiscount;
    private  double totalVAT;
    private  double amountDue;
    private  SupplierDto supplier;
}