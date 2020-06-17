/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import java.awt.List;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import MMGame.model.Player;
/**
 * Holds database component of game.
 * Records all the game data (players).
 * 
 * @author Syahirah Shafiq Lee (19065338)
 */
public final class Database {
    
    //database variables
    private Connection conn=null;
    private final String url = "jdbc:derby:MMGdb;create=true";  //embedded database host
    private final String dbUsername = "syahirahlee";  //database username
    private final String dbPassword = "tata23";   //database password
    private Statement statement=null;
  
    //Constructs agame database
    protected Database() {
        
        if (!connect()) {
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(null, "Database connection could not be established.\ndue to most likely another instance is open.", "Another Instance is Open", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);
            System.exit(0);
        }
        dbConfig();
    }

    /**
     * initialize connection with db
     * @return true if connected, else false
     */
    protected boolean connect() {
        boolean success = false;
        try {
            //establish connection with database
            conn = DriverManager.getConnection(url,  dbUsername, dbPassword);
            System.out.println("DATABASE: Connected");
            statement = conn.createStatement();
            success = true;
            
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return success;
    }
    
    //Configures database table for Math Mania Game
    protected void dbConfig() {
        try {
            // if does not exist, create Player table 
            if (!checkTableExisting("PLAYER")) {
                
                statement.executeUpdate("CREATE TABLE PLAYER (USERNAME VARCHAR(15), PASSWORD VARCHAR(20), EMAIL VARCHAR(50), SCORE INT)");
                System.out.println("PLAYER table was created.");
                // insert sample data into Players table
                statement.executeUpdate("INSERT INTO PLAYER VALUES ('syira', '123', 'syira@gmail.com', 60), " // Insert Values into BOOK table
                    + "('josh', '123', 'josh@gmail.com', 80), "
                    + "('mai', '123', 'mai@gmail.com', 0)"); 
                System.out.println("Sample data was added to 'PLAYER' table.");
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex);
        }

}
    
    /**
     * Checks if table exists in database or not
     * @param newtableName the table to check for
     * @return true if table exists, else false
     */
    protected boolean checkTableExisting(String newtableName) {
        boolean tableExists = false;
        try {
            //execute initialization of table query
            DatabaseMetaData dbMetaData = conn.getMetaData();
            ResultSet rsMeta = dbMetaData.getTables(null, null, null, null);
            
            while (rsMeta.next()) {
                String currentTableName = rsMeta.getString("TABLE_NAME");
                
                if (currentTableName.equalsIgnoreCase(newtableName)) {
                    tableExists = true;
                    break;
                }
            }
            if (rsMeta != null){
                rsMeta.close();
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tableExists;
    }
    
    /**
     * Checks if player login credentials are correct or not
     *
     * @param username the user's username
     * @param password the user's password
     * @return true if user details match database, else false
     */
    protected boolean checkLogin(String username, String password) {
        boolean validLogin = false;
        try {
            //query database for selected player with statement object
            ResultSet rs = statement.executeQuery("SELECT USERNAME FROM PLAYER WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'");
            if (rs.next()) {
                validLogin = true;
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return validLogin;
    }

    /**
     * Registers new player in the database 
     * @param username player's name for game
     * @param email the player's email address
     * @param password the player's password
     * @return true if successful registration, else false
     */
    protected boolean registerPlayer(String username, String email, String password) {
        boolean success = false;
        try {
            
            if (!checkLogin(username, password)) {
                statement.executeUpdate("INSERT INTO PLAYER (USERNAME, PASSWORD, EMAIL, SCORE) VALUES ('" + username + "', '" + password+ "', '" + email + "', 0)");
                success = true;
                System.out.println("User " + username + " was successfully added into the database");
            } else {
                JOptionPane.showMessageDialog(null, "Username " + username + " already exists, please try again.");
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return success;
    }
    
    /**
     * Loads the player from the database
     *
     * @param username the player's name in game
     * @param password the player's password
     * @return a Player object of the current user
     */
    protected Player loadPlayer(String username, String password) {
        Player player = null;
        if (checkLogin(username, password)) {
            try {
                ResultSet rs = statement.executeQuery("SELECT * FROM PLAYER WHERE USERNAME = '" + username + "' AND password = '" + password + "'");
                if (rs.next()) {
                    // Retrieve Player Information 
                    player = new Player(rs.getString("USERNAME"), rs.getString("PASSWORD"), rs.getString("EMAIL"), rs.getInt("SCORE"));
                }
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return player;
    }
    
    
    /**
     * update and record player highest score to database
     *
     * @param players 
     */
    protected void updateScore(Player players) {
        try {
            statement.executeUpdate("UPDATE PLAYER SET SCORE = " + players.getScore() + " WHERE USERNAME= '" + players.getUsername() + "'");
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    /**
     * retrieve and sort player score in descending order (highest-lowest)
     */
     protected ArrayList<Player> getRanking() {
        ArrayList<Player> players = new ArrayList<>();
        try {
            //descending order from highest to lowest score
            ResultSet rs = statement.executeQuery("SELECT * FROM PLAYER" + " ORDER BY SCORE DESC");
            while (rs.next()) {
                players.add(new Player(rs.getString("USERNAME"), rs.getInt("SCORE")));
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return players;
    }
    
}
