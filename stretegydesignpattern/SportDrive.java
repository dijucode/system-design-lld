package stretegydesignpattern;

public class SportDrive implements DriveStrategy {

    @Override
    public void drive(){
//        SportDriveLogic
        System.out.println("Driving like a sports car !!");
    }
}
