package Parking.vehicle;

import Parking.ParkingTicket;

public class Car extends Vehicle {
    Car(String licenseNo){
        setLicenseNo(licenseNo);
    }
    public void assignTicket(ParkingTicket ticket) {
        System.out.println("Assigned spot is: "+ ticket.getParkingSpot().getId());
        setParkingTicket(ticket);
        System.out.println("Parking..... 🚙🚙🚙");
    }
}
