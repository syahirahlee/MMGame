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
public class MainMenu extends JPanel{
    
  
    private final JButton playbtn;
    private final JButton rankbtn;
    private final JButton rulesbtn;
    private final JButton signoutbtn;
    private final JLabel usernamelabel;
    private final JLabel welcomelabel;
    
    public MainMenu()
    {
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(bg_darkblue);
        this.setLayout(new BorderLayout());

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
        
        
        welcomelabel = new JLabel("WELCOME");
        welcomelabel.setFont(new Font("Cooper Black", Font.BOLD, 25));
        welcomelabel.setForeground(Color.white);
        welcomelabel.setVerticalAlignment(JLabel.TOP);
        welcomelabel.setHorizontalAlignment(JLabel.CENTER);
        p1.add(welcomelabel);

       usernamelabel = new JLabel("Player");
       usernamelabel.setFont(new Font("Cooper Black", Font.PLAIN, 25));
       usernamelabel.setForeground(Color.WHITE);
       usernamelabel.setVerticalAlignment(JLabel.TOP);
       usernamelabel.setHorizontalAlignment(JLabel.CENTER);
       p1.add(usernamelabel);
       
       top.add(p1);
            
       this.add(top, BorderLayout.NORTH);
        

       //main layout
        JPanel main = new JPanel();
       // main.setLayout(new GridLayout(0,1, 2, 5));
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setPreferredSize(new Dimension(400, 115));
        main.setBackground(bg_darkblue);
        main.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel p2 = new JPanel();
        p2.setBackground(bg_darkblue);
      
        //play Button
        playbtn = new JButton("Play Game");
        playbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        playbtn.setForeground(Color.white);
        playbtn.setBorderPainted(false);
        playbtn.setFocusPainted(false);
        playbtn.setContentAreaFilled(false);
        playbtn.setOpaque(true);
        playbtn.setBackground(yellow);
        playbtn.setBorder(border);
        playbtn.setPreferredSize(new Dimension (300, 80));
        p2.add(playbtn);
        
        main.add(p2);
        
        
        JPanel p3 = new JPanel();
        p3.setBackground(bg_darkblue);
       
        //ranking Button
        rankbtn = new JButton("Ranking");
        rankbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        rankbtn.setForeground(Color.white);
        rankbtn.setBorderPainted(false);
        rankbtn.setFocusPainted(false);
        rankbtn.setContentAreaFilled(false);
        rankbtn.setOpaque(true);
        rankbtn.setBackground(yellow);
        rankbtn.setBorder(border);
        rankbtn.setPreferredSize(new Dimension (300, 80));
        p3.add(rankbtn);
        
        main.add(p3);
        
        
        JPanel p4 = new JPanel();
        p4.setBackground(bg_darkblue);
      
        //rules Button
        rulesbtn = new JButton("Show Rules");
        rulesbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        rulesbtn.setForeground(Color.white);
        rulesbtn.setBorderPainted(false);
        rulesbtn.setFocusPainted(false);
        rulesbtn.setContentAreaFilled(false);
        rulesbtn.setOpaque(true);
        rulesbtn.setBackground(yellow);
        rulesbtn.setBorder(border);
        rulesbtn.setPreferredSize(new Dimension (300, 80));
        p4.add(rulesbtn);
        
        main.add(p4);
        
        
        
        JPanel p5 = new JPanel();
        p5.setBackground(bg_darkblue);
        
        //sign out Button
        signoutbtn = new JButton("Sign Out");
        signoutbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        signoutbtn.setForeground(Color.white);
        signoutbtn.setBorderPainted(false);
        signoutbtn.setFocusPainted(false);
        signoutbtn.setContentAreaFilled(false);
        signoutbtn.setOpaque(true);
        signoutbtn.setBackground(yellow);
        signoutbtn.setBorder(border);
        signoutbtn.setPreferredSize(new Dimension (300, 80));
        p5.add(signoutbtn);
        
        main.add(p5);
        
        this.add(main, BorderLayout.CENTER);
    }
    public JButton getPlaybtn() {
        return  playbtn;
    }
    public JButton getRankBtn() {
        return  rankbtn;
    }
    public JButton getRulesBtn() {
        return  rulesbtn;
    }
    public JButton getSignOutBtn() {
        return  signoutbtn;
    }
    public JLabel getNameLabel()
    {
        return usernamelabel;
    }
    
}
