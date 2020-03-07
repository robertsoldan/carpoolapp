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
        int userID = d.getDriverID();
        
        String sqlStr = "INSERT INTO drivers VALUES(DEFAULT, "
                + userID + ")";
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
        
        String sqlStr = "INSERT INTO trips VALUES(DEFAULT, "
                + driverID + ", "
                + isComplete + ", "
                + "'" + datePosted + "', "
                + "'" + departureAddress + "', "
                + "'" + departureDateAndTime + "', "
                + "'" + arrivalAddress + "', "
                + "'" + arrivalDateAndTime + "', "
                + distanceKM
                + ");";
        
        execSql(sqlStr);
    }
        
    public void addBooking(main.Bookings b) {
        int passengerID = b.getPassengerID();
        int tripID = b.getTripsID();
        String status = b.getStatus();
        
        String sqlStr = "INSERT INTO bookings VALUES(DEFAULT, "
                + passengerID + ", "
                + tripID + ", "
                + "'" + status + "'"
                + ")";
        execSql(sqlStr);
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
            String sqlSt = "SELECT * FROM Grades;";
            //String sql = "INSERT INTO Grades VALUES(12, 99);";
            //PreparedStatement pst = getConnection().prepareStatement(sql);
     
            //pst.executeUpdate();
        Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(sqlSt);
       
        while(rs.next()) {
            int id = rs.getInt("id");
            int grade = rs.getInt("grade");
           
            System.out.println("Id is " + id + " and the grade is " + grade);
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
        
        
        cpdb.doStuff("CREATE TABLE passengers(passengerID SERIAL PRIMARY KEY, "
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE)");
                
        cpdb.doStuff("CREATE TABLE drivers(driverID SERIAL PRIMARY KEY,"
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE,"
                + "rating NUMERIC NOT NULL)");
        
        cpdb.doStuff("CREATE TABLE admins(adminID SERIAL PRIMARY KEY,"
                + "userID integer REFERENCES users(userID) ON DELETE CASCADE"
                + ")");
                
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