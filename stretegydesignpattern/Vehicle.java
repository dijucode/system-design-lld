package stretegydesignpattern;

public class Vehicle {


    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    void drive(){

        driveStrategy.drive();
    }
//    this drive capability might or might not be used by child classes
//    they will use their own implementation in their class
// there will be duplicacy of the codes
}
