package com.elsoft.spinventorymgtsystem.dtos.response;

import com.elsoft.spinventorymgtsystem.models.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A DTO for the {@link Country} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class CountryDto extends AppModelDto implements Serializable {
    private String name;
    private String code;
}