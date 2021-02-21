package com.tana.TaNa.mapper;

import com.tana.TaNa.dto.RoleDto;
import com.tana.TaNa.entity.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = MapperConfigs.class)
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDto map(Role user);
}
