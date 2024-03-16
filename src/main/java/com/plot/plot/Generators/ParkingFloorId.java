package com.scalar.plot.Generators;

import java.util.concurrent.atomic.AtomicLong;

public class ParkingFloorId {

    private static AtomicLong idCounter = new AtomicLong();

    public  static Long getnextId(){

       return idCounter.getAndIncrement();
    }
}
