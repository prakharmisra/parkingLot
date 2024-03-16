package com.scalar.plot.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Date;



@Getter
@SuperBuilder
public class Ticket extends BaseModel{

    private Vehicle vehicle;

    private Date entryTime;

    private int spotId;

    private EntryGate entryGate;

    private Operator entryOperator;



}
