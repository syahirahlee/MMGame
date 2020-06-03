/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.model;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Questions {
    //class generate math questions for the game
    
    public double answer =0;
    public String question;
    public String mOperation;
    public int no1 = 0;
    public int no2 = 0;
    
    public Questions (String question, Double answer)
    {
        this.answer = answer;
        this.question = question;
    }
    
    public double Easy() 
    {
        //call method to generate random integers 
        this.no1 = this.createNum(100); //set range to 100
        this.no2 = this.createNum(100); 
        
        //generate random 2 math operations
        int math = createNum (2);
        switch (math){
            case 0: 
                mOperation= "+";
                this.answer = this.no1 + this.no2;
                break;
                
           default: 
               mOperation = "-";
               this.answer = this.no1 - this.no2;
               break;
          
        }
       //display question
        question =  (no1 + " " + mOperation + " " + no2 + " =  ?");
        return this.answer;
    }
    
    
    public double Intermediate()
    {
        //call method to generate random integers 
        this.no1 = this.createNum(100); //set range to 100
        this.no2 = this.createNum(100); 
        
        //generate random 4 math operations
        int math = createNum (4);
        switch (math){
            case 0: 
                mOperation= "+";
                this.answer = this.no1 + this.no2;
                break;
                
            case 1:
                mOperation = "-";
                this.answer = this.no1 - this.no2;
                break;
                
            case 2:
                mOperation = "*";
                this.answer = this.no1 * this.no2;
                break;
                
           default: 
               mOperation = "/";
               //prevent math error
               while (no2 == 0) {
                this.no2 = this.createNum(100);
                }
               this.answer = 1.0 * this.no1 /this.no2; //to make double num type
               break;
          
        }
       //display question
       question =  (no1 + " " + mOperation + " " + no2 + " =  ?");
        return this.answer;
    }
    
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
       //display question
       question =  (no1 + " " + mOperation + " " + no2 + " =  ?");
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
    
}
