package com.scalar.plot.Services;

import com.scalar.plot.Model.ParkingLot;
import com.scalar.plot.Model.ParkingSpot;
import com.scalar.plot.Model.VehicleType;
import com.scalar.plot.Repositry.ParkingSpotRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ParkingSpotService {



    ParkingSpotRepo parkingSpotRepo;
    public  void createspots(ParkingLot persistedLot) {

        List<ParkingSpot> parkingSpots = persistedLot.getFloorList()
                .stream().flatMap(floor -> floor.getParkingSpot().stream())
                .collect(Collectors.toList());

        parkingSpotRepo.saveAll(parkingSpots);
    }


    public  ParkingSpot getSpots(Long parkingLotId, VehicleType vehicleType) {

       return  parkingSpotRepo.findOneByVehicleTypeandStatusAvalable(vehicleType);

    }

    public void update(ParkingSpot allotedparkingSpot) {

        parkingSpotRepo.save(allotedparkingSpot);

    }
}
