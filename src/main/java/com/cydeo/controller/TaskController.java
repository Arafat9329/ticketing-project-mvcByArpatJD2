package com.cydeo.controller;

import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.TaskService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task")//http://localhost:8080/task
public class TaskController {

    UserService userService;
    ProjectService projectService;
    TaskService taskService;

    public TaskController(TaskService taskService, UserService userService, ProjectService projectService) {
        this.taskService = taskService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @GetMapping("/create")//http://localhost:8080/task/create
    public String createTask(Model model){

        model.addAttribute("task",new TaskDTO());
        model.addAttribute("projects",projectService.findAll());
        model.addAttribute("users",userService.findEmployee());
        model.addAttribute("tasks",taskService.findAll());

        return "task/create";
    }

    @PostMapping("/create")
//    public String insertTask(@ModelAttribute("task") TaskDTO task){
    public String insertTask(TaskDTO task){

        taskService.save(task);

        return "redirect:/task/create";

    }

    @GetMapping("/delete/{taskId}")//http://localhost:8080/task/create
    public String deleteTask(@PathVariable("taskId") Long taskId){

        taskService.deleteById(taskId);

        return "redirect:/task/create";
    }
}
