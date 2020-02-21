package main;

public class Driver {
   private int driverID;
   private int userID;
   private double rating;

    public Driver() {
        driverID = 0;
    }

    public int getDriverID() {
        return driverID;
    }

    public int getUserID() {
        return userID;
    }

    public double getRating() {
        return rating;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
