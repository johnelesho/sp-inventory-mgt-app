package com.elsoft.spinventorymgtsystem.repos;

import com.elsoft.spinventorymgtsystem.models.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasesRepository extends JpaRepository<Purchases, Long> {
}