package Parking.vehicle;

import Parking.ParkingTicket;

public class MotorCycle extends Vehicle {

    MotorCycle(String license){
        setLicenseNo(license);
    }
    public void assignTicket(ParkingTicket ticket) {
        System.out.println("Assigned spot is: "+ ticket.getParkingSpot().getId());
        setParkingTicket(ticket);
        System.out.println("Parking.....🏍️🏍️🏍️");
    }
}
