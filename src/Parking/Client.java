package Parking;

import Parking.vehicle.Car;
import Parking.vehicle.Vehicle;
import Parking.vehicle.VehicleFactory;

import static Parking.AppConstants.*;

public class Client{
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.INSTANCE;

        Runnable runnable = () -> {
            String type = getTypeOfVehicle();
            VehicleFactory vehicleFactory = new VehicleFactory();
            Vehicle currVehicle =  vehicleFactory.getVehicle(type, "KA-01-1234");

            int entrances = parkingLot.getNumberOfEntranceDoor();

            int userEntranceGateNumber = (int)Math.ceil(Math.random()*entrances);


            ParkingTicket parkingTicket = parkingLot.getParkingTicket(currVehicle, userEntranceGateNumber);
            if(parkingTicket != null){
                currVehicle.assignTicket(parkingTicket);

                try {

                    Thread.sleep(5000); // Sleep for 2 seconds

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

                int exits = parkingLot.getNumberOfExistDoor();

                int userExitGateNumber = (int)Math.ceil(Math.random()*exits);

                parkingLot.processExit(currVehicle, userExitGateNumber);
            }
        };

        for(int i = 0; i < 400; i++){
            new Thread(runnable).start();
        }

    }

    private static String getTypeOfVehicle() {
        int num = (int)Math.ceil(Math.random()*4);
        String type = null;

        if(num == 1){
            type = CAR;
        }else if(num == 2){
            type = TRUCK;
        }else {
            type = MOTORCYCLE;
        }

        return type;
    }


}
