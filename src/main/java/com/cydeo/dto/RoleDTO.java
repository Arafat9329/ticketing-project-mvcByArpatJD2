package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A data transfer object (DTO) is an object that carries data between processes.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDTO {

    private Long id;
    private String description;
}
