package carpoolapp;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CarPoolDB {
    private String sqlQry;
    ArrayList<String> result;
    ArrayList<main.Bookings> bookings;
    
    
    public CarPoolDB() {
        sqlQry = new String();
        result = new ArrayList<String>();
    }
    
    // Add methods 
    
    public void addUser(main.Users u) {
        String username = u.getUsername();
        String email = u.getEmail();
        String password = u.getPassword();
        String dateOfBirth = u.getDateOfBirth();
        String gender = u.getGender();
        String avatar = u.getAvatar();
        String bio = u.getBio();
        String registrationDate = u.getRegistrationDate();
        int passengerTripsCount = u.getPassengerTripsCount();
        int driverTripsCount = u.getDriverTripsCount();
        
        String sqlStr = "INSERT INTO users VALUES(DEFAULT, "
                + "'" + username + "'" + ", "
                + "'" + email + "'" + ", "
                + "'" + password + "'" + ", "
                + "'" + dateOfBirth + "'" + ", "
                + "'" + gender + "'" + ", "
                + "'" + avatar + "'" + ", "
                + "'" + bio + "'" + ", "
                + "'" + registrationDate + "'" + ", "
                + passengerTripsCount + ", "
                + driverTripsCount
                + ")";
        execSql(sqlStr);
    }
    
    public void addPassenger(main.Passenger p) {
        int userID = p.getUserID();
        
        String sqlStr = "INSERT INTO passengers VALUES(DEFAULT, "
                + userID + ")";
        execSql(sqlStr);
    }
    
    public void addAdmin(main.Admin a) {
        int userID = a.getUserID();
        
        String sqlStr = "INSERT INTO admins VALUES(DEFAULT, "
                + userID + ")";
        execSql(sqlStr);
    }
    
    public void addDriver(main.Driver d) {
        int userID = d.getUserID();
        
        String sqlStr = "INSERT INTO drivers VALUES(DEFAULT, "
                + userID + "," + d.getRating() + ")";
        execSql(sqlStr);
    }
    
    public void addCar(main.Car c) {
        int driverID = c.getDriverID();
        String brand = c.getBrand();
        String model = c.getModel();
        int year = c.getYear();
        
        String sqlStr = "INSERT INTO cars VALUES(DEFAULT, "
                + driverID
                + "'" + brand + "', "
                + "'" + model + "', "
                + year
                + ")";
        
        execSql(sqlStr);
    }
    
    public void addTrip(main.Trip t) {
        int driverID = t.getDriverID();
        boolean isComplete = t.isComplete();
        String datePosted = t.getDatePosted();
        String departureAddress = t.getDepartureAddress();
        String departureDateAndTime = t.getDepartureDateAndTime();
        String arrivalAddress = t.getArrivalAddress();
        String arrivalDateAndTime = t.getArrivalDateAndTime();
        double distanceKM = t.getDistanceKM();
        int seatsAvailable = t.getSeatsAvailable();
        double pricePerSeat = t.getPricePerSeat();
        boolean luggageAllowed = t.isLuggageAllowed();
        boolean smokingAllowed = t.isSmokingAllowed();
        boolean petAllowed = t.isPetAllowed();
        boolean chattyDriver = t.isChattyDriver();
        boolean musicLover = t.isMusicLover();
        String description = t.getDescription();
        
        String sqlStr = "INSERT INTO trips VALUES(DEFAULT, "
                + driverID + ", "
                + isComplete + ", "
                + "'" + datePosted + "', "
                + "'" + departureAddress + "', "
                + "'" + departureDateAndTime + "', "
                + "'" + arrivalAddress + "', "
                + "'" + arrivalDateAndTime + "', "
                + distanceKM + ","
                + seatsAvailable + ","
                + pricePerSeat + ","
                + luggageAllowed + ","
                + smokingAllowed + ","
                + petAllowed + ","
                + chattyDriver + ","
                + musicLover + ","
                + "'" + description + "'"
                + ");";
        
        execSql(sqlStr);
    }
        
    public void addBooking(main.Bookings b) {
        
        if(getSeatsAvailable(b.getTripsID()) > 0) {
            
            int passengerID = b.getPassengerID();
            int tripID = b.getTripsID();
            String status = b.getStatus();

            String sqlStr = "INSERT INTO bookings VALUES(DEFAULT, "
                    + passengerID + ", "
                    + tripID + ", "
                    + "'" + status + "'"
                    + ")";
            execSql(sqlStr);
            decrementSeatsAvailable(tripID);
        }
    }
    
    public void addPreferences(main.Preferences p) {
        int tripsID = p.getTripsID();
        int seatsAvailable = p.getSeatsAvailable();
        double pricePerSeat = p.getPricePerSeat();
        boolean luggageAllowed = p.isLuggageAllowed();
        boolean smokingAllowed = p.isSmokingAllowed();
        boolean petAllowed = p.isPetAllowed();
        boolean chattyDriver = p.isChattyDriver();
        boolean musicLover = p.isMusicLover();
        String description = p.getDescription();
        
        String sqlStr = "INSERT INTO preferences VALUES(DEFAULT, "
                + tripsID + ", "
                + seatsAvailable + ", "
                + pricePerSeat + ", "
                + luggageAllowed + ", "
                + smokingAllowed + ", "
                + petAllowed + ", "
                + chattyDriver + ", "
                + musicLover + ", "
                + "'" + description + "'"
                + ");";
        
        execSql(sqlStr);
    }
        
    public void incrementSeatsAvailable(int tripId) {
        int currentSeats = getSeatsAvailable(tripId);
        int newSeats = currentSeats + 1;
        
        try {
            String query = "UPDATE trips SET seatsAvailable = '" + newSeats + "' WHERE tripID ='" + tripId +"';";
            PreparedStatement pst = getConnection().prepareStatement(query);
     
            pst.executeUpdate();
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
    }
    
    public void decrementSeatsAvailable(int tripId) {
        int currentSeats = getSeatsAvailable(tripId);
        int newSeats = currentSeats - 1;
        
        try {
            String query = "UPDATE trips SET seatsAvailable = '" + newSeats + "' WHERE tripID ='" + tripId +"';";
            PreparedStatement pst = getConnection().prepareStatement(query);
     
            pst.executeUpdate();
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
    }
    
    public void cancelBooking(main.Bookings b) {
        int bookingID = b.getBookingID();
        int tripID = b.getTripsID();
        
        String sqlStr = "DELETE FROM bookings WHERE bookingID='" + bookingID + "';";
        execSql(sqlStr);
        incrementSeatsAvailable(tripID);
    }
    // -------------------------------------------------------------------------------------------------
    
    // Execute query method
    private void execSql(String command) {
        String sqlCmd = command;
        try {
            PreparedStatement pst = getConnection().prepareStatement(sqlCmd);
            pst.executeUpdate();
            pst.getConnection().close();
            pst.close();
            getConnection().close();
            System.out.println("Did it :)");
        } catch(URISyntaxException uriex) {
            System.out.println(uriex);
        } catch(SQLException sqlex) {
            System.out.println(sqlex);
        }
    }
    
    // -------------------------------------------------------------------------------------------------

    // Get methods
    
    // Get user upon login -- pass email and password, get a user object
    public main.Users getUser(String email, String password) {
        main.Users u = new main.Users("null", "null", "null", "null", "null", "null", "null", "null", 0, 0);
        
        try {
            String query = "SELECT * FROM users WHERE email='" + email + "' AND password='" + password + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                int userId = rs.getInt("userID");
                String username = rs.getString("username");
                String emailAddress = rs.getString("email");
                String passwd = rs.getString("password");
                String dateOfBirth = rs.getString("dateOfBirth");
                String gender = rs.getString("gender");
                String avatar = rs.getString("avatar");
                String bio = rs.getString("bio");
                String registrationDate = rs.getString("registrationDate");
                int passengerTripsCount = rs.getInt("passengerTripsCount");
                int driverTripsCount = rs.getInt("driverTripsCount");
                
                u = new main.Users(username, email, password, dateOfBirth, gender, avatar, bio, registrationDate, passengerTripsCount, driverTripsCount);
                
                u.setUserID(userId);
                
            }
        } catch(URISyntaxException uriex) {
            System.out.println(uriex);
        } catch(SQLException sqlex) {
            System.out.println(sqlex);
        }
        return u;
    }
    
    // Get bookings of user -- pass email as argument, return arraylist of bookings object
    public ArrayList<main.Bookings> getBookings(String email) {
        bookings = new ArrayList<main.Bookings>();
        
        try {
            String query = "SELECT * FROM bookings WHERE email='" + email + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Bookings b = new main.Bookings(null);
                b.setBookingID(0);
                b.setPassengerID(0);
                b.setTripsID(0);
                int bookingID = rs.getInt("bookingID");
                int passengerID = rs.getInt("passengerID");
                int tripsID = rs.getInt("tripsID");
                String status = rs.getString("status");
                b.setBookingID(bookingID);
                b.setPassengerID(passengerID);
                b.setTripsID(tripsID);
                b.setStatus(status);
                
                bookings.add(b);
              }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return bookings;
    }
    
    // Get the driver by userID -- pass the userId as int, get a Driver object
    public main.Driver getDriverByUserID(int user) {
        main.Driver d = new main.Driver();
        d.setDriverID(0);
        d.setRating(0);
        d.setUserID(0);
        
        try {
            String query = "SELECT * FROM drivers WHERE userID='" + user + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                int driverID = rs.getInt("driverID");
                int userID = rs.getInt("userID");
                double rating = rs.getDouble("rating");
                
                d.setDriverID(driverID);
                d.setUserID(userID);
                d.setRating(rating);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return d;
    }
    
    // Get driver by driver id -- pass the driverID as a int, get a Driver object
    public main.Driver getDriverByDriverID(int driver) {
        main.Driver d = new main.Driver();
        d.setDriverID(0);
        d.setRating(0);
        d.setUserID(0);
        
        try {
            String query = "SELECT * FROM drivers WHERE driverID='" + driver + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                int driverID = rs.getInt("driverID");
                int userId = rs.getInt("userID");
                double rating = rs.getDouble("rating");
                
                d.setDriverID(driverID);
                d.setUserID(userId);
                d.setRating(rating);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return d;
    }
    
    // Get drivers with a minimum rating of -- pass rating as an int, get array list of Driver objects
    public ArrayList<main.Driver> getDriverByRating(int ratingValue) {
        
        
        ArrayList<main.Driver> dList = new ArrayList<main.Driver>();
        
        try {
            String query = "SELECT * FROM drivers WHERE rating>='" + ratingValue + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Driver d = new main.Driver();
                d.setDriverID(0);
                d.setRating(0);
                d.setUserID(0);
                int driverID = rs.getInt("driverID");
                int userId = rs.getInt("userID");
                double rating = rs.getDouble("rating");
                
                d.setDriverID(driverID);
                d.setUserID(userId);
                d.setRating(rating);
                
                dList.add(d);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return dList;
    }
    
    // Get car by carID -- pass the carID as int, get Car object
    public main.Car getCarByCarID(int car) {
        main.Car c = new main.Car(null, null, 0);
        
        try {
            String query = "SELECT * FROM cars WHERE carID='" + car + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                int carID = rs.getInt("carID");
                int driverID = rs.getInt("driverID");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                
                c.setCarID(carID);
                c.setDriverID(driverID);
                c.setBrand(brand);
                c.setModel(model);
                c.setYear(year);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return c;
    }
    
    // Get car by DriverID -- pass the driverID as int, get array list of Car object
    public ArrayList<main.Car> getCarsByDriverID(int driver) {
        ArrayList<main.Car> cList = new ArrayList<main.Car>();
        
        try {
            String query = "SELECT * FROM cars WHERE driverID='" + driver + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Car c = new main.Car(null, null, 0);
                int carID = rs.getInt("carID");
                int driverID = rs.getInt("driverID");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                
                c.setCarID(carID);
                c.setDriverID(driverID);
                c.setBrand(brand);
                c.setModel(model);
                c.setYear(year);
                
                cList.add(c);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return cList;
    }
    
    // Get car by minimum year -- pass the minimum year as int, get array list of Car object
    public ArrayList<main.Car> getCarsByYear(int minYear) {
        ArrayList<main.Car> cList = new ArrayList<main.Car>();
        
        try {
            String query = "SELECT * FROM cars WHERE year>='" + minYear + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Car c = new main.Car(null, null, 0);
                int carID = rs.getInt("carID");
                int driverID = rs.getInt("driverID");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                
                c.setCarID(carID);
                c.setDriverID(driverID);
                c.setBrand(brand);
                c.setModel(model);
                c.setYear(year);
                
                cList.add(c);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return cList;
    }
    
    // Get a list of trips by driver id ( to be displayed in a drivers profile) -- pass the driverID as int
    public ArrayList<main.Trip> getTripsByDriverId(int driverId) {
        ArrayList<main.Trip> tList = new ArrayList<main.Trip>();
        
        try {
            String query = "SELECT * FROM trips WHERE driverID>='" + driverId + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Trip t = new main.Trip(true, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, null);
                t.setIsComplete(rs.getBoolean("isComplete"));
                t.setDatePosted(rs.getString("datePosted"));
                t.setDepartureDateAndTime(rs.getString("departureDateAndTime"));
                t.setArrivalAddress(rs.getString("arrivalAddress"));
                t.setDistanceKM(rs.getDouble("distanceKM"));
                t.setSeatsAvailable(rs.getInt("seatsAvailable"));
                t.setPricePerSeat(rs.getDouble("pricePerSeat"));
                t.setLuggageAllowed(rs.getBoolean("luggageAllowed"));
                t.setSmokingAllowed(rs.getBoolean("smokingAllowed"));
                t.setPetAllowed(rs.getBoolean("petAllowed"));
                t.setChattyDriver(rs.getBoolean("chattyDriver"));
                t.setMusicLover(rs.getBoolean("musicLover"));
                t.setDescription(rs.getString("description"));
                
                tList.add(t);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return tList;
    }
    
    // Get a list of trips using a search argument -- pass the argType as either ADDRESS, DATE or ADDRESS+DATE;
    // !!!!! MAKE SURE THAT IN THE FRONT-END YOU ELIMINATE ANY POSSIBLE "+" CHARACTERS INPUT BY THE USER, THEN CONCAT THE TWO ADDRESS + DATE WITH A "+" BETWEEN THE TWO
    // !!!!! FOR EXAMPLE: PATRICK'S ROAD 22, DUBLIN3+14/04/2020
    public ArrayList<main.Trip> searchTripsByArgument(String argType, String searchTerm) {
        ArrayList<main.Trip> tList = new ArrayList<main.Trip>();
        String date;
        String address;
        
        try {
            String query;
            
            switch(argType) {
                case "ADDRESS": query = "SELECT * FROM trips WHERE departureAddress LIKE %'" + searchTerm + "'%;";
                break;
                case "DATE": query = "SELECT * FROM trips WHERE departUreDateAndTime LIKE %'" + searchTerm + "'%;";
                break;
                case "ADDRESS+DATE": 
                    String[] datePlusAddress = searchTerm.split("\\+");
                    date = datePlusAddress[0];
                    address = datePlusAddress[1];
                    query = "SELECT * FROM trips WHERE departureAddress LIKE %'" + address + "'% AND departUreDateAndTime LIKE %'" + date + "'%;";
                break;
                default: query = "SELECT * FROM trips;";
            }
            
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                main.Trip t = new main.Trip(true, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, null);
                t.setIsComplete(rs.getBoolean("isComplete"));
                t.setDatePosted(rs.getString("datePosted"));
                t.setDepartureDateAndTime(rs.getString("departureDateAndTime"));
                t.setArrivalAddress(rs.getString("arrivalAddress"));
                t.setDistanceKM(rs.getDouble("distanceKM"));
                t.setSeatsAvailable(rs.getInt("seatsAvailable"));
                t.setPricePerSeat(rs.getDouble("pricePerSeat"));
                t.setLuggageAllowed(rs.getBoolean("luggageAllowed"));
                t.setSmokingAllowed(rs.getBoolean("smokingAllowed"));
                t.setPetAllowed(rs.getBoolean("petAllowed"));
                t.setChattyDriver(rs.getBoolean("chattyDriver"));
                t.setMusicLover(rs.getBoolean("musicLover"));
                t.setDescription(rs.getString("description"));
                
                tList.add(t);
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return tList;
    }
    
    // Get the available seats remaining for a trip
    public int getSeatsAvailable(int tripId) {
        int seats = 0;
        
        try {
            String query = "SELECT * FROM trips WHERE tripID='" + tripId + "';";
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                seats = rs.getInt("seatsAvailable");
            }
            
            } catch(URISyntaxException uriex) {
                System.out.println(uriex);
            } catch(SQLException sqlex) {
                System.out.println(sqlex);
            }
        
        return seats;
    }
    
    
    
    // -------------------------------------------------------------------------------------------------
    
    public ArrayList<String> query(String query) {
        sqlQry = query;
        
        try {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sqlQry);
            
            while(rs.next()) {
                int userId = rs.getInt("userID");
                String userName = rs.getString("username");

                String res = userId + " - " + userName;
                result.add(res);
            }
            stmt.close();
            getConnection().close();
        }catch(URISyntaxException uriex) {
            System.out.println(uriex);
        } catch(SQLException sqlex) {
            System.out.println(sqlex);
        }
        
        return result;
    }
    
    
    
    
    
    
    public void testDB() {
        // TODO code application logic here
        try{
            String sqlSt = "select column_name,data_type from information_schema.columns where table_name = 'trips';";
            //String sql = "ALTER TABLE users  ALTER COLUMN username DROP UNIQUE;";
            /*
            String sql = "ALTER TABLE trips "
                             
                

                + "ADD COLUMN seatsAvailable integer NOT NULL,"
                + "ADD COLUMN pricePerSeat NUMERIC NOT NULL,"
                + "ADD COLUMN luggageAllowed boolean NOT NULL,"
                + "ADD COLUMN smokingAllowed boolean NOT NULL,"
                + "ADD COLUMN petAllowed boolean NOT NULL,"
                + "ADD COLUMN chattyDriver boolean NOT NULL,"
                + "ADD COLUMN musicLover boolean NOT NULL,"
                + "ADD COLUMN description varchar(255) NOT NULL" 
                
                          
                + ";";
            PreparedStatement pst = getConnection().prepareStatement(sql);
     
            pst.executeUpdate();
            */
            
        
        Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sqlSt);
       
        while(rs.next()) {
            System.out.println(rs.getString(1));
           
            
        } 
       
       // System.out.println(getConnection().);
        } catch(URISyntaxException uriex) {
            System.out.println(uriex);
        } catch(SQLException sqlex) {
            System.out.println(sqlex);
        }
       
       
    }
   
    private static Connection getConnection() throws URISyntaxException, SQLException {
    URI dbUri = new URI("postgres://fxbrdsvibsvzxl:16dd1dc1d1ae937d25a9d70dfcc93125947dfbe2ea55a961420ced0cb9809504@ec2-54-247-188-107.eu-west-1.compute.amazonaws.com:5432/d7355rirsdn4vp");
 
    String username = dbUri.getUserInfo().split(":")[0];
    String password = dbUri.getUserInfo().split(":")[1];
    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
 
    return DriverManager.getConnection(dbUrl, username, password);
}

}



// Initial database setup
//cpdb.doStuff("DROP TABLE users, passengers, drivers, cars, trips, bookings, preferences;");
        
        /**
        -- USERS SETTER AND GETTER DONE
        cpdb.doStuff("CREATE TABLE users(userID SERIAL PRIMARY KEY, "
                + "username varchar(40) UNIQUE NOT NULL, "
                + "email varchar(40) UNIQUE NOT NULL, "
                + "password varchar(40) NOT NULL, "
                + "dateOfBirth varchar(10) NOT NULL,"
                + "gender varchar(10) NOT NULL,"
                + "avatar varchar(255),"
                + "bio varchar(255),"
                + "registrationDate varchar(10) NOT NULL, "
                + "passengerTripsCount integer NOT NULL, "
                + "driverTripsCount integer NOT NULL)");
        
        -- PASSENGERS SETTER DONE -- NO GETTER
        cpdb.doStuff("CREATE TABLE passengers(passengerID SERIAL PRIMARY KEY, "
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE)");
        
        -- DRIVERS SETTER AND GETTERS DONE
        cpdb.doStuff("CREATE TABLE drivers(driverID SERIAL PRIMARY KEY,"
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE,"
                + "rating NUMERIC NOT NULL)");
        
        -- ADMINS SETTER DONE
        cpdb.doStuff("CREATE TABLE admins(adminID SERIAL PRIMARY KEY,"
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE"
                + ")");
               
          
        -- CARS SETTER AND GETTER DONE
        cpdb.doStuff("CREATE TABLE cars(carID SERIAL PRIMARY KEY, "
                + "driverID integer REFERENCES drivers(driverID) ON DELETE CASCADE,"
                + "brand varchar(40) NOT NULL,"
                + "model varchar(40) NOT NULL,"
                + "year integer NOT NULL"
                + ")");     
        
        cpdb.doStuff("CREATE TABLE trips("
                + "tripID SERIAL PRIMARY KEY,"
                + "driverID integer REFERENCES drivers(driverID),"
                + "isComplete boolean DEFAULT FALSE,"
                + "datePosted varchar(10) NOT NULL,"
                + "departureAddress varchar(255) NOT NULL,"
                + "departureDateAndTime varchar(16) NOT NULL,"
                + "arrivalAddress varchar(255) NOT NULL,"
                + "arrivalDateAndTime varchar(16) NOT NULL,"
                + "distanceKM NUMERIC NOT NULL"
                + ")");  
        
        -- BOOKINGS SETTER AND GETTER DONE
        cpdb.doStuff("CREATE TABLE bookings("
                + "bookingID SERIAL PRIMARY KEY,"
                + "passengerID integer REFERENCES passengers(passengerID),"
                + "tripsID integer REFERENCES trips(tripID),"
                + "status varchar(40) NOT NULL"          
                + ")");
                    
        cpdb.doStuff("CREATE TABLE preferences("
                + "preferenceID SERIAL PRIMARY KEY,"
                + "tripsID integer REFERENCES trips(tripID),"
                + "seatsAvailable integer NOT NULL,"
                + "pricePerSeat NUMERIC NOT NULL,"
                + "luggageAllowed boolean NOT NULL,"
                + "smokingAllowed boolean NOT NULL,"
                + "petAllowed boolean NOT NULL,"
                + "chattyDriver boolean NOT NULL,"
                + "musicLover boolean NOT NULL,"
                + "description varchar(255) NOT NULL"           
                + ")");
        
       **/
        
        
                
                
                
        //---------------------------------------------------------------------------------------
        /**
        cpdb.doStuff("INSERT INTO users "
                + "VALUES ("
                + "DEFAULT,"
                + "'robb', "
                + "'robb@gmail.com',"
                + "'noooone',"
                + "'10-10-1987',"
                + "'male',"
                + "'http://ccc.com/avatar.png',"
                + "'just meee',"
                + "'20-12-2019',"
                + "1,"
                + "0)");
                
        cpdb.doStuff("INSERT INTO users VALUES ("
                + "2, "
                + "'andrew', "
                + "'andyand@gmail.com',"
                + "'pieesss',"
                + "'11-04-2018',"
                + "3,"
                + "0)");
        
        cpdb.doStuff("INSERT INTO users VALUES ("
                + "3, "
                + "'buns', "
                + "'bunnies@gmail.com',"
                + "'babyrabbits',"
                + "'02-02-2018',"
                + "6,"
                + "9)");
        
        
        cpdb.doStuff("INSERT INTO passengers VALUES(1, 2)");
        cpdb.doStuff("INSERT INTO passengers VALUES(2, 1)");
        cpdb.doStuff("INSERT INTO passengers VALUES(3, 3)");
        
        
        
        cpdb.doStuff("INSERT INTO users VALUES ("
                + "4, "
                + "'Ovidiu', "
                + "'ovidiub@gmail.com',"
                + "'bestborhan',"
                + "'21-12-2018',"
                + "2,"
                + "0)");
                 
        **/