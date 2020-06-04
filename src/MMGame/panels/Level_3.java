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
public class Level_3 extends JPanel {
    
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
    
    public Level_3()
    {
         Border border = BorderFactory.createLineBorder(Color.BLACK);
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
        
        
        roundlabel = new JLabel("1");
        roundlabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
        roundlabel.setForeground(Color.white);
        roundlabel.setVerticalAlignment(JLabel.TOP);
        roundlabel.setHorizontalAlignment(JLabel.CENTER);
        p1.add(roundlabel);

       questionlabel = new JLabel();
       questionlabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
       questionlabel.setForeground(Color.WHITE);
       questionlabel.setVerticalAlignment(JLabel.TOP);
       questionlabel.setHorizontalAlignment(JLabel.CENTER);
       p1.add(questionlabel);
       
       top.add(p1);
            
       this.add(top, BorderLayout.NORTH);
       // content.add(Box.createRigidArea(new Dimension(15,0)));
        
        // Main Content
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(0,1));

       //player answer space
       JPanel p2 = new JPanel();
       p2.setBackground(bg_darkblue);
       p2.setLayout(null);
       p2.setLayout(new GridLayout(0,1));
       p2.setSize(100, 50);
        
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
        ansTxtField.setFont(new Font("Segoe Print", Font.BOLD, 25));
        p2.add(ansTxtField);
        
        main.add(p2, BorderLayout.CENTER);
        

        
        //button panels
        JPanel p4 = new JPanel();
        p4.setBackground(bg_darkblue);
        p4.setBackground(bg_darkblue);

        //enter Button
        enterbtn = new JButton("Enter");
        enterbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        enterbtn.setForeground(Color.white);
        enterbtn.setBorderPainted(false);
        enterbtn.setFocusPainted(false);
        enterbtn.setContentAreaFilled(false);
        enterbtn.setOpaque(true);
        enterbtn.setBackground(yellow);
        enterbtn.setBorder(border);
        enterbtn.setPreferredSize(new Dimension (200, 70));
        p4.add(enterbtn);
        
        main.add(p4);
        
        //quit Button
        quitbtn = new JButton("Quit Game");
        quitbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        quitbtn.setForeground(Color.white);
        quitbtn.setBorderPainted(false);
        quitbtn.setFocusPainted(false);
        quitbtn.setContentAreaFilled(false);
        quitbtn.setOpaque(true);
        quitbtn.setBackground(yellow);
        quitbtn.setBorder(border);
        quitbtn.setPreferredSize(new Dimension (200, 70));
        p4.add(quitbtn);
        
        main.add(p4, BorderLayout.CENTER);
        
        this.add(main);
    }
    
    //generate advanced level math questions
    public double Advanced()
    {
        //call method to generate random integers 
        this.no1 = this.createNum(100); //set range to 100
        this.no2 = this.createNum(100); 
        
        //generate random 2 math operations
        int math = createNum (2);
        switch (math){
            case 0: 
                mOperation= "*";
                this.answer = this.no1 * this.no2 ;
                break;
                
           default: 
               mOperation = "/";
               //prevent math error
               while (no2 == 0 ) {
                this.no2 = this.createNum(100);
                }
               this.answer = 1.0 * this.no1 /this.no2; //to make double num type
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
    public void clear()
    {
        ansTxtField.setText("");
    }
    
    public JLabel getQuestion()
    {
        return questionlabel;
    }
}
