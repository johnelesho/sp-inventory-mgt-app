package com.elsoft.spinventorymgtsystem.models;

import com.elsoft.spinventorymgtsystem.enums.CustomerType;
import com.elsoft.spinventorymgtsystem.models.AppModel;
import com.elsoft.spinventorymgtsystem.models.Purchases;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "supplier")
public class Supplier extends AppModel {
    private String lastName;
    private String firstName;
    private String otherName;
    private String email;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Purchases> purchases = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "suppliers", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Product> products = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Supplier supplier = (Supplier) o;
        return getId() != null && Objects.equals(getId(), supplier.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}