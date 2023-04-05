package com.elsoft.spinventorymgtsystem.models;

import com.elsoft.spinventorymgtsystem.enums.CustomerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@Table(name = "customer")
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends AppModel {

    private String lastName;
    private String firstName;
    private String otherName;
    private String email;
    private CustomerType customerType;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

}