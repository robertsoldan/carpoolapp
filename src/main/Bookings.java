package main;

public class Bookings {
    private int bookingID;
    private int passengerID;
    private int tripsID;
    private String status;

    public Bookings(int passID, int tripID, String status) {
        this.status = status;
        this.passengerID = passID;
        this.tripsID = tripID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public int getTripsID() {
        return tripsID;
    }

    public String getStatus() {
        return status;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public void setTripsID(int tripsID) {
        this.tripsID = tripsID;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
