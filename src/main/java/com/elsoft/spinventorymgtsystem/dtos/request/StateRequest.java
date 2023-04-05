package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.State} entity
 */
public record StateRequest(Long id, LocalDateTime createdAt, LocalDateTime updatedAt,
                           String name) implements Serializable {
}