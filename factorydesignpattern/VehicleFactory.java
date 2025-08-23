package factorydesignpattern;

import java.util.Locale;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        return switch (type.toLowerCase()){
            case "car" -> new Car();
            case "bike" -> new Bike();
            default -> throw new IllegalArgumentException(" No Such Vehicle Available named :" + type);
        };
    }
}



