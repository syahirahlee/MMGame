/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame;

import javax.swing.JFrame;

import MMGame.panels.*;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 * Math Mania Game (MMG) VIEW component
 * 
 * View: renders MMG model's content. 
 * holds and updates all forms / interfaces in the game.
 * 
 * @author Syahirah Shafiq Lee (19065338)
 * 
 */
public class MMG_View extends JPanel {
    
    private final PlayerLogin login;
    private final PlayerRegister register;
    private final MainMenu main_menu;
    private final ScoreRank ranking;
    private final GameRules rules;
    private final GameLevels levels;
    private final Level_1 lev1;
    private final Level_2 lev2;
    private final Level_3 lev3;
    private final GameEnd endgame;
    
    private final CardLayout layout = new CardLayout();
    private final JPanel form = new JPanel();

    
    public MMG_View()
    {
        //set Grid Layout
        this.setLayout(new GridLayout());
        //set form size
        this.setSize(750,800);
        //set forms
        this.login = new PlayerLogin();
        this.register = new PlayerRegister();
        this.main_menu = new MainMenu();
        this.ranking = new ScoreRank ();
        this.rules = new GameRules();
        this.levels = new GameLevels();
        this.lev1 = new Level_1();
        this.lev2 = new Level_2();
        this.lev3 = new Level_3();
        this.endgame = new GameEnd();
        
        form.setLayout(layout);
        form.add(this.login);
        form.add(this.register);
        form.add(this.main_menu);
        form.add(this.levels);
        form.add(this.ranking);
        form.add(this.rules);
        form.add(this.levels);
        form.add(this.lev1);
        form.add(this.lev2);
        form.add(this.lev3);
        form.add(this.endgame);
        
         //put form identification
        layout.addLayoutComponent(this.login, "login");
        layout.addLayoutComponent(this.register, "register");
        
        layout.addLayoutComponent(this.main_menu, "main menu");
        layout.addLayoutComponent(this.levels, "levels");
        layout.addLayoutComponent(this.ranking, "ranking");
        layout.addLayoutComponent(this.rules, "rules");
        
        layout.addLayoutComponent(this.levels, "levels");
        layout.addLayoutComponent(this.lev1, "level1");
        layout.addLayoutComponent(this.lev2, "level2");
        layout.addLayoutComponent(this.lev3, "level3");
        
        layout.addLayoutComponent(this.endgame, "endgame");
        

        //set first form to display
        layout.show(form, "login");
         
        this.add(form);
        
    }
    
    
    public MainMenu getMainMenu() {
        return main_menu;
    }
    
    public PlayerLogin getLogin(){
        return login;
    }
    
    public PlayerRegister getRegister() {
        return register;
    }
    
    public GameLevels getLevels(){
        return levels;
    }
    
    public ScoreRank getRanking(){
        return ranking;
    }
    
    public GameRules getRules(){
        return rules;
    }
    
  
    public Level_1 getlev1(){
        return lev1;
    }
    
    public Level_2 getlev2(){
        return lev2;
    }
    
    public Level_3 getlev3(){
        return lev3;
    }
    
    public GameEnd getEndgame(){
        return endgame;
    }
    
     public CardLayout getLayout() {
        return layout;
    }

    public JPanel getForms() {
        return form;
    }
    
}
