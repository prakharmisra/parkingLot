package com.scalar.plot.Services;

import com.scalar.plot.Model.SpotStatus;
import com.scalar.plot.Model.Ticket;
import com.scalar.plot.Repositry.ParkingSpotRepo;
import com.scalar.plot.dtos.CreateTicketRequest;
import com.scalar.plot.Model.ParkingSpot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;


@Service
public class TicketService {

   ParkingSpotService parkingSpotService;



   VehicleService vehicleService;

    public Ticket creatTicket(CreateTicketRequest createTicketRequest) {

        ParkingSpot AllotedparkingSpot = parkingSpotService.getSpots(createTicketRequest.getParkingLotId(),createTicketRequest.getVehicleType());

        if(AllotedparkingSpot==null){
            throw new RuntimeException();
        }

        parkingSpotService.update(AllotedparkingSpot);

        AllotedparkingSpot.setSpotStatus(SpotStatus.OCCUPIED);

        return Ticket.builder()
                .createdAt(new Date())
                .spotId(AllotedparkingSpot.getSpotId())
                .vehicle(vehicleService.fetchOrCreate(createTicketRequest.getVehicleType(),createTicketRequest.getVehicleNumber()))
                .build();



    }
}
