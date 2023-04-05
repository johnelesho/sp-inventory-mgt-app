package com.elsoft.spinventorymgtsystem.repos;

import com.elsoft.spinventorymgtsystem.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}