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
 *
 * @author HP
 */
public class GameEnd extends JPanel {
    
    private JButton okbtn;
    private JLabel scorelabel;
    
    public GameEnd()
    {
        this.setBackground(bg_darkblue);
        this.setLayout(new GridLayout(0, 1));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
         
        JPanel score = new JPanel();
        score.setSize(300, 120);
        score.setBackground(bg_darkblue);
         
        JLabel congrats = new JLabel("Thank you for playing! You score is");
        setFont(new Font("Cooper Black", Font.BOLD, 40));
        congrats.setForeground(Color.white);
        congrats.setHorizontalAlignment(JLabel.CENTER);
        score.add(congrats);
        
        scorelabel = new JLabel();
        scorelabel.setFont(new Font("Segoe Print", Font.BOLD, 50));
        scorelabel.setForeground(Color.white);
        scorelabel.setHorizontalAlignment(JLabel.CENTER);
        score.add(scorelabel);
        
        this.add(score, BorderLayout.CENTER);
        
        JPanel button = new JPanel();
        button.setSize(300, 120);
        button.setBackground(bg_darkblue);
         
        okbtn = new JButton("OK");
        okbtn.setFont(new Font("Cooper Black", Font.BOLD, 30));
        okbtn.setPreferredSize(new Dimension (100, 50));;
        okbtn.setForeground(Color.white);
        okbtn.setBorderPainted(false);
        okbtn.setFocusPainted(false);
        okbtn.setContentAreaFilled(false);
        okbtn.setOpaque(true);
        okbtn.setBackground(yellow);
        okbtn.setBorder(border);
        okbtn.setHorizontalAlignment(JButton.CENTER);
        button.add(okbtn);
        
        this.add(button, BorderLayout.SOUTH);
        
    }
    
    public JButton getOKbtn()
   {
       return okbtn;
   }
   public JLabel getFinalScore()
   {
       return scorelabel;
   }
}
