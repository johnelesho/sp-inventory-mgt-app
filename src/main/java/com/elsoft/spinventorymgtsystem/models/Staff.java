package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "staff")
public class Staff extends AppModel {
    private String username;
    private String email;
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "app_role_id", nullable = false)
    private AppRole appRole;

}