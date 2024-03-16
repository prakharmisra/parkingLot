package com.scalar.plot.Services;

import com.scalar.plot.Model.ParkingLot;
import com.scalar.plot.Repositry.ParkingLotRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ParkingLotService {

    ParkingLotRepo parkingLotRepo;

    ParkingSpotService parkingSpotService;
    public ParkingLot createParkingLot(ParkingLot parkingLot) {

       ParkingLot persistedLot =  parkingLotRepo.save(parkingLot);

        parkingSpotService.createspots(persistedLot);

       return persistedLot;

    }
}
