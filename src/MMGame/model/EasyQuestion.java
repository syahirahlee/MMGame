/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.model;

/**
 *
 * @author Syahirah Shafiq Lee (19065338)
 */
public class EasyQuestion extends Questions {
    
    /**
    * class that create math questions for easy level (level 1)
    * additional & subtraction operations only
    */
    
   public EasyQuestion()
    {
        super ("Easy");
        this.getAnswer();
    }
  
    public EasyQuestion (int no1, int no2)
    {
        super ("Easy");
        this.no1=no1;
        this.no2=no2;
        this.mOperation="+";
    }

   //create math operation of addition and subtraction only
   public String mathOperations()
   {
       //generate the 2 random math operations
        int math = createNum(2);
        String mathop;
        switch (math){
            case 0: 
              mathop= "+";
                break;
                
           default: 
               mathop= "-";
               break;
        }
       return mathop;
   }
    
   //generate correct answer based on operations
    public double getAnswer()
    {
       switch (mOperation) {
            case "+":
                this.answer = this.no1 + this.no2;
                break;
        
            default:
                this.answer = this.no1 - this.no2;
                break;
        }
        return this.answer;
    }
}
    