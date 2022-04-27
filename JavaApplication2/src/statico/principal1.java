/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;

import javax.swing.JOptionPane;

/**
 *
 * @author Unireformada
 */
public class principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinStatic a= new SinStatic(10,20);
        SinStatic b= new SinStatic(30,40);
        SinStatic c= new SinStatic(50,60);
        JOptionPane.showMessageDialog(null, "a:" +a.toStrng());
        JOptionPane.showMessageDialog(null, "b:" +b.toStrng());
        JOptionPane.showMessageDialog(null, "c:" +c.toStrng());

    }
    
}
