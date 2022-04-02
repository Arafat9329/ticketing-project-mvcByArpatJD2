package com.cydeo.controller;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/project")
public class ProjectController {
    RoleService roleService;
    UserService userService;

    @GetMapping("/create")//http://localhost:8080/project/create
    public String createProject(Model model) {

        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("assignedManager", roleService.findAll());

        return "/project/create";
    }
}
