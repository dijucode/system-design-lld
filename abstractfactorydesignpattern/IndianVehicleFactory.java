package abstractfactorydesignpattern;



public class IndianVehicleFactory implements VehicleFactory {
@Override
     public Car createCar(){
        return new IndianCar();
    }



    @Override
    public Bike createBike() {
        return new IndianBike();
    }
}

