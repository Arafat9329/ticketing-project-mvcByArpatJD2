package com.cydeo.conventor;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class RoleDtoConvention implements Converter<String, RoleDTO> {
    RoleService roleService;

    public RoleDtoConvention(RoleService roleService) {
        this.roleService = roleService;
    }



    @Override
    public RoleDTO convert(String source) {
        return roleService.findById(Long.parseLong(source));
    }
}
