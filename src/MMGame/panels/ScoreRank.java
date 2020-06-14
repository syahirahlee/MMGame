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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 * Displays all the players ranking in game.
 * 
 * @author Syahirah Shafiq Lee (19065338)
 */
public class ScoreRank extends JPanel {
    
    private final JButton backbtn;
    private JTable rankTable;
    private DefaultTableModel tableModel;
    
    public ScoreRank()
    {
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(bg_darkblue);
        
        //title 
        JLabel title = new JLabel("RANKING");
        title.setFont(new Font("Cooper Black", Font.BOLD, 28));
        title.setForeground(Color.white);
        title.setHorizontalAlignment(JLabel.CENTER);
        this.add(title);
        
         // High Score Table               
        rankTable = new JTable() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                
        tableModel = (DefaultTableModel) rankTable.getModel(); 
        tableModel.setColumnIdentifiers(new String[] {"Score", "Player"});
        Dimension dim = new Dimension(20,1);
        rankTable.setIntercellSpacing(new Dimension(dim));
        SetRowHeight(rankTable);
        
        rankTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        rankTable.getTableHeader().setFont(new Font(this.getFont().getFontName(), Font.PLAIN, this.getFont().getSize()));
        rankTable.getTableHeader().setBackground(yellow);
        rankTable.getTableHeader().setForeground(black);
        rankTable.getTableHeader().setReorderingAllowed(false);
        rankTable.setAutoCreateRowSorter(true);
        rankTable.setFont(new Font("Segoe Print", Font.BOLD, 14));
        rankTable.setBackground(bg_gray);
        rankTable.setForeground(black);
        rankTable.setShowVerticalLines(false);
        rankTable.setShowHorizontalLines(false);
        rankTable.getRowSorter().toggleSortOrder(0);
                
       JScrollPane playerScore = new JScrollPane(rankTable);
       playerScore.setLocation(100, 50);
       playerScore.setSize(300, 270);
       playerScore.setBorder(new LineBorder(Color.BLACK,0));
       playerScore.getViewport().setBackground(bg_gray);
       
       this.add(playerScore);
        
       
       JPanel p5 = new JPanel();
        p5.setBackground(bg_darkblue);
        p5.setLayout(new BorderLayout());
      
        
        backbtn= new JButton("Return to Main Menu");
        backbtn.setFont(new Font("Cooper Black", Font.BOLD, 22));
        backbtn.setForeground(Color.white);
        backbtn.setBorderPainted(false);
        backbtn.setFocusPainted(false);
        backbtn.setContentAreaFilled(false);
        backbtn.setOpaque(true);
        backbtn.setBackground(yellow);
        backbtn.setPreferredSize(new Dimension (800, 80));
        p5.add(backbtn,BorderLayout.SOUTH);
       
       this.add(p5, BorderLayout.SOUTH);
    }
    public void SetRowHeight(JTable table){
        int height = table.getRowHeight();
        table.setRowHeight(height+10);
  }
    public JTable getRank() {
        return  rankTable;
    }
    
    public JButton getBackbtn() {
        return backbtn;
    }
    public void setHighscore(JTable rankTable) {
        this.rankTable = rankTable;
    }
    public DefaultTableModel getTableModel() {
        return tableModel;
    }
     public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
}
