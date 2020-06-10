/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author HP
 */
public class GameRules extends JPanel{

    private final String showrules;
    private final JButton backBtn;
    
    public GameRules()
    {
        //write rules description
        this.showrules = "<html>The game consists of questions revolving 4 basic math operations.<br>"
                + "Operations: Addition (+), Subtraction(-), Multiplication (*) and Division (/).<br>"
                + "For division answers, round off to 2 decimal places.<br><br>"
                + "There are 3 levels to choose, each with respective operations and time limit.<br>"
                + "->Level 1: (+) and (-) operation. Time limit:15 secs<br>"
                + "->Level 2: All 4 operation. Time limit:10 secs <br>"
                + "->Level 3: (*) and (/) operation. Time limit:10 secs <br><br>"
                + "There are 10 rounds each game level.<br><br>"
                + "Playing the game again will overwrite your existing score<br><br>"
                + "Goodluck & Enjoy the game!</html>";

        this.setLayout(new GridLayout(1, 0));
        this.setBackground(bg_darkblue);
        
        //show panel content
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.setBackground(bg_darkblue);

            JLabel titleLabel = new JLabel("GAME RULES");
            titleLabel.setFont(new Font("Cooper Black", Font.PLAIN, 25));
            titleLabel.setForeground(Color.white);
            titleLabel.setHorizontalAlignment(JLabel.CENTER);
            p1.add(titleLabel, BorderLayout.NORTH);

            JLabel text = new JLabel(this.showrules);
            text.setFont(new Font("Segoe Print", Font.BOLD, 16));
            text.setForeground(Color.white);
            text.setBackground(bg_darkblue);
            text.setBorder(new EmptyBorder(10, 10, 10, 10));
            text.setHorizontalAlignment(JLabel.CENTER);
            p1.add(text, BorderLayout.CENTER);

            backBtn = new JButton("Return to Main Menu");
            backBtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
            backBtn.setForeground(Color.white);
            backBtn.setBorderPainted(false);
            backBtn.setFocusPainted(false);
            backBtn.setContentAreaFilled(false);
            backBtn.setOpaque(true);
            backBtn.setBackground(yellow);
            backBtn.setPreferredSize(new Dimension (800, 80));
            p1.add(backBtn, BorderLayout.SOUTH);

        //this.add(new WelcomeImage(500, 550));
        this.add(p1);

        
    }
    public JButton returnbtn() {
        return  backBtn;
    }
    
}
