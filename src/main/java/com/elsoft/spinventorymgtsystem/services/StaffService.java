package com.elsoft.spinventorymgtsystem.services;

import com.elsoft.spinventorymgtsystem.dtos.request.StaffRequest;
import com.elsoft.spinventorymgtsystem.dtos.response.StaffDto;
import com.elsoft.spinventorymgtsystem.models.Staff;
import com.elsoft.spinventorymgtsystem.repos.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StaffService implements AppService<StaffRequest, StaffDto>{

    final StaffRepository staffRepository;
    @Override
    public StaffDto findById(Long id) {
        return null;
    }

    @Override
    public Page<StaffDto> findAll(Pageable page) {

        Page<StaffDto> all = staffRepository.findAll(page).map(mapToDto);

        return all;

    }

    @Override
    public void deleteById(Long id) {
        staffRepository.deleteById(id);

    }

    @Override
    public StaffDto update(StaffRequest request) {

        return null;
    }

    @Override
    public StaffDto save(StaffRequest request) {
        return null;
    }

    @Override
    public boolean isExistById(Long id) {
        return false;
    }

    @Override
    public StaffDto findOrThrow(Long id) {
        return null;
    }
}
