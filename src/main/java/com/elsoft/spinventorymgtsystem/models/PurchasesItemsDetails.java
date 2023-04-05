package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "purchases_items_details")
public class PurchasesItemsDetails extends AppModel {

    private double price;

    private int quantity;

    private double cost;

    private double unitDiscount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchases_id")
    private Purchases purchases;

    @ManyToMany(mappedBy = "purchasesItemsDetails")
    private Set<Product> products = new LinkedHashSet<>();

}