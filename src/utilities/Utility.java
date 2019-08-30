/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;

/**
 *
 * @author franciscoornelasmartinez
 */
public class Utility {
    public void limpiar(Component component) {
                if (component instanceof JTextField) {
                        JTextField text = (JTextField) component;
                        text.setText("");
                } else {
                        if (component instanceof Container) {
                                for (Component c : ((Container) component).getComponents()) {
                                        limpiar(c);
                                }
                        }
                }
        }
}
