package com.tana.TaNa.service;

import com.tana.TaNa.entity.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User getUserById(Long id);

    void delete(Long id);
}