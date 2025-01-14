package Parking.parkingSpot;

import Parking.vehicle.Vehicle;

public class TwoWheeler extends ParkingSpot {
    public TwoWheeler(String id) {
        setId(id);
    }

    public boolean assignVehicle(Vehicle vehicle) {
        // definition
        return false;
    }
}

