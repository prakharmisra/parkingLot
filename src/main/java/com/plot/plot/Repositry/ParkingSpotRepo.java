package com.scalar.plot.Repositry;

import com.scalar.plot.Model.ParkingSpot;
import com.scalar.plot.Model.SpotStatus;
import com.scalar.plot.Model.VehicleType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository
public class ParkingSpotRepo {

    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public static void saveAll(List<ParkingSpot> parkingSpots) {

        parkingSpots.addAll(parkingSpots);

    }

    public ParkingSpot findOneByVehicleTypeandStatusAvalable(VehicleType vehicleType) {

        for(ParkingSpot key : parkingSpots){

            if(key.getSpotStatus()== SpotStatus.AVAILABLE && key.getVehicleType()== VehicleType.MEDIUM){

                return key;
            }
        }

        return  null;
    }

    public void save(ParkingSpot allotedparkingSpot) {

        parkingSpots.add((allotedparkingSpot));
    }
}
