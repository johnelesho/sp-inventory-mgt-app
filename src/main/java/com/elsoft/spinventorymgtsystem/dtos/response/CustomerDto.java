package com.elsoft.spinventorymgtsystem.dtos.response;

import com.elsoft.spinventorymgtsystem.enums.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Customer} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class CustomerDto extends AppModelDto implements Serializable {
    private String lastName;
    private String firstName;
    private String otherName;
    private String email;
    private CustomerType customerType;
}