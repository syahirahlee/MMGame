/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import MMGame.model.Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class MMG_Controller extends JFrame  {
    
    // Local Model-View Link Variables
    private final MMG_Model model;
    private final MMG_View view;

    JFrame frame;
    //declare variables
    double playerans;
    int score ;
    int rounds = 0;
    
    public MMG_Controller (String control)
    {
        super (control);
        this.model = new MMG_Model();
        this.view = new MMG_View();
        getContentPane().add(this.view);
        setSize(750,800);
        setResizable(false);  //does not allow user resize window form
        
        //for login form
        this.view.getLogin().getloginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call login method to check player account
                Login();
            }
        });
        this.view.getLogin().getRegisterBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call login method to check player account
                view.getLayout().show(view.getForms(), "register");;
            }
        });
        
         /*for register form
        this.view.getRegister().getRegButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call register method to insert player data into database
                Register();
            }
        });
        this.view.getRegister().getBackBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getLayout().show(view.getForms(), "login");
            }
        });
        //clear button
        this.view.getRegister().getClearbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getRegister().Clear();
            }
        });
        */
        
         
        //for main menu form
        //1.levels
        this.view.getMainMenu().getPlaybtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                view.getLayout().show(view.getForms(), "levels");
            }
        });
        
       //2. rank
        this.view.getMainMenu().getRankBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayRank();
                //DisplayRank(model.getLatestScore());
                view.getLayout().show(view.getForms(), "ranking");
            }
        });
        
        //3. rules
         this.view.getMainMenu().getRulesBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                view.getLayout().show(view.getForms(), "rules");
            }
        });
        
        
         //4.sign out
        this.view.getMainMenu().getSignOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //clear all fields
                view.getLogin().clear();
                //display login form
                view.getLayout().show(view.getForms(), "login");
                    model.setPlayer(null);
                    //model.setTimer(null);
            }
        });
        
        
       
        //for levels menu form
        this.view.getLevels().getEasybtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                view.getLayout().show(view.getForms(), "level1");
            }
        });
        this.view.getLevels().getIntermediatebtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                view.getLayout().show(view.getForms(), "level2");
            }
        });
        this.view.getLevels().getAdvancedbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                view.getLayout().show(view.getForms(), "level3");
            }
        });
        this.view.getLevels().getBackbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //return to main menu form
                view.getLayout().show(view.getForms(), "main menu");
            }
        });
        
     
        //for ranking form
         this.view.getRanking().getBackbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //return to main menu
                view.getLayout().show(view.getForms(), "main menu");
            }
        });
       
         
         //for rules form
        this.view.getRules().returnbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //return to main menu
                view.getLayout().show(view.getForms(), "main menu");
            }
        });
        
        
        //level 1 game actions
        this.view.getlev1().getEnterbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call method check player input and answer
                Level1_Game();
            }
        });
        this.view.getlev1().Quitbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //save player score
                model.getgameDB().updateScore(model.getPlayer());
                //open main menu
                view.getLayout().show(view.getForms(), "main menu");
            }
        });
         
    }     
 
    public static void main(String[] args) {
        JFrame frame = new MMG_Controller("Math Mania Game");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    //check login credentials
    public void Login()
    {
        //get user details
        String username = this.view.getLogin().getUsername().getText().trim();
        String password = this.view.getLogin().getPassWord().getText().trim();
        
        if (!username.equals("") && !password.equals("")) {
        
            //check player account in database 
             if (model.getgameDB().checkLogin(username, password)) {
                //set Player
                Player player = model.getgameDB().loadPlayer(username, password);
                
                if (player != null) //correct credentials entered
                {
                    model.setPlayer(model.getgameDB().loadPlayer(username, password));
                    //display main menu
                    view.getMainMenu().getNameLabel().setText(model.getPlayer().getUsername().toUpperCase());
                    view.getLayout().show(view.getForms(), "main menu");
                } 
                else {
                    Object[] options = {"OK"};
                    JOptionPane.showOptionDialog(this, "Error, please try again.", "Login Error", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null, options, null);
                }
             }
             else //account not found/wrong credentials
             {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(this, "Incorrect username/password, please try again.", "Invalid Credentials", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            }
        }
         else //if blank textfield
        {
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(this, "Please fill in all fields.", "Empty Fields", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
        }
    
    }
    
    //register new users in game database
    private void Register()
    {
        //get user details
        String username = this.view.getRegister().getUsername().getText().trim();
        String password = this.view.getRegister().getPassWord().getText().trim();
        String email = this.view.getRegister().getEmail().getText().trim();
        
        if (!username.equals("") && !email.equals("") && !password.equals("")) {
            //method to register and save new player to database
            if (model.getgameDB().registerPlayer(username, email, password)) {
               //display successful message
               JOptionPane.showMessageDialog(null, "Successful! You can sign in to your account now");
               //call main menu form for registered player to login into game
               view.getLayout().show(view.getForms(), "login");
               // clear Fields
               view.getRegister().Clear();
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Unsuccessful!\nPlease make sure to not create a duplicate account.");
           }
          
        } else {
            //when there is empty textfields
           JOptionPane.showMessageDialog(null, "Please make sure all fields are filled in");
        }
    }

     //display data in table provided in Ranking form
     private void DisplayRank ()
    {
         //get method of ranking in database for the list of players
         ArrayList <Player> list = model.getgameDB().getRanking(); 
         //display in rank table
         DefaultTableModel model = (DefaultTableModel)view.getRanking().getRank().getModel();
         
        //convert info from player object to string array
        Object[] column = new Object [2]; //2 columns: username and score
        for (int i=0; i<list.size(); i++)
        {
            column[0] = list.get(i).getScore();
            column [1] = list.get(i).getUsername();
            model.addRow(column);
        }
    }
   
     
    //check answer for Level1 game
     private void Level1_Game()
     {
       boolean validInput = true;
       //get player answer
      String ans = this.view.getlev1().getplayerAnswer().getText().trim(); 
       if (validInput)
       {
          try
          {
              playerans = Double.parseDouble(ans); //convert to double
              validInput = true;
              //check player answer
                if (Math.abs(Double.parseDouble(ans) - this.view.getlev1().getCorrectAnswer())  <= 0.01) //for correct answer 
                {
                    //add 5 points
                    this.model.getPlayer().setScore(score +=5);
                    //save player's total score
                    model.getgameDB().updateScore(model.getPlayer());
                    JOptionPane.showMessageDialog(null, "You got it right!"); //mesage to inform player
                }
                else //wrong answer
                {
                    //subtract 5 points
                    model.getPlayer().setScore(score-=5);
                    //save player's total score
                    model.getgameDB().updateScore(model.getPlayer());
                    JOptionPane.showMessageDialog(null, "You got it wrong!"); //mesage to inform player
                }
     
          } catch (NumberFormatException e){ //other input other than integers
                    JOptionPane.showMessageDialog(null, "Please enter number only");
                    validInput = false;
          }
      }
       view.getlev1().getplayerAnswer().selectAll();
       view.getlev1().getplayerAnswer().requestFocusInWindow();

       //increment round (10 rounds) and display at what number of round the game has reached
        rounds++;
        view.getlev1().getRounds().setText("" + String.valueOf(rounds + 1) );
        //clear textfield for next question
        view.getlev1().getplayerAnswer().setText("");
        
        //when 10 questions finish loaded, game ends
         if (rounds >= 10) {
             //save player's total score
            model.getgameDB().updateScore(model.getPlayer());
            System.err.println(model.getPlayer().getScore());
            //open end game form to display final score
            //display final score
            view.getEndgame().getFinalScore().setText("" + model.getPlayer().getScore());
            view.getLayout().show(view.getForms(), "endgame");
        
        } else 
        {
             //load next question
            view.getlev1().EasyQuestion();
        }
        
     }
     
     
}
