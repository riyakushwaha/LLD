package Parking.parkingSpot;


import Parking.vehicle.Vehicle;

public class Large extends ParkingSpot {
    public Large(String id) {
        setId(id);
    }
    public boolean assignVehicle(Vehicle vehicle) {
        // definition
        return false;
    }
}