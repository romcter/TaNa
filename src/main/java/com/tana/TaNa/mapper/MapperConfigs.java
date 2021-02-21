package com.tana.TaNa.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        componentModel="spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG
)
interface MapperConfigs{

}
