package com.scalar.plot.Repositry;


import com.scalar.plot.Model.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ParkingLotRepo {

    List<ParkingLot> parkingLots = new ArrayList<>();
    public ParkingLot save(ParkingLot parkingLot) {

        parkingLots.add(parkingLot);

        return parkingLot;
    }
}
