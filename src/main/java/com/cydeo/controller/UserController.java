package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")//http://localhost:8080/login
    public String createUser(Model model){
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());

        return "/user/create";
    }

    @PostMapping("/create")//http://localhost:8080/create
    public String insertUser(@ModelAttribute("user")UserDTO user, Model model){


        userService.save(user);


        return "redirect:/user/create";
    }

    @GetMapping("/update/{username}")//http://localhost:8080/update
    public String editUSer(@PathVariable("username")String username, Model model){


        model.addAttribute("user", userService.findById(username));
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());


        return "/user/update";
    }

    @PostMapping("/update")//http://localhost:8080/update
    public String updateUser(UserDTO user){

        userService.update(user);

        return "redirect:/user/create";
    }





}
