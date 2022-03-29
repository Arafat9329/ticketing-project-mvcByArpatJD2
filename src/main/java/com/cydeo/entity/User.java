package com.cydeo.entity;

import com.cydeo.enums.Gender;

public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String passWord;
    private String enabled;
    private Role role;
    private Gender gender;
}
