/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class PantallaCtrl extends JFrame {

    private static final Logger log = LoggerFactory.getLogger(PantallaCtrl.class);
    JPanel panelPral;
    JPanel panelEstado;
    JLabel lblEstado = new JLabel();
    JButton botonEnvio;
    PruebaEnvioBean bean;
    
    TareaEnvio tareaEnvio;

    public PantallaCtrl() throws HeadlessException {
        this.bean = new PruebaEnvioBean(this);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    log.debug("Establecido LookAndFeel Nimbus");
                    break;
                }

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            log.error("ERROR al establecer LookAndFeel de la aplicación", ex);
        }

        // Establecer opciones de JFrame provisionales, hasta que lea el fichero XML..
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        init_eventos();
        
        this.setSize(new Dimension(800, 600));
        this.setPreferredSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setTitle("Verifactu: Pruebas Comunicacion AEAT");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 400, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 300, Short.MAX_VALUE)
//        );
        this.getContentPane().setLayout(new BorderLayout());
        initPanelPral();
        initPanelEstado();
        //panelPral.setBackground(Color.red);
        this.getContentPane().add(panelPral, BorderLayout.CENTER);
        this.getContentPane().add(panelEstado, BorderLayout.SOUTH);
        
        pack();
    }// 

    private void initPanelPral() {
        panelPral = new JPanel();
        panelPral.setSize(new Dimension(800, 560));
        panelPral.setPreferredSize(new Dimension(800, 560));
        panelPral.setBorder(new EtchedBorder(2));

        botonEnvio = new JButton("Enviar");
        panelPral.setLayout(new GridBagLayout());

        GridBagConstraints gbc;
        int fila = 0;
        int colum = 0;

        // Fila 1 Label: lblNroPedido / lblEstado / lblProveedor / Field:  jTextCodigo / lblAlmacen
        //fila++;
        colum = 0;

        gbc = new GridBagConstraints(colum++, fila, 1, 1,
                1.0, 1.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(10, 10, 0, 0),
                0, 0);
        panelPral.add(botonEnvio, gbc);
    }
    private void initPanelEstado(){
        panelEstado = new JPanel();
        panelEstado.setSize(new Dimension(800, 40));
        panelEstado.setPreferredSize(new Dimension(800, 40));
        lblEstado = new JLabel();
        panelEstado.setLayout(new FlowLayout());
        panelEstado.add(lblEstado);
        
    }

    private void init_eventos() {
        botonEnvio.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnvio_actionPerformed();
            }
        });
    }
    private void botonEnvio_actionPerformed() {
        try {
            // lanzar un envio de prueba a AEAT
            bean.ejecutaEnvio();
        } catch (Exception ex) {
            log.error("Error en el envio:" + ex.getMessage());
           
        }
    }

    //---------------------------------

    public JLabel getLblEstado() {
        return lblEstado;
    }
     
}
