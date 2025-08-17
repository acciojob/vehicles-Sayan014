package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

    public Boat(String _name, int _capacity) {
        this.name=_name;
        this.capacity=_capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
            return this.capacity;
        }

    

}
