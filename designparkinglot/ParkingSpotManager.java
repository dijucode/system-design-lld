package designparkinglot;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> list;

    ParkingStretegy parkingStretegy;

    ParkingSpotManager(List<ParkingSpot> list){
        this.list = list;
    }

    ParkingSpot findParkingSpot(ParkingStretegy parkingStretegy){
        return parkingStretegy.findParkingSpot(list);

    }
    void addParkingSpot(int parkingSpotId, String parkingSpotType){
        ParkingSpot parkingSpot = new ParkingSpot(parkingSpotId, parkingSpotType, false);

        list.add(parkingSpot);


    }
    void removeParkingSpot(){
//

    }
    void parkVehicle(){
//        logic to park vehicle


    }
    void removeVehicle(){

    }
}
// writing implemetation codes
// ParkingSpotManager will have a list of parking spots and a parking strategy
// findParkingSpot will use the parking strategy to find a parking spot from the list
// addParkingSpot will add a parking spot to the list
// removeParkingSpot will remove a parking spot from the list
// parkVehicle will mark a parking spot as occupied
// removeVehicle will mark a parking spot as empty
// ParkingStretegy will have a method findParkingSpot which will take a list of parking spots and return a parking spot
// DefaultParkingStretegy will implement the findParkingSpot method to return the first empty parking
// NearEntranceParkingStretegy will implement the findParkingSpot method to return the nearest empty parking spot to the entrance

