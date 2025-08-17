package com.driver;

public class Boat {

    private String name;
    private int capacity;

    public Boat(String _name, int _capacity) {
        this.name=_name;
        this.capacity=_capacity;
    }

    public String getVehicleName(int direction){

        return name;
    }

    public int  getVehicleCapacity(int speed, int direction){
        return capacity;
       
    }

    

}
