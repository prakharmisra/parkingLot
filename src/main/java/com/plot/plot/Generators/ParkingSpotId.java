package com.scalar.plot.Generators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ParkingSpotId {

    private static AtomicInteger idCounter = new AtomicInteger();

    public static int nextId(){

       return idCounter.getAndIncrement();
    }
}
