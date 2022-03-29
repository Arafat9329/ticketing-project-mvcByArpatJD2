package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
//@AllArgsConstructor //when we extend the class, lombok will not creat super constructor for us, need do it manually
public class User extends BaseEntity{
    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String email, String passWord, String enabled, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateTime, lastUpdateUserId);//lombok will not do this
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String passWord;
    private String enabled;
    private Role role;
    private Gender gender;
}
