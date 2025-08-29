package carrentalsystem;

public class BikeInventoryManagement extends VehicleInventoryManagement{
    @Override
    public void addVehicle(Vehicle vehicle) {
        if (vehicle instanceof Bike) {
            super.addVehicle(vehicle);
        } else {
            System.out.println("Only bikes can be added to the bike inventory.");
        }
    }

}
