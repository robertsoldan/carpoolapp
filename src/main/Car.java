package main;

public class Car {
    private int carID;
    private int driverID;
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getCarID() {
        return carID;
    }

    public int getDriverID() {
        return driverID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
