/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import javax.swing.JFrame;

/**
 *
 * @author Shahin
 */
public class Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // At first, show the login page and show menu after - 
        // the authentication process completed

        
        LOGIN im = new LOGIN();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
    }
    
    
}
