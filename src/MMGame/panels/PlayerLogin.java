/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class PlayerLogin extends JPanel {
    
    // SignIn Panel Attributes
    private final JTextField usernameTxt;
    private final JPasswordField passwordTxt;
    private final JButton regButton;
    private final JButton loginButton;

    /**
     * Constructs a Sign In Panel.
     */
    public PlayerLogin() {

        this.setLayout(new GridLayout(0, 1));
        this.setBackground(bg_darkblue);

        //title 
        JLabel actionLabel = new JLabel("PLAYER LOGIN");
        actionLabel.setFont(new Font("Cooper Black", Font.BOLD, 35));
        actionLabel.setForeground(Color.white);
        actionLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(actionLabel);

        //username 
        JLabel usernamelabel = new JLabel("Username");
        usernamelabel.setFont(new Font("Segoe Print", Font.BOLD, 20));
        usernamelabel.setForeground(Color.white);
        usernamelabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(usernamelabel);

        //username textfield
        usernameTxt = new JTextField();
        usernameTxt.setBackground(bg_darkblue);
        usernameTxt.setForeground(Color.white);
        usernameTxt.setHorizontalAlignment(JLabel.CENTER);
        usernameTxt.setFont(new Font("Segoe Print", Font.BOLD, 20));
        usernameTxt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, yellow));
        this.add(usernameTxt);

        // Password Label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Segoe Print", Font.BOLD, 20));
        passwordLabel.setForeground(Color.white);
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(passwordLabel);

        // Password Text Field
        passwordTxt = new JPasswordField();
        passwordTxt.setBackground(bg_darkblue);
        passwordTxt.setForeground(Color.white);
        passwordTxt.setHorizontalAlignment(JLabel.CENTER);
        passwordTxt.setFont(new Font("Segoe Print", Font.BOLD, 20));
        passwordTxt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, yellow));
        this.add(passwordTxt);

        
        // Sign In Button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Cooper Black", Font.BOLD, 22));
        loginButton.setForeground(Color.white);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setOpaque(true);
        loginButton.setBackground(yellow);
        this.add(loginButton);

        // Sign Up Button
        regButton = new JButton("No account? Register here");
        regButton.setFont(new Font("Cooper Black", Font.BOLD, 22));
        regButton.setForeground(Color.white);
        regButton.setBorderPainted(false);
        regButton.setFocusPainted(false);
        regButton.setContentAreaFilled(false);
        regButton.setOpaque(true);
        regButton.setBackground(bg_darkblue);
        this.add(regButton);
        
       

    }

    /**
     * Clears text fields in this view.
     */
    public void clear() {
        usernameTxt.setText("");
        passwordTxt.setText("");
    }

    /**
     * @return the signupButton
     */
    public JButton getRegisterBtn() {
        return regButton;
    }

    /**
     * @return the signinButton
     */
    public JButton getloginButton() {
        return loginButton;
    }

    /**
     * @return the emailText
     */
    public JTextField getUsername() {
        return usernameTxt;
    }

    /**
     * @return the passwordText
     */
    public JPasswordField getPassWord() {
        return passwordTxt;
    }
    
}
