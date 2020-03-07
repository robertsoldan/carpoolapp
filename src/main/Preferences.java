package main;

public class Preferences {
    private int preferenceID;
    private int tripsID;
    private int seatsAvailable;
    private double pricePerSeat;
    private boolean luggageAllowed;
    private boolean smokingAllowed;
    private boolean petAllowed;
    private boolean chattyDriver;
    private boolean musicLover;
    private String description;

    public Preferences(int seatsAvailable, double pricePerSeat, boolean luggageAllowed, boolean smokingAllowed, boolean petAllowed, boolean chattyDriver, boolean musicLover, String description) {
        this.seatsAvailable = seatsAvailable;
        this.pricePerSeat = pricePerSeat;
        this.luggageAllowed = luggageAllowed;
        this.smokingAllowed = smokingAllowed;
        this.petAllowed = petAllowed;
        this.chattyDriver = chattyDriver;
        this.musicLover = musicLover;
        this.description = description;
    }

    public int getPreferenceID() {
        return preferenceID;
    }

    public int getTripsID() {
        return tripsID;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public double getPricePerSeat() {
        return pricePerSeat;
    }

    public boolean isLuggageAllowed() {
        return luggageAllowed;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public boolean isPetAllowed() {
        return petAllowed;
    }

    public boolean isChattyDriver() {
        return chattyDriver;
    }

    public boolean isMusicLover() {
        return musicLover;
    }

    public String getDescription() {
        return description;
    }

    public void setPreferenceID(int preferenceID) {
        this.preferenceID = preferenceID;
    }

    public void setTripsID(int tripsID) {
        this.tripsID = tripsID;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public void setPricePerSeat(double pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public void setLuggageAllowed(boolean luggageAllowed) {
        this.luggageAllowed = luggageAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public void setPetAllowed(boolean petAllowed) {
        this.petAllowed = petAllowed;
    }

    public void setChattyDriver(boolean chattyDriver) {
        this.chattyDriver = chattyDriver;
    }

    public void setMusicLover(boolean musicLover) {
        this.musicLover = musicLover;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
