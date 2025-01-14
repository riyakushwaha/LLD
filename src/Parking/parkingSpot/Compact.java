package Parking.parkingSpot;


import Parking.vehicle.Vehicle;

public class Compact extends ParkingSpot {

    public Compact(String id) {
        setId(id);
    }
    public boolean assignVehicle(Vehicle vehicle) {
        // definition
        return false;
    }
}