package com.elsoft.spinventorymgtsystem.repos;

import com.elsoft.spinventorymgtsystem.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}