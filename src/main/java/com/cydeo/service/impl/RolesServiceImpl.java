package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {

    @Override
    public RoleDTO save(RoleDTO roleDTOObject) {
        return super.save(roleDTOObject.getId(), roleDTOObject);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleted(RoleDTO object) {

    }

    @Override
    public void deletedById(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    public RoleDTO findByID(Long id) {
        return super.findByID(id);
    }

}
