/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Welcome extends JPanel {// implements ActionListener {

//    @Override
//    public void actionPerformed(ActionEvent e) {
//    }
    
    public Welcome() {
        JLabel label = new JLabel("Welcome to Matrimony Status Manager software v1.0");
        add(label, BorderLayout.CENTER);
    }
    
    private static void displayGUI() {
        JFrame frame = new JFrame("Matrimony Status Manager v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent newContentPane = new Welcome();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        
        frame.setSize(1024, 768);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayGUI();
            }
        });
    }
    
}
