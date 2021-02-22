package com.tana.TaNa.api.controllers;

import com.tana.TaNa.dto.UserDto;
import com.tana.TaNa.entity.model.User;
import com.tana.TaNa.mapper.Mapper;
import com.tana.TaNa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/users/")
public class UserRestController {

    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "create/")
    public UserDto register(@RequestBody @Valid UserDto userDto){
        User user = Mapper.USER.map(userDto);
        return Mapper.USER.map(userService.register(user));
    }

    @GetMapping(value = "{id}")
    public UserDto getUserById(@PathVariable(name = "id") Long id){
        return Mapper.USER.map(userService.getUserById(id));
    }
}
