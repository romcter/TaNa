package com.tana.TaNa.dto;

import com.tana.TaNa.entity.enums.Status;
import com.tana.TaNa.entity.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private Date created;
    private Date updated;
    private Status status;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Role> roles;

}
