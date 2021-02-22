package com.tana.TaNa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tana.TaNa.entity.enums.Status;
import com.tana.TaNa.entity.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    @NotNull
    @Size(max = 120)
    private String username;

    @Size(max = 120)
    private String firstName;

    @Size(max = 120)
    private String lastName;

    @Email
    @Size(max = 120)
    @NotNull
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private List<RoleDto> roles;
    private Date created;
    private Date updated;
    private Status status;
}
