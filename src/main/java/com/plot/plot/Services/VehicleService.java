package com.scalar.plot.Services;


import com.scalar.plot.Model.Vehicle;
import com.scalar.plot.Model.VehicleType;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class VehicleService {


    public Vehicle fetchOrCreate(VehicleType vehicleType, int vehicleNumber) {

        return Vehicle.builder().VehicleNumber(vehicleNumber)
                .type(vehicleType)
                .build();
    }
}
