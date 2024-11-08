package com.zero.mapstruct.mapper;

import com.zero.mapstruct.domain.dto.SystemUserDTO;
import com.zero.mapstruct.domain.entity.SystemUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Mapper(componentModel = "spring",imports = {LocalDateTime.class, Date.class, ZoneId.class})//交给spring管理
public interface SystemUserMapping {
    
    /**
     * 用来调用实例 实际开发中可使用注入Spring  不写
     */
    SystemUserMapping CAR_MAPPING = Mappers.getMapper(SystemUserMapping.class);

    /**
     *  源类型 目标类型 成员变量相同类型 相同变量名 不用写{@link Mapping}来映射
     *
     * @param systemUserEntity the car
     * @return the car dto
     */
    @Mapping(target = "type", source = "carType.type")
    @Mapping(target = "seatCount", source = "numberOfSeats")
    SystemUserDTO carToCarDTO(SystemUserEntity systemUserEntity);

}