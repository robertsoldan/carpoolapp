package main;

public class Users {
    private int userID;
    private String username;
    private String email;
    private String password;
    private String dateOfBirth;
    private String gender;
    private String avatar;
    private String registrationDate;
    private String bio;
    private int passengerTripsCount;
    private int driverTripsCount;

    public Users(String username, String email, String password, String dateOfBirth, String gender, String avatar, String bio, String registrationDate, int passengerTripsCount, int driverTripsCount) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.avatar = avatar;
        this.bio = bio;
        this.registrationDate = registrationDate;
        this.passengerTripsCount = passengerTripsCount;
        this.driverTripsCount = driverTripsCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public String getBio() {
        return bio;
    }

    public int getPassengerTripsCount() {
        return passengerTripsCount;
    }

    public int getDriverTripsCount() {
        return driverTripsCount;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPassengerTripsCount(int passengerTripsCount) {
        this.passengerTripsCount = passengerTripsCount;
    }

    public void setDriverTripsCount(int driverTripsCount) {
        this.driverTripsCount = driverTripsCount;
    }    
}
