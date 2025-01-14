package Parking;

import Parking.parkingSpot.ParkingSpot;
import Parking.vehicle.Car;
import Parking.vehicle.MotorCycle;
import Parking.vehicle.Truck;
import Parking.vehicle.Vehicle;

import java.util.HashMap;

import static Parking.AppConstants.*;

enum ParkingLot {
    INSTANCE;
//    private ParkingRate parkingRate;
    private final int numberOfExistDoor = 1;
    private final int numberOfEntranceDoor = 1;
    private final int numberOfFloors = 3;

    private int currentTicketId = 0;

    public int getNumberOfExistDoor() {
        return numberOfExistDoor;
    }

    public int getNumberOfEntranceDoor() {
        return numberOfEntranceDoor;
    }


    private HashMap<Integer, Entrance> entrances;
    private HashMap<Integer, Exit> exits;
    private HashMap<Integer, ParkingFloor> parkingFloors;

    // Create a hashmap that identifies all currently generated tickets using their ticket number
    private HashMap<Integer, ParkingTicket> tickets;


    ParkingLot() {
        entrances = new HashMap<>();
        exits = new HashMap<>();
        parkingFloors = new HashMap<>();
        tickets = new HashMap<>();
        // Call the name, address and parking_rate
        // Create initial entrance and exit hashmaps respectively
        for(int i = 0; i < numberOfEntranceDoor; i++){
            addEntrance(new Entrance(i+1));
        }
        for(int i = 0; i < numberOfExistDoor; i++){
            addExit(new Exit(i+1));
        }
        for(int i = 0; i < numberOfFloors; i++){
            addFloors(new ParkingFloor(i+1, 100));
        }
    }

    private boolean addEntrance(Entrance entrance){
        entrances.put(entrance.getId(), entrance);
        return true;
    }
    private boolean addExit(Exit exit){
        exits.put(exit.getId(), exit);
        return true;
    }
    private boolean addFloors(ParkingFloor parkingFloor){
        parkingFloors.put(parkingFloor.getId(), parkingFloor);
        return true;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle, int entranceGate) {
        ParkingSpot parkingSpot = getParkingSpot(vehicle);
        if(parkingSpot == null){
            System.out.println("Parking lot is full :(");
            return null;
        }

        currentTicketId++;
        ParkingTicket parkingTicket = entrances.get(entranceGate).getTicket(vehicle, currentTicketId);
        parkingSpot.setFree(false);
        parkingSpot.assignVehicle(vehicle);
        parkingTicket.setParkingSpot(parkingSpot);

        tickets.put(currentTicketId, parkingTicket);

        return parkingTicket;
    }

    private ParkingSpot getParkingSpot(Vehicle vehicle){
        String type = null;
        if(vehicle instanceof Car){
            type = COMPACT;
        }else if(vehicle instanceof Truck){
            type = LARGE;
        }else if(vehicle instanceof MotorCycle){
            type = TWO_WHEELER;
        }

        for(ParkingFloor parkingFloor: parkingFloors.values()){
            ParkingSpot parkingSpot = parkingFloor.getSpot(type);
            if(parkingSpot != null) return parkingSpot;
        }

        return null;
    }


    public boolean processExit(Vehicle vehicle, int exitGate){
        ParkingSpot parkingSpot = vehicle.getParkingTicket().getParkingSpot();
        parkingSpot.setFree(true);
        parkingSpot.setVehicle(null);
        System.out.println("Vehicle unparked. Making spot empty");

        Exit exit = exits.get(exitGate);
        exit.validateTicket(vehicle.getParkingTicket());

        return true;
    }

};
