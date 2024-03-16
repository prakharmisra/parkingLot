package com.scalar.plot.Model;

import com.scalar.plot.Model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;




@SuperBuilder
@Getter
@Setter


public class ParkingLot extends BaseModel {

 private List<ParkingFloor> floorList = new ArrayList<>();

 private List<EntryGate> entrygates = new ArrayList<>();

 private List<ExitGate> exitgates = new ArrayList<>();

 private  String name;

 private String address;

 private DisplayBoard displayBoard;



}
