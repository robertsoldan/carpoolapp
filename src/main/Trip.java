package main;

public class Trip {
    private int tripID;
    private int driverID;
    private boolean isComplete;
    private String datePosted;
    private String departureAddress;
    private String departureDateAndTime;
    private String arrivalAddress;
    private String arrivalDateAndTime;
    private double distanceKM;

    public Trip(boolean isComplete, String datePosted, String departureAddress, String departureDateAndTime, String arrivalAddress, String arrivalDateAndTime, double distanceKM) {
        this.isComplete = isComplete;
        this.datePosted = datePosted;
        this.departureAddress = departureAddress;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalAddress = arrivalAddress;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.distanceKM = distanceKM;
    }

    public int getTripID() {
        return tripID;
    }

    public int getDriverID() {
        return driverID;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public String getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public String getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public double getDistanceKM() {
        return distanceKM;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public void setDepartureDateAndTime(String departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public void setArrivalDateAndTime(String arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public void setDistanceKM(double distanceKM) {
        this.distanceKM = distanceKM;
    }
    
    
}
