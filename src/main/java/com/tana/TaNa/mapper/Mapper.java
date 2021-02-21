package com.tana.TaNa.mapper;

import org.mapstruct.factory.Mappers;

public interface Mapper {

    UserMapper USER = Mappers.getMapper(UserMapper.class);
}
