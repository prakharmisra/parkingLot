package com.scalar.plot.dtos;


import lombok.Getter;

@Getter
public class CreateParkingLotRequest {


    private Integer noOffloor;

    private Integer noofspotsperfloor;


    private Integer noOfEntrygates;

    private  Integer noOfExitgates;

    private String name;

    private String address;

}
