package com.elsoft.spinventorymgtsystem.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface AppService<I, O> {

    O findById(Long id);
    Page<O> findAll(Pageable page);

    void deleteById(Long id);

    O update(I request);
    O save(I request);

    boolean isExistById(Long id);

    O findOrThrow(Long id);


}
