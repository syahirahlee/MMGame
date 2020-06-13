/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * test MMGame player data 
 * 
 * @author Syahirah Shafiq Lee(19065338)
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
      /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore30() {
        System.out.println("getScore");
        Player instance = new Player("hiro", "123", "hiro@test.com", 30);
        int expResult = 30;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScore10() {
        System.out.println("setScore");
        int score = 10;
        Player instance = new Player("hiro", "123", "hiro@test.com", 30);
        instance.setScore(score);
    }

    /**
     * Test of getEmail method, of class Player.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Player instance = new Player("hiro", "123", "hiro@test.com", 30);
        String expResult = "hiro@test.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPassword method, of class Player.
     */
    @Test
    public void testGetPassword123() {
        System.out.println("getPassword");
        Player instance = new Player("hiro", "123", "hiro@test.com", 30);
        String expResult = "123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }


    /**
     * Test of getUsername method, of class Player.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Player instance = new Player("hiro", "123", "hiro@test.com", 30);
        String expResult = "hiro";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
    
}
