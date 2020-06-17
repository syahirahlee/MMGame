/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.model;

import java.util.Random;

/**
 *
 * @author Syahirah Shafiq Lee (19065338)
 */
public abstract class Questions {
    
    /**
    *abstract class for generating math questions for the 3 levels in the game
    */
    
   //declare variables
    public String question="";
    public double answer =0;
    public String mOperation=" ";
    public int no1 = 0;
    public int no2 = 0;
    
    public Questions(String name)
    {
        this.question =name;
        this.createQuestion();
    }
    
    public void setQuestion (String newName){
            this.question=newName;
    }
    
    //generate question
    public void createQuestion()
    {
        this.no1 = this.createNum(50);
        this.no2 = this.createNum(50);
        this.mOperation  = this.mathOperations();
        
        while (mOperation.equals("/") && no2 == 0) { //to prevent math error
            this.no2 = this.createNum(50);
        }
        this.getAnswer();
    }
    
    //generate random number for math integers
    public int createNum (int range)
    {
        //create instance class Random
        Random rand = new Random();
        int number = rand.nextInt(range);
        return number;
    }
    
    
    @Override
    //to define duplicated math question in the question set
    public boolean equals(Object obj) {
    
        return obj!= null && obj instanceof Questions &&
            ((Questions)obj).no1==(this.no1)&&
            ((Questions)obj).no2==(this.no2)&&
            ((Questions)obj).mOperation.equals(this.mOperation);
    }
    
    
    //ensure questions generated are distinct from others
    @Override
    public int hashCode() {
        
        String q=this.no1 + this.mOperation + this.no2;
        return q.hashCode();
    }
    
    //abstract method to create different math operations according to levels
    public abstract String mathOperations();
    
    //abstract method to get correct answer according to levels
     public abstract double getAnswer();
}
