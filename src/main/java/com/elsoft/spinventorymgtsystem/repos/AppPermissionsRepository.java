package com.elsoft.spinventorymgtsystem.repos;

import com.elsoft.spinventorymgtsystem.models.AppPermissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppPermissionsRepository extends JpaRepository<AppPermissions, Long> {
}