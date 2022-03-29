package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

//save,findBy,delete,findAll
public interface RoleService extends CrudService<RoleDTO,Long>{

    RoleDTO myLogic(RoleDTO roleDTO,String str);
}
