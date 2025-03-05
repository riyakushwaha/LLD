package Questions.Parking;

import Questions.Parking.parkingSpot.ParkingSpot;
import Questions.Parking.vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkingTicket {
    private int ticketNo;
    private LocalDateTime timestamp;

    // Following are the instances of their respective classes
    private Vehicle vehicle;

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    private ParkingSpot parkingSpot;

    ParkingTicket(int ticketNo, Vehicle vehicle){
        this.ticketNo = ticketNo;
        this.vehicle = vehicle;
        this.timestamp = LocalDateTime.now();
    }
}