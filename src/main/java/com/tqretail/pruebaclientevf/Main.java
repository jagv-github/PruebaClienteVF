/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String certificado = "CERTFF_2019.P12";         // FirstFruit
        File fCert = new File("./conf/" + certificado);
        if (!fCert.exists()) {
            String msg = "No encontrado certificado digital indicado:" + fCert.getAbsolutePath();
            System.out.println(msg);
        }

//        System.setProperty("javax.net.debug", "ssl,handshake");
        
        System.setProperty("javax.net.ssl.keyStore", "./conf/" + certificado);
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.keyStorePassword", "270983"); // FirstFruit

//        SfPortTypeVerifactu soapPort;
//        SfVerifactu servicio = new SfVerifactu();
//        try {
//            soapPort = servicio.getSistemaVerifactu();
//            System.out.println("Ok");
//
//        } catch (Exception e) {
//            System.out.println("ERROR" + e.getMessage());
//        }

        PruebaConsulta prueba = new PruebaConsulta();
        prueba.EjecutaConsulta();
        
        
//        JFrame pantalla = new PantallaCtrl();
    }

}
