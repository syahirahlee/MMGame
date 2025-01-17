/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import MMGame.model.Player;
import java.awt.Color;
import java.util.ArrayList;


/**
 * Math Mania Game (MMG) MODEL component
 * 
 * Model: represents MMG player and database data & rules that governs 
 * access to and updates the data
 * 
 * @author Syahirah Shafiq Lee (19065338)
 * 
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
    
    private String username=null;
    private String password=null;

    
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

}
