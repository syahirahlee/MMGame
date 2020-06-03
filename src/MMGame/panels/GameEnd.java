/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class GameEnd extends JPanel {
    
    private JButton okbtn;
    private JLabel scorelabel;
    
    public GameEnd()
    {
    }
    
    public JButton OKbtn()
   {
       return okbtn;
   }
   public JLabel getFinalScore()
   {
       return scorelabel;
   }
}
