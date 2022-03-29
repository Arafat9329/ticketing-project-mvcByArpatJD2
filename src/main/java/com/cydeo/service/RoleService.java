package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface RoleService {
    //save,findBy,delete,findAll

    RoleDTO save(RoleDTO roleDTO);
    RoleDTO findByID (Long id);
    List<RoleDTO> findAll ();
    void deleted(RoleDTO roleDTO);
    void deletedById(Long id);

}
