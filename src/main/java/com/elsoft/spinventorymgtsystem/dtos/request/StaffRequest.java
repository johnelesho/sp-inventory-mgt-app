package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.Staff} entity
 */
public record StaffRequest(String username, String email, String password, Long roleId) implements Serializable {
}