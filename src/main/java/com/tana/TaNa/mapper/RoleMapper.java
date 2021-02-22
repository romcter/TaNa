package com.tana.TaNa.mapper;

import com.tana.TaNa.dto.RoleDto;
import com.tana.TaNa.entity.model.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapperConfigs.class)
public interface RoleMapper {

    RoleDto map(Role user);
    @InheritInverseConfiguration
    Role map (RoleDto roleDto);
    List<RoleDto> mapToDtos(List<Role> user);
    List<Role> mapToDocs(List<RoleDto> userDto);
}
