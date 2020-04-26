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
    private int seatsAvailable;
    private double pricePerSeat;
    private boolean smokingAllowed;
    private boolean chattyDriver;
    private boolean musicLover;
    private boolean luggageAllowed;
    private boolean petAllowed;

    public boolean isLuggageAllowed() {
        return luggageAllowed;
    }

    public void setLuggageAllowed(boolean luggageAllowed) {
        this.luggageAllowed = luggageAllowed;
    }

    public boolean isPetAllowed() {
        return petAllowed;
    }

    public void setPetAllowed(boolean petAllowed) {
        this.petAllowed = petAllowed;
    }
    private String description;

    public Trip(boolean isComplete, String datePosted, String departureAddress, String departureDateAndTime, 
            String arrivalAddress, String arrivalDateAndTime, double distanceKM, int seatsAvailable,
            double pricePerSeat, boolean luggageAllowed, boolean smokingAllowed, boolean petAllowed, boolean chattyDriver, boolean musicLover, String description) {
        this.isComplete = isComplete;
        this.datePosted = datePosted;
        this.departureAddress = departureAddress;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalAddress = arrivalAddress;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.distanceKM = distanceKM;
        this.seatsAvailable = seatsAvailable;
        this.pricePerSeat = pricePerSeat;
        this.luggageAllowed = luggageAllowed;
        this.smokingAllowed = smokingAllowed;
        this.petAllowed = petAllowed;
        this.chattyDriver = chattyDriver;
        this.musicLover = musicLover;
        this.description = description;
    }

    public int getTripID() {
        return tripID;
    }

    public int getDriverID() {
        return driverID;
    }

    public boolean isComplete() {
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

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean isChattyDriver() {
        return chattyDriver;
    }

    public void setChattyDriver(boolean chattyDriver) {
        this.chattyDriver = chattyDriver;
    }

    public boolean isMusicLover() {
        return musicLover;
    }

    public void setMusicLover(boolean musicLover) {
        this.musicLover = musicLover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
