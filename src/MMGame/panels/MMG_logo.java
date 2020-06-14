/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMGame.panels;

import static MMGame.MMG_Model.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Set Math Mania Game logo design.
 * 
 * @author Syahirah Shafiq Lee (19065338)
 */
public class MMG_logo extends JPanel {
    
    
    private BufferedImage image;
    
  
    public MMG_logo(int width, int height) {
        try {
            this.image = ImageIO.read(new FileInputStream("resources/mathmania.png"));
            setPreferredSize(new Dimension(width, width));
        } catch (Exception ex) {
            System.err.println("Error Logo Image: " + ex);
            setBackground(bg_darkblue);
        }
    }

    //paint image to container
    @Override
    protected void paintComponent(Graphics g) {
        if (this.image != null) {
            g.drawImage(this.image, 0, 0, 250, 150, this);
        } else {
            super.paintComponent(g);
        }
    }
    
}
