package Parking.vehicle;

import static Parking.AppConstants.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String type, String licenseNo){
        Vehicle vehicle = null;
        if(type.equals(CAR)){
            vehicle = new Car(licenseNo);
        }else if(type.equals(MOTORCYCLE)){
            vehicle =  new MotorCycle(licenseNo);
        }else if(type.equals(TRUCK)){
            vehicle = new Truck(licenseNo);
        }

        return vehicle;
    }
}
