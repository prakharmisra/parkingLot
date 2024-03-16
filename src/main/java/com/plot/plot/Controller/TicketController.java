package com.scalar.plot.Controller;


import com.scalar.plot.Model.Ticket;
import com.scalar.plot.Services.TicketService;
import com.scalar.plot.dtos.CreateTicketRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    TicketService ticketService;
    public Ticket createTicket(@RequestBody CreateTicketRequest createTicketRequest ){

        return   ticketService.creatTicket(createTicketRequest);

    }

}
