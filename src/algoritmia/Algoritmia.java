/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián Parra
 */
public class Algoritmia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
        String a;
        do{
            a = JOptionPane.showInputDialog("Ingrese texto");
        if (a.equals("")) {
            JOptionPane.showMessageDialog(null, "El espacio debe llenarse");
        } else {
            JOptionPane.showMessageDialog(null, "Hola, " + a);
        }
        }while(a.equals(""));
    }
    
}
