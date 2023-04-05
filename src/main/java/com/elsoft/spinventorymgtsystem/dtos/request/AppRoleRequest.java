package com.elsoft.spinventorymgtsystem.dtos.request;

import java.io.Serializable;
import java.util.Set;

/**
 * A DTO for the {@link com.elsoft.spinventorymgtsystem.models.AppRole} entity
 */
public record AppRoleRequest(String name, Set<AppPermissionsRequest> permissions) implements Serializable {
}