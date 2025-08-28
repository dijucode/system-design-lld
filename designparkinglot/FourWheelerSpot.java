package designparkinglot;

public class FourWheelerSpot extends ParkingSpot {

    int price = 20;


    public FourWheelerSpot(int spotNumber, boolean isOccupied) {
        super(spotNumber, "FourWheeler", isOccupied);
    }
}
