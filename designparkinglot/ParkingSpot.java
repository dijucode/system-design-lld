package designparkinglot;

public class ParkingSpot {

    ParkingSpot(int id, String parkingSpotType, boolean isOccupied){
        this.id = id;
        this.parkingSpotType = parkingSpotType;
        this.isOccupied = false;
    }


// represents a parking spot
    int id;
    boolean isOccupied;
    String parkingSpotType; // two wheeler, four wheeler, heavy vehicle


    public boolean isEmpty(){
        return !isOccupied;
    }





}
