package com.scalar.plot.Model;



import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@SuperBuilder
@Getter
@Setter
public class ParkingFloor extends BaseModel {

    private PaymentCounter paymentCounter;
    private List<ParkingSpot> parkingSpot = new ArrayList<>();


    private Integer FloorNumber;

    private DisplayBoard displayBoard;


}
