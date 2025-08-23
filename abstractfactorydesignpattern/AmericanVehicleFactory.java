package abstractfactorydesignpattern;

public class AmericanVehicleFactory implements VehicleFactory {


    @Override
    public Car createCar(){
        return new AmericanCar();
    }

    @Override
    public Bike createBike() {
        return new AmericanBike();
    }
}
