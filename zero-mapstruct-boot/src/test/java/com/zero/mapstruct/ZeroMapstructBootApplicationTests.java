package com.zero.mapstruct;

import com.alibaba.fastjson2.JSONObject;
import com.zero.mapstruct.domain.dto.SystemUserDTO;
import com.zero.mapstruct.domain.entity.SystemUserEntity;
import com.zero.mapstruct.domain.entity.CarType;
import com.zero.mapstruct.mapper.SystemUserMapping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeroMapstructBootApplicationTests {

    @Autowired
    private SystemUserMapping systemUserMapping;

    @Test
    public void testCarToCarDTO() {
        SystemUserEntity systemUserEntity = new SystemUserEntity();
        systemUserEntity.setMake("make");
        CarType type =  new CarType();
        type.setType("type");
        systemUserEntity.setCarType(type);
        systemUserEntity.setNumberOfSeats(1);
        SystemUserDTO systemUserDTO = systemUserMapping.carToCarDTO(systemUserEntity);
        System.out.println(JSONObject.toJSONString(systemUserDTO));
    }

}
