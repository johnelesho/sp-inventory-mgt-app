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
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Address extends AppModel {
    private String houseNo;
    private String street;
    private String city;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;



}