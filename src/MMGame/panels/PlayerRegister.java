/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.bg_darkblue;
import static MMGame.MMG_Model.yellow;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class PlayerRegister extends JPanel{
    
    // register Panel Attributes
    private final JTextField usernameTxt;
    private final JTextField emailTxt;
    private final JPasswordField passwordTxt;
    private final JButton backButton;
    private final JButton registerButton;
    
    public PlayerRegister()
    {
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(bg_darkblue);

        //title 
        JLabel title = new JLabel("PLAYER REGISTER");
        title.setFont(new Font("Cooper Black", Font.BOLD, 35));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        this.add(title);

         //Email label
        JLabel emaillabel = new JLabel("Email");
        emaillabel.setFont(new Font("Segoe Print", Font.BOLD, 20));
        emaillabel.setForeground(Color.white);
        emaillabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(emaillabel);
        
        //email textfield
        emailTxt = new JTextField();
        emailTxt.setBackground(bg_darkblue);
        emailTxt.setForeground(Color.white);
        emailTxt.setHorizontalAlignment(JLabel.CENTER);
        emailTxt.setFont(new Font("Segoe Print", Font.BOLD, 20));
        emailTxt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, yellow));
        this.add(emailTxt);
        
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

        
        // register Button
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Cooper Black", Font.BOLD, 22));
        registerButton.setForeground(Color.white);
        registerButton.setBorderPainted(false);
        registerButton.setFocusPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setOpaque(true);
        registerButton.setBackground(yellow);
        this.add(registerButton);

        // Sign Up Button
        backButton = new JButton("Back");
        backButton.setFont(new Font("Cooper Black", Font.BOLD, 22));
        backButton.setForeground(Color.white);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setOpaque(true);
        backButton.setBackground(bg_darkblue);
        this.add(backButton);
        
    }
    
    /**
     * Clears text fields in this view.
     */
    public void Clear() {
        usernameTxt.setText("");
        passwordTxt.setText("");
        emailTxt.setText("");
    }

   
    public JButton getBackBtn() {
        return backButton;
    }

   
    public JButton getRegButton() {
        return registerButton;
    }

   
    public JTextField getUsername() {
        return usernameTxt;
    }

   
    public JPasswordField getPassWord() {
        return passwordTxt;
    }
    
    
    public JTextField getEmail() {
        return emailTxt;
    }
}
