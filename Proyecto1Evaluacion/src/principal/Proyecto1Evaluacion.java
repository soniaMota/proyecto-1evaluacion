/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;
import vista.VistaAniadir;

/**
 *
 * @author DAM-2
 */
public class Proyecto1Evaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Gestión de excursiones");
        VistaAniadir panelAniadir = new VistaAniadir();
        
        ventana.setContentPane(panelAniadir);
        
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
