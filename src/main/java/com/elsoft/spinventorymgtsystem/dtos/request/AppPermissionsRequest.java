package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.AppPermissions} entity
 */
public record AppPermissionsRequest(String permission) implements Serializable {
}