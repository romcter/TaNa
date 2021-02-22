package com.tana.TaNa.mapper;

import com.tana.TaNa.dto.UserDto;
import com.tana.TaNa.entity.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

@Mapper(config = MapperConfigs.class)
public interface UserMapper {

    UserDto map(User user);
    @InheritInverseConfiguration
    User map(UserDto userDto);
    List<UserDto> mapToDtos(List<User> user);
    List<User> mapToDocs(List<UserDto> userDto);
}
