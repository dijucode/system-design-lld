package carrentalsystem;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    String startDate;
    Long startTime;
    String endDate;
    Long endTime;
    ReservationStatus reservationStatus;
    Location location;
}
