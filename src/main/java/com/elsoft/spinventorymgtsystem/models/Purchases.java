package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "purchases")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Purchases extends AppModel {
    private String invoiceNo;

   private double totalAmount;

   private double purchaseDiscount;

   private double totalVAT;

   private double amountDue;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @OneToMany(mappedBy = "purchases", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PurchasesItemsDetails> purchasesItemsDetails = new LinkedHashSet<>();

}