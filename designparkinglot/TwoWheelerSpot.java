package designparkinglot;

public class TwoWheelerSpot extends ParkingSpot{
    int price = 10;


    public TwoWheelerSpot(int spotNumber, boolean isOccupied) {
        super(spotNumber, "TwoWheeler", isOccupied);
    }
}