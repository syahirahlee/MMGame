/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class GameLevels extends JPanel{
    
    // Variables declaration - do not modify                     
    private final JButton advancedbtn;
    private final JButton backbtn;
    private final JButton easybtn;
    private final JButton intermediatebtn;
    
    public GameLevels()
    {
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(bg_darkblue);
        
        //top layout
        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.LINE_AXIS));
        top.setPreferredSize(new Dimension(1000, 115));
        top.setBackground(bg_darkblue);
        top.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel p1 = new JPanel();
        p1.setBackground(bg_darkblue);
        p1.setPreferredSize(new Dimension(200, 100));
        p1.setLayout(new GridLayout(0,1));
        
        
        JLabel title = new JLabel("Please choose level to play");
        title.setFont(new Font("Cooper Black", Font.BOLD, 22));
        title.setForeground(Color.white);
        title.setVerticalAlignment(JLabel.TOP);
        title.setHorizontalAlignment(JLabel.CENTER);
        p1.add(title);

       /*JLabel info = new JLabel("Each level has its own operations and time limit. Refer to game rules.");
       info.setFont(new Font("Segoe Print", Font.BOLD, 16));
       info.setForeground(Color.WHITE);
       info.setVerticalAlignment(JLabel.TOP);
       info.setHorizontalAlignment(JLabel.CENTER);
       p1.add(info);
       */
       top.add(p1);
            
       this.add(top, BorderLayout.NORTH);
        
        //main layout
        JPanel main = new JPanel();
       // main.setLayout(new GridLayout(0,1, 2, 5));
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setPreferredSize(new Dimension(500, 115));
        main.setBackground(bg_darkblue);
        main.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel p2 = new JPanel();
        p2.setBackground(bg_darkblue);
        p2.setSize(new Dimension(200,120));
        p2.setBackground(bg_darkblue);
        p2.setLayout(new GridLayout(0,1));
        p2.setBorder(border);
        
        easybtn = new JButton("Level 1 : Easy");
        easybtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        easybtn.setForeground(Color.white);
        easybtn.setBorderPainted(false);
        easybtn.setFocusPainted(false);
        easybtn.setContentAreaFilled(false);
        easybtn.setOpaque(true);
        easybtn.setBackground(yellow);
        easybtn.setBorder(border);
        p2.add(easybtn);
        main.add(p2);
        
        JPanel p3 = new JPanel();
        p3.setBackground(bg_darkblue);
        p3.setSize(new Dimension(200,120));
        p3.setBackground(bg_darkblue);
        p3.setLayout(new GridLayout(0,1));
        p3.setBorder(border);
        
        intermediatebtn = new JButton("Level 2 : Intermediate");
        intermediatebtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        intermediatebtn.setForeground(Color.white);
        intermediatebtn.setBorderPainted(false);
        intermediatebtn.setFocusPainted(false);
        intermediatebtn.setContentAreaFilled(false);
        intermediatebtn.setOpaque(true);
        intermediatebtn.setBackground(yellow);
        intermediatebtn.setBorder(border);
        p3.add(intermediatebtn);
        main.add(p3);
        
        
        JPanel p4 = new JPanel();
        p4.setBackground(bg_darkblue);
        p4.setSize(new Dimension(200,120));
        p4.setBackground(bg_darkblue);
        p4.setLayout(new GridLayout(0,1));
        p4.setBorder(border);
        
        advancedbtn = new JButton("Level 3 : Advanced");
        advancedbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        advancedbtn.setForeground(Color.white);
        advancedbtn.setBorderPainted(false);
        advancedbtn.setFocusPainted(false);
        advancedbtn.setContentAreaFilled(false);
        advancedbtn.setOpaque(true);
        advancedbtn.setBackground(yellow);
        advancedbtn.setBorder(border);
        p4.add(advancedbtn);
        main.add(p4);
        
        JPanel p5 = new JPanel();
        p5.setBackground(bg_darkblue);
        p5.setSize(new Dimension(200,120));
        p5.setBackground(bg_darkblue);
        p5.setLayout(new GridLayout(0,1));
        p5.setBorder(border);
        
        backbtn= new JButton("Return to Main Menu");
        backbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        backbtn.setForeground(Color.white);
        backbtn.setBorderPainted(false);
        backbtn.setFocusPainted(false);
        backbtn.setContentAreaFilled(false);
        backbtn.setOpaque(true);
        backbtn.setBackground(bg_darkblue);
        backbtn.setHorizontalAlignment(JButton.RIGHT);;
        p5.add(backbtn);
        main.add(p5);
        
        this.add(main, BorderLayout.CENTER);
        
    }
    
    public JButton getEasybtn() {
        return  easybtn;
    }
    public JButton getIntermediatebtn() {
        return  intermediatebtn;
    }
    public JButton getAdvancedbtn() {
        return  advancedbtn;
    }
    public JButton getBackbtn() {
        return  backbtn;
    }
}
