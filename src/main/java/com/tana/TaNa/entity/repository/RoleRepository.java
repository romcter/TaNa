package com.tana.TaNa.entity.repository;

import com.tana.TaNa.entity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String role_user);
}
