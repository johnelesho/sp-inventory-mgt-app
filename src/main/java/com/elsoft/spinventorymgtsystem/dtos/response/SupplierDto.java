package com.elsoft.spinventorymgtsystem.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Supplier} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class SupplierDto extends AppModelDto implements Serializable {
    private  String lastName;
    private  String firstName;
    private  String otherName;
    private  String email;
    private  Set<PurchasesDto> purchases;
}