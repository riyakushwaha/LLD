package Parking.vehicle;

import Parking.ParkingTicket;

// Vehicle is an abstract class
public abstract class Vehicle {
    private String licenseNo;
    private ParkingTicket parkingTicket;

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public void setLicenseNo(String licenseNo){
        this.licenseNo = licenseNo;
    }

    public abstract void assignTicket(ParkingTicket ticket);
}

