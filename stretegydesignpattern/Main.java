package stretegydesignpattern;

public class Main {

    public static void main(String[] args){

        Vehicle bus = new Vehicle(new NormalDrive());
        bus.drive();

        Vehicle suv = new Vehicle(new SportDrive());
        suv.drive();

        Vehicle thar = new Vehicle(new OffRoadDrive());
        thar.drive();
    }
}
