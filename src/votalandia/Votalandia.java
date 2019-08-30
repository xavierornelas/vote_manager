/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votalandia;

import java.awt.Dimension;
import java.awt.Toolkit;
import screen.LoginForm;

/**
 *
 * @author franciscoornelas
 */
public class Votalandia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginForm login = new LoginForm();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        login.setLocation(dim.width/2-login.getSize().width/2, dim.height/2-login.getSize().height/2);
        login.setVisible(true);
        
    }
    
}
