package com.elsoft.spinventorymgtsystem.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Staff} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class StaffDto  extends AppModelDto implements Serializable {
    private Long id;
    private String username;
    private String email;
    private String password;
    private AppRoleDto appRole;
}