package Questions.Parking;

import Questions.Parking.parkingSpot.Compact;
import Questions.Parking.parkingSpot.Large;
import Questions.Parking.parkingSpot.ParkingSpot;
import Questions.Parking.parkingSpot.TwoWheeler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Questions.Parking.AppConstants.*;

public class ParkingFloor {
    private int id;
    private int capacity = 100;

    private int row = 10;

    private int col = capacity/row;
    private DisplayBoard displayBoard;

    Map<String, List<ParkingSpot>> parkingSpots;

    ParkingFloor(int id, int capacity){
        this.id = id;
        this.capacity = capacity;
        displayBoard = new DisplayBoard(id);
        parkingSpots = new HashMap<>();
        setSpots();
    }

    private void setSpots(){
        String prefix = "F"+id;
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i = 0; i < 40; i++){
            parkingSpotList.add(new TwoWheeler(prefix+":"+"A"+i));
        }
        parkingSpots.put(TWO_WHEELER, parkingSpotList);

        parkingSpotList = new ArrayList<>();
        for(int i = 0; i < 40; i++){
            parkingSpotList.add(new Compact(prefix+":"+"B"+i));
        }
        parkingSpots.put(COMPACT, parkingSpotList);

        parkingSpotList = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            parkingSpotList.add(new Large(prefix+":"+"C"+i));
        }
        parkingSpots.put(LARGE, parkingSpotList);
    }

    public ParkingSpot getSpot(String type){
        List<ParkingSpot> parkingSpotList = parkingSpots.get(type);
        for(int i = 0; i < parkingSpotList.size(); i++){
            if(parkingSpotList.get(i).isFree()){
                return  parkingSpotList.get(i);
            }
        }

        return null;
    }

    public int getId() {
        return id;
    }
}
