/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author DAM-2
 */
public class VistaAniadir extends javax.swing.JPanel {

    private VistaFondo panelFondo;
    public VistaAniadir() {
        preInit();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblSocio = new javax.swing.JLabel();
        chkSocio = new javax.swing.JCheckBox();
        panelOpciones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAniadir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir participante"));
        panelDatos.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");
        panelDatos.add(lblNombre);
        panelDatos.add(txtNombre);

        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDni.setText("DNI:");
        panelDatos.add(lblDni);
        panelDatos.add(txtDni);

        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Teléfono:");
        panelDatos.add(lblTelefono);
        panelDatos.add(txtTelefono);

        lblSocio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSocio.setText("Socio:");
        panelDatos.add(lblSocio);
        panelDatos.add(chkSocio);

        add(panelDatos);

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setMaximumSize(new java.awt.Dimension(327, 327));

        btnBuscar.setText("Buscar");
        panelOpciones.add(btnBuscar);

        btnAniadir.setText("Añadir");
        panelOpciones.add(btnAniadir);

        btnCancelar.setText("Cancelar");
        panelOpciones.add(btnCancelar);

        add(panelOpciones);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chkSocio;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSocio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    
    
    private void preInit() {
        panelFondo = new VistaFondo("images/imageDibujoTorreEiffes.png");
        add(panelFondo);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }

}
