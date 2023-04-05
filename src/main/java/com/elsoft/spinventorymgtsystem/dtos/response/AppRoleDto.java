package com.elsoft.spinventorymgtsystem.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.AppRole} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AppRoleDto extends AppModelDto {
    private  Long id;
    private  String name;
}