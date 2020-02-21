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
    private String sqlUpdt;
    ArrayList<String> result;
    
    
    public CarPoolDB() {
        sqlQry = new String();
        sqlUpdt = new String();
        result = new ArrayList<String>();
    }
    
    public void doStuff(String command) {
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
