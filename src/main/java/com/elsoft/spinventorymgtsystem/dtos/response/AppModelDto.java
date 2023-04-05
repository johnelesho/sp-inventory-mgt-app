package com.elsoft.spinventorymgtsystem.dtos.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.AppModel} entity
 */
@Data
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public abstract class AppModelDto implements Serializable {
    private Long id;
    private LocalDateTime createdAt;
    private StaffDto createdBy;
    private StaffDto updatedBy;
    private LocalDateTime updatedAt;
}