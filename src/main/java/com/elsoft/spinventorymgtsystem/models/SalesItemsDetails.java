package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sales_items_details")
public class SalesItemsDetails extends AppModel {
    private double price;

    private int quantity;

    private double cost;

    private double unitDiscount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sales_id")
    private Sales sales;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

}