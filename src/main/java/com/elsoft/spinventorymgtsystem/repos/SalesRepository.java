package com.elsoft.spinventorymgtsystem.repos;

import com.elsoft.spinventorymgtsystem.models.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}