package com.scalar.plot.dtos;

import com.scalar.plot.Model.EntryGate;
import com.scalar.plot.Model.Operator;
import com.scalar.plot.Model.VehicleType;
import lombok.Getter;

import java.util.Date;


@Getter
public class CreateTicketRequest {
    private Long VehicleId;

    private int VehicleNumber;

    private VehicleType vehicleType;


    private Long ParkingLotId;

    private Date entryTime;

    private Long spotId;

    private EntryGate entryGate;

    private Operator entryOperator;
}
