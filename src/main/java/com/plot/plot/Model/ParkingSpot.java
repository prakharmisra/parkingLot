package com.scalar.plot.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Setter
@Getter
@SuperBuilder
public class ParkingSpot extends BaseModel{

    private int spotId;

    private int floorId;

    private VehicleType vehicleType;

    private SpotStatus spotStatus;

    public static ParkingSpot createspot(){

        return ParkingSpot.builder()
                .floorId(212)
                .spotId(12)
                .spotStatus(SpotStatus.AVAILABLE)
                .vehicleType(VehicleType.MEDIUM)
                .build();

    }


}
