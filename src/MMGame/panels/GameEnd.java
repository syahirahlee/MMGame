/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *  Displays game end interface when player completes the game in each level.
 * 
 * @author Syahirah Shafiq Lee (19065338)
 */
public class GameEnd extends JPanel {
    
    
    private JLabel scorelabel;
    private JButton mainmenu;
    private JButton playbtn;
    
    public GameEnd()
    {
        this.setBackground(bg_darkblue);
        this.setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        
        //top layout
        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.setPreferredSize(new Dimension(1000, 400));
        top.setBackground(bg_darkblue);
        top.setAlignmentX(CENTER_ALIGNMENT);
        
        MMG_logo image = new MMG_logo(250,150);
        image.setBackground(bg_darkblue);
        image.setPreferredSize(new Dimension(250, 150));
        image.setMaximumSize(new Dimension(250, 150));
        
        top.add(image);
        
        JPanel score = new JPanel();
        score.setPreferredSize(new Dimension(600, 10));
        score.setLayout(new GridLayout(0,1));
        score.setBackground(bg_darkblue);
         
        JLabel congrats = new JLabel("Thank you for playing! You score is");
        congrats.setFont(new Font("Segoe Print", Font.BOLD, 25));
        congrats.setForeground(Color.white);
        congrats.setHorizontalAlignment(JLabel.CENTER);
        score.add(congrats);
        
        scorelabel = new JLabel();
        scorelabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
        scorelabel.setForeground(Color.white);
        scorelabel.setHorizontalAlignment(JLabel.CENTER);
        score.add(scorelabel);
        
        top.add (score);
        
        this.add(top, BorderLayout.NORTH);
        
        // Main Content
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(0,1));
        main.setPreferredSize(new Dimension(700, 200));
        
        //buttons panel
        JPanel button = new JPanel();
        button.setBackground(bg_darkblue);
        
        playbtn = new JButton("More challenges");
        playbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        playbtn.setForeground(Color.white);
        playbtn.setBorderPainted(false);
        playbtn.setFocusPainted(false);
        playbtn.setContentAreaFilled(false);
        playbtn.setOpaque(true);
        playbtn.setBackground(yellow);
        playbtn.setBorder(border);
        playbtn.setPreferredSize(new Dimension (230, 70));
        button.add(playbtn);
        
        main.add(button);
        
        mainmenu = new JButton("Main Menu");
        mainmenu.setFont(new Font("Cooper Black", Font.BOLD, 22));
        mainmenu.setForeground(Color.white);
        mainmenu.setBorderPainted(false);
        mainmenu.setFocusPainted(false);
        mainmenu.setContentAreaFilled(false);
        mainmenu.setOpaque(true);
        mainmenu.setBackground(yellow);
        mainmenu.setBorder(border);
        mainmenu.setPreferredSize(new Dimension (230, 70));
        button.add(mainmenu);
        
        main.add(button);
     
        this.add (main, BorderLayout.CENTER);
    }
   
   public JButton getmenubtn()
   {
       return mainmenu;
   }
   
   public JButton getplaybtn()
   {
       return playbtn;
   }
   
   public JLabel getFinalScore()
   {
       return scorelabel;
   }
}
