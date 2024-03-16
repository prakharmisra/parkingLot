package com.scalar.plot.Model;


import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Vehicle extends BaseModel {
    private int VehicleNumber;
    private VehicleType type;
}
