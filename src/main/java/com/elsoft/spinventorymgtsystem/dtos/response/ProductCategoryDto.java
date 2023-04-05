package com.elsoft.spinventorymgtsystem.dtos.response;

import com.elsoft.spinventorymgtsystem.models.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link ProductCategory} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class ProductCategoryDto extends AppModelDto implements Serializable {
    private  String name;
    private  String code;
    private  Set<ProductDto> products;
}