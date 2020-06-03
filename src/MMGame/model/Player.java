/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.model;

/**
 *
 * @author Syahirah Shafiq Lee (19065338)
 */
public class Player {
    
    //player attribures
    private String username;
    private int score;
    private String email;
    private String password;

    //constructor for player registration
    public Player (String username, String password, String email, int score)
    {
        this.username = username;
        this.score = score;
        this.email = email;
        this.password = password;
    }
    

    //constructor for player scoring
    public Player (String username, int score)
    {
         this.username = username;
         this.score = score;
    }
    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
}
