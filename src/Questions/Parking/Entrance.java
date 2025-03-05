package Questions.Parking;

import Questions.Parking.vehicle.Vehicle;

public class Entrance {
    // Data members
    private int id;

    public Entrance(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Member function
    public ParkingTicket getTicket(Vehicle vehicle, int ticketId){
        return new ParkingTicket(ticketId ,vehicle);
    }
}
