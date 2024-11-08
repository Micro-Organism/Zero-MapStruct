package com.zero.mapstruct.domain.entity;

import lombok.Data;

@Data
public class SystemUserEntity {
    private String make;
    private int numberOfSeats;
    private CarType carType;
}