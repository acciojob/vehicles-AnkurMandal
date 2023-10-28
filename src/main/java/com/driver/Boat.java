package com.driver;

public class Boat extends Vehicle implements WaterVehicle {

    private final int capacity;
    public Boat(String name,int capacity) {
        super(name);
        this.capacity=capacity;
    }


    @Override
    public String getVehicleName() {

        return super.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }

}