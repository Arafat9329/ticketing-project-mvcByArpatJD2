package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import org.springframework.boot.CommandLineRunner;// run it when/before the application run

public class DataGenerator implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");
    }
}
