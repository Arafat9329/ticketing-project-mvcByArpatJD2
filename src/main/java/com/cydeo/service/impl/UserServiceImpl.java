package com.cydeo.service.impl;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService {

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(), object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleted(UserDTO object) {
        super.deleteByid(object.getUserName());
    }

    @Override
    public void deletedById(String s) {

    }

    @Override
    public UserDTO findByID(String id) {
        return super.findByID(id);
    }
}
