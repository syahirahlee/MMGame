/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class Level_1 extends JPanel {
    
    //declare variables
    private double answer=0;
    double playerans;
    String ans;
    String mOperation, question;
    int no1, no2;
    int score ;
    int rounds = 0;
    
    private JTextField ansTxtField;
    private JButton enterbtn;
    private JLabel questionlabel;
    private JButton quitbtn;
    private JLabel roundlabel;
    
    public Level_1()
    {
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        // Banner
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.LINE_AXIS));
        content.setPreferredSize(new Dimension(1000, 115));
        content.setBackground(bg_darkblue);
        content.setAlignmentX(CENTER_ALIGNMENT);
        
        // Dynamic Banner Content
        JPanel p1 = new JPanel();
        p1.setBackground(bg_darkblue);
        p1.setPreferredSize(new Dimension(200, 100));
        p1.setLayout(new GridLayout(0,1));
            
        roundlabel = new JLabel();
        roundlabel.setFont(new Font("Cooper Black", Font.BOLD, 24));
        roundlabel.setForeground(Color.WHITE);
        roundlabel.setVerticalAlignment(JLabel.TOP);
        roundlabel.setHorizontalAlignment(JLabel.RIGHT);
        p1.add(roundlabel);
            
        //question label
        questionlabel = new JLabel();
        questionlabel.setFont(new Font("Segoe Print", Font.BOLD, 24));
        questionlabel.setForeground(Color.WHITE);
        p1.add(questionlabel);
        
        content.add(p1);
        this.add(content, BorderLayout.NORTH); 
        
        // Main Content
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(0,2));

       //player answer space
       JPanel p2 = new JPanel();
       p2.setBackground(bg_darkblue);
       p2.setLayout(null);
       p2.setLayout(new GridLayout(2,0));
       p2.setLocation(100, 50);
       p2.setSize(300, 120);
        
        //label enter answer
        JLabel instruction = new JLabel("Enter your answer as a number: ");
        instruction.setFont(new Font("Segoe Print", Font.BOLD, 20));
        instruction.setForeground(Color.WHITE);
        p2.add(instruction);
        
        //answer textfield
        ansTxtField = new JTextField();
        ansTxtField.setBackground(bg_darkblue);
        ansTxtField.setForeground(Color.white);
        ansTxtField.setHorizontalAlignment(JLabel.CENTER);
        ansTxtField.setFont(new Font("Segoe Print", Font.BOLD, 20));
        p2.add(ansTxtField);
        
        main.add(p2, BorderLayout.CENTER);
        

       p2 = new JPanel();
       p2.setBackground(bg_darkblue);
       p2.setLayout(new GridLayout(2,0));
       p2.setLocation(100, 50);
       p2.setSize(300, 120);
        
        //enter button
        enterbtn = new JButton("Enter");
        enterbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        enterbtn.setForeground(Color.white);
        enterbtn.setBorderPainted(false);
        enterbtn.setFocusPainted(false);
        enterbtn.setContentAreaFilled(false);
        enterbtn.setOpaque(true);
        enterbtn.setBackground(yellow);   
        enterbtn.setBorder(border);
        p2.add(enterbtn);
        
        //quit button
        quitbtn = new JButton("Quit");
        quitbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        quitbtn.setForeground(Color.white);
        quitbtn.setBorderPainted(false);
        quitbtn.setFocusPainted(false);
        quitbtn.setContentAreaFilled(false);
        quitbtn.setOpaque(true);
        quitbtn.setBackground(yellow);
        quitbtn.setBorder(border);
        p2.add(quitbtn);
        
        main.add(p2, BorderLayout.CENTER);
        
            
        this.add(main);
            
            
    }
    
    //generate math question for easy level
    public double EasyQuestion() 
    {
        //call method to generate random integers 
        no1 = this.createNum(100); //set range to 100
        no2 = this.createNum(100); 
        
        //generate random 2 math operations
        //add, subtract
        int math = createNum (2);
        switch (math){
            case 0: 
                mOperation= "+";
                answer = no1 + no2;
                break;
                
           default: 
               mOperation = "-";
               answer = no1 - no2;
               break;
          
        }
        //display questions
        question =  (no1 + " " + mOperation + " " + no2 + " =  ?");
        questionlabel.setText(question);
        return this.answer;
    }
    
    //generate random number for math integers
    public int createNum (int range)
    {
        //create instance class Random
        Random rand = new Random();
        int generate = rand.nextInt(range);
          
        return generate;
    }

    public JButton getEnterbtn() {
        return  enterbtn;
    }
    
    public JButton Quitbtn() {
        return  quitbtn;
    }
    public JTextField getplayerAnswer()
    {
        return ansTxtField;
    }
    
    public double getCorrectAnswer()
    {
        return answer;
    }
    public JLabel getRounds()
    {
        return roundlabel;
    }
}
