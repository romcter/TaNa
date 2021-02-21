package com.tana.TaNa.mapper;

import org.mapstruct.factory.Mappers;

public class Mapper {

    public static final UserMapper USER = Mappers.getMapper(UserMapper.class);
}
