package com.scalar.plot.Controller;


import com.scalar.plot.Generators.ParkingFloorId;
import com.scalar.plot.Generators.ParkingLotId;
import com.scalar.plot.Generators.ParkingSpotId;
import com.scalar.plot.Model.*;
import com.scalar.plot.Services.ParkingLotService;
import com.scalar.plot.dtos.CreateParkingLotRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/parking-lot")
public class ParkingController2 {

    ParkingLotService parkingLotService;

    @PostMapping
    public ParkingLot createParkinglot(@RequestBody CreateParkingLotRequest request){

        validate(request);

        ParkingLot pl = transform(request);

       return  parkingLotService.createParkingLot(pl);

    }

    private ParkingLot transform(CreateParkingLotRequest request) {

        List<ParkingSpot> parkingSpots = Collections.nCopies(request.getNoofspotsperfloor(),ParkingSpot.createspot());

        parkingSpots.forEach(parkingSpot -> parkingSpot.setSpotId(ParkingSpotId.nextId()));


        List<ParkingFloor> parkingFloors = Collections.nCopies(request.getNoOffloor(),
                              ParkingFloor.builder().parkingSpot(parkingSpots)
                                      .paymentCounter(PaymentCounter.builder().build()).build());

        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(ParkingFloorId.getnextId()));

        return ParkingLot.builder().id(ParkingLotId.nextId())
                .address("Bangalore")
                .entrygates(
                  Collections.nCopies(request.getNoOfEntrygates(),EntryGate.builder().build())
                )
                .exitgates(Collections.nCopies(request.getNoOfExitgates(),ExitGate.builder().build()))
                .floorList(parkingFloors)
                .build();

    }

    private void validate(CreateParkingLotRequest request) {

        if(request.getNoOffloor() < 0){
            throw new RuntimeException("invalid floor number");
        }
    }

}
