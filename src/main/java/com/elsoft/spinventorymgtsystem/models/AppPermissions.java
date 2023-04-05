package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@Table(name = "app_permissions")
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AppPermissions extends AppModel {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "app_role_id")
    private AppRole appRole;

    @Column(name = "permission", nullable = false)
    private String permission;



}