package factorydesignpattern;

public class FactoryDemo {

    public static void main(String[] args){
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        v2.drive();
    }

}
