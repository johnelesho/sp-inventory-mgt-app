package com.elsoft.spinventorymgtsystem.dtos.response;

import com.elsoft.spinventorymgtsystem.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A DTO for the {@link Product} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class ProductDto extends AppModelDto implements Serializable {
    private  String name;
    private  double costPrice;
    private  double sellingPrice;
    private  int availableQuantity;
    private  int minQuantity;
    private  ProductCategoryDto productCategory;
}