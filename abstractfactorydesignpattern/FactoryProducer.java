package abstractfactorydesignpattern;

public class FactoryProducer {

    public static VehicleFactory getFactory(String region){
        if(region=="India") return new IndianVehicleFactory();
        else if(region=="America") return new AmericanVehicleFactory();
        else throw new IllegalArgumentException(" Not in option: choose between India and America");
    }
}
