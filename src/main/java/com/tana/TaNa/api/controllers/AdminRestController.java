package com.tana.TaNa.api.controllers;

import com.tana.TaNa.dto.UserDto;
import com.tana.TaNa.mapper.Mapper;
import com.tana.TaNa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/admin/")
public class AdminRestController {

    private final UserService userService;

    @Autowired
    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "users/{id}")
    public UserDto getUserById(@PathVariable(name = "id") Long id) {
        return Mapper.USER.map(userService.getUserById(id));
    }
}
