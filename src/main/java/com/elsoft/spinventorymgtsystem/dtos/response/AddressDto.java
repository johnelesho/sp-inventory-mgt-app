package com.elsoft.spinventorymgtsystem.dtos.response;

import com.elsoft.spinventorymgtsystem.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * A DTO for the {@link Address} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AddressDto extends AppModelDto implements Serializable {
    private  String houseNo;
    private  String street;
    private  String city;
    private  StateDto state;
    private  CountryDto country;
}