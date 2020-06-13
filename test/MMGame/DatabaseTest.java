/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import MMGame.model.Player;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * test MMGame database connectivity
 * 
 * @author Syahirah Shafiq Lee (19065338)
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    /**
     * Test of connect method, of class Database.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Database instance = new Database();
        instance.connect();
    }


    /**
     * Test of checkTableExisting method, of class Database.
     */
    @Test
    public void testCheckTableExisting() {
        System.out.println("checkTableExisting");
        String newtableName = "PLAYER";
        Database instance = new Database();
        boolean expResult = true;
        boolean result = instance.checkTableExisting(newtableName);
        assertEquals(expResult, result);
        System.out.println("Test Player table exist done");
    }

    /**
     * Test of checkLogin method, of class Database.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String username = "syira";
        String password = "123";
        Database instance = new Database();
        boolean expResult = true;
        boolean result = instance.checkLogin(username, password);
        assertEquals(expResult, result);
       System.out.println("Test player login done");
    }

    /**
     * Test of registerPlayer method, of class Database.
     */
    @Test
    public void testRegisterPlayer() {
        System.out.println("registerPlayer");
        String username = "teresa";
        String email = "teresa@test.com";
        String password = "test";
        Database instance = new Database();
        boolean expResult = false;
        boolean result = instance.registerPlayer(username, email, password);
        assertEquals(expResult, result);
        System.out.println("Test register player done");
    }

    /**
     * Test of loadPlayer method, of class Database.
     */
    @Test
    public void testLoadPlayer() {
        System.out.println("loadPlayer");
        String username = "syira";
        String password = "123";
        Database instance = new Database();
        
        assertNotNull(instance.loadPlayer(username, password));
        System.out.println("Test load existing player done");
    }
}
