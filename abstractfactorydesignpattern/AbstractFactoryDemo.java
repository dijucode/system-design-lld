package abstractfactorydesignpattern;

public class AbstractFactoryDemo {

    public static void main(String[] args){
        // Get Indian Factory
        VehicleFactory indianVehicleFactory = FactoryProducer.getFactory("India");
        Car indianCar = indianVehicleFactory.createCar();
        Bike indianBike = indianVehicleFactory.createBike();

        indianCar.drive();
        indianBike.ride();

//        Get American Bike
        VehicleFactory americanVehicleFactory = FactoryProducer.getFactory("America");
        Car americanCar = americanVehicleFactory.createCar();
        Bike americanBike = americanVehicleFactory.createBike();
        americanCar.drive();
        americanBike.ride();

    }
}
