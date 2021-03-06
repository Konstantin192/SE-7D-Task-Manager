package v1;

import database_console.DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Konstantin Georgiev
 */
public class User {

    private static String firstName;
    private static String lastName;
    private static String email;
    private Integer userID;
    private String userName;
    private String password;
    private Integer numTasksDone;
    private ArrayList<String> bestSkills;
    private Integer a;

    public User(String u_FName, String u_LName, String u_Email,
            Integer u_UserID, String u_UserName, String u_Password,
            Integer u_NumTasksDone, ArrayList<String> u_BestSkills) {

        this.firstName = u_FName;
        this.lastName = u_LName;
        this.email = u_Email;
        this.userID = u_UserID;
        this.userName = u_UserName;
        this.password = u_Password;
        this.numTasksDone = u_NumTasksDone;
        this.bestSkills = u_BestSkills;

        //insert into query
    }

    public static void insert(String uFName, String uSName, String uEmail,
            String uPassword, String uUsername,
            Integer numTasksDone) {

        String host = "jdbc:mysql://den1.mysql3.gear.host:3306/teammanagerdb";
        String uName = "teammanagerdb";
        String uPass = "Bc85NMS--V6h";

        // The question marks in the values brackets are SQL's equivalent to 
        // variables.
        String insert = "INSERT INTO user(User_Forename, User_Surname, User_Email, User_Password, User_Username, User_NumTasksDone) "
                + "VALUES(?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(host, uName, uPass);) {

            // A prepared statement is created and values are assigned to the 
            // question marks in the values brackets.
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, uFName);
            pst.setString(2, uSName);
            pst.setString(3, uEmail);
            pst.setString(4, uPassword);
            pst.setString(5, uUsername);
            pst.setInt(6, numTasksDone);

            pst.executeUpdate();
            pst.close();

            System.out.println("A new member has been inserted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }

    public static void selectAll() {

        //select from query
        String host = "jdbc:mysql://den1.mysql3.gear.host:3306/teammanagerdb";
        String uName = "teammanagerdb";
        String uPass = "Bc85NMS--V6h";

        try {
            Connection con = DriverManager.getConnection(host, uName, uPass);

            String query = "SELECT * FROM User";

            // create the java statement
            Statement st = con.createStatement();
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("User_ID");
                String firstName = rs.getString("User_Forename");
                String lastName = rs.getString("User_Surname");
                String email = rs.getString("User_Email");
                String password = rs.getString("User_Password");
                String userName = rs.getString("User_Username");
                String numTasksDone;
                numTasksDone = rs.getString("" + "User_NumTasksDone");

                System.out.format("%s, %s, %s, %s, %s, %s, %s  \n", id, firstName, lastName, email, password, userName, numTasksDone);

            }
            st.close();
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }

    }

    public static void delete(int id) {
        //delete from query        
        String host = "jdbc:mysql://den1.mysql3.gear.host:3306/teammanagerdb";
        String uName = "teammanagerdb";
        String uPass = "Bc85NMS--V6h";
        
        
        String delete = "DELETE FROM user WHERE User_ID = ?";

        try (Connection con = DriverManager.getConnection(host, uName, uPass);
                PreparedStatement pst = con.prepareStatement(delete)) {
            
            pst.setInt(1, id);
            // create the java statement
            Statement stat = con.createStatement();
            // execute the query, and get a java resultset
            int rs;
            rs = pst.executeUpdate();

            System.out.println("A new user has been deleted");

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(DBConnect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }

    }

}
