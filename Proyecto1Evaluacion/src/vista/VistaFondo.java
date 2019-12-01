/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sonia
 */
public class VistaFondo extends JPanel{
    
    private Image imagen;
    
    public VistaFondo(){
        
    }
    
    public VistaFondo(String rutaImagen){
        if(rutaImagen != null){
            imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        }
    }
    
    public VistaFondo(Image imagenAUsar){
        if(imagenAUsar != null){
            imagen = imagenAUsar;
        }
    }
    
    public void setImagen(String rutaImagen){
        if(rutaImagen != null){
            imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
            
        }else{
            imagen = null;
        }
        
        repaint();
    }
    
    public void setImagen(Image nuevaImagen){
        imagen = nuevaImagen;
        
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null){
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        }else{
            setOpaque(true);
        }
        super.paint(g); 
    }

    
}
