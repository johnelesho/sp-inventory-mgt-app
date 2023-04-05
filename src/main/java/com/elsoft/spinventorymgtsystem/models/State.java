package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "state")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class State extends AppModel {
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        State state = (State) o;
        return getId() != null && Objects.equals(getId(), state.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}