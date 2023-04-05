package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "app_role")
public class AppRole extends AppModel {
    private String name;

    @OneToMany(mappedBy = "appRole", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AppPermissions> permissions = new LinkedHashSet<>();

}