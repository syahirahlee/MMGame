/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import MMGame.model.Player;
import java.awt.Color;
import java.util.ArrayList;


import javax.swing.Timer;
/**
 *
 * model: player and database data
 * 
 * @author HP
 */
public class MMG_Model {
    
    // Sudoku App Colors
    public static final Color bg_darkblue = new Color(16,44,73);
    public static final Color bg_lightblue = new Color(0,102,153);
    public static final Color yellow  = new Color(229,202,153);
    public static final Color black  = new Color(0,0,0);
    public static final Color bg_gray  = new Color(204,204,204);
     
    private final Database gameDB;
    private ArrayList latestScore;
    private Player player;
    private Timer timer;
    
    private String username=null;
    private String password=null;
    
    //UpdateInfo info;
    
    public MMG_Model()
    {
        this.gameDB = new Database();
        gameDB.dbConfig();
       // info = new UpdateInfo();
        setLatestScore();
    }
    
    /**
     * Increases the player's score once completed
     *
     * @param points the number of points to increase by
     */
    public void increaseScore(int points) {
        this.player.setScore(this.player.getScore() + points);
        this.gameDB.updateScore(this.player);
    }

    /**
     * @return the sudokuDB
     */
    public Database getgameDB() {
        return gameDB;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    /**
     * @return the latest list of scores
     */
    public ArrayList getLatestScore() {
        setLatestScore();
        return latestScore;
    }

    /**
     * Retrieves an updated version of the scores
     */
    private void setLatestScore() {
        this.latestScore = getgameDB().getRanking();
    }
    
     /**
     * @return the timer
     
    public Timer getTimer() {
        return timer;
    }

    /**
     * @param timer the timer to set
     
    public void setTimer(Timer timer) {
        this.timer = timer;
    }
    */
    
    /*check login credentials
    public void checkPlayerLogin (String pname, String pw)
    {
        this.username = pname;
        this.password = pw;
        
        if (username != null && password != null) {

            if (gameDB.checkLogin(username, password)) {
                // Set Player
                this.player = gameDB.loadPlayer(username, password);
                //username = player.getUsername();
                
                if (player != null) {
                    info.loginflag = true;
                    

                } else {
                    info.loginflag = false;
                }
        
        } 
            setChanged();
            notifyObservers(info);
        }
    }
    */
    
    
}
