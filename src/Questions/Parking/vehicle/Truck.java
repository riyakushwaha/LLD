package Questions.Parking.vehicle;

import Questions.Parking.ParkingTicket;

public class Truck extends Vehicle {

    Truck(String licenseNo){
        setLicenseNo(licenseNo);
    }
    public void assignTicket(ParkingTicket ticket) {
        System.out.println("Assigned spot is: "+ ticket.getParkingSpot().getId());
        setParkingTicket(ticket);
        System.out.println("Questions.Parking..... 🚚🚚🚚🚚");
    }
}
