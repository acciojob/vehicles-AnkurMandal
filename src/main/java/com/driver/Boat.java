package com.driver;

public class Boat extends Vehicle implements WaterVehicle {

    public Boat(String name) {
        super(name);
    }

    @Override
    public String getVehicleName() {

        return super.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return super.getCapacity();
    }
}