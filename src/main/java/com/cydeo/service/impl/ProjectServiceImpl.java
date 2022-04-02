package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;

import java.util.List;

public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {

    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(), object);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findByID(projectCode);
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteByid(projectCode);
    }

    @Override
    public void update(ProjectDTO object) {
        super.update(object.getProjectCode(), object);
    }
}
