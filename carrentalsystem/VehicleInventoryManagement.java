package carrentalsystem;

import java.util.List;

public class VehicleInventoryManagement {


    List<Vehicle> vehicles;

//    CRUD operations for vehicle
//    Add Vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
//    Remove Vehicle
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
//    Update Vehicle
    public void updateVehicle(Vehicle oldVehicle, Vehicle newVehicle) {
        int index = vehicles.indexOf(oldVehicle);
        if (index != -1) {
            vehicles.set(index, newVehicle);
        }
    }
//    Get Vehicle
    public Vehicle getVehicle(int vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.id == vehicleId) {
                return vehicle;
            }
        }
        return null;
    }


}
