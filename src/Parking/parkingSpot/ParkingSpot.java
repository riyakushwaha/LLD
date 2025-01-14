package Parking.parkingSpot;

import Parking.vehicle.Vehicle;

public class ParkingSpot {
    private String id;
    private boolean isFree = true;

    private Vehicle vehicle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public ParkingSpot() {
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public boolean assignVehicle(Vehicle vehicle){
        setVehicle(vehicle);
        return true;
    };
    public boolean removeVehicle(){
        return !isFree;
    }
}





