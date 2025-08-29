package elevatorsystem;

public class FixedFloorDispatcher extends ExternalButtonDispatcher{

    @Override
    public void submitRequest(ExternalButton externalButton) {
        // Fixed-Floor strategy: Elevator 1 serves floors 1-5, Elevator 2 serves floors 6-10
        // if (currentFloor >= 1 && currentFloor <= 5) {
        //     listElevatorController.get(0).handleRequest(currentFloor, externalButton);
        // } else if (currentFloor >= 6 && currentFloor <= 10) {
        //     listElevatorController.get(1).handleRequest(currentFloor, externalButton);
        // }
    }
}
