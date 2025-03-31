/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Usuario
 */
public class PruebaConexion {

    /**
     * @param args the command line arguments
     */
    private static final String HOST = "https://prewww1.aeat.es/wlpl/TIKE-CONT/ws/SistemaFacturacion/VerifactuSOAP";

    public static void main(String[] args) throws Exception {

//        System.setProperty("javax.net.debug", "ssl,handshake");

        String certificado = "CERTFF_2019.P12";         // FirstFruit
        File fCert = new File("./conf/" + certificado);
        if (!fCert.exists()) {
            String msg = "No encontrado certificado digital indicado:" + fCert.getAbsolutePath();
            System.out.println(msg);
        }

        System.setProperty("javax.net.ssl.keyStore", "./conf/" + certificado);
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.keyStorePassword", "270983"); // FirstFruit

        final URL url = new URL(HOST);
        HttpURLConnection conection = (HttpURLConnection) url.openConnection();

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conection.getInputStream()));
        String inputLine;
        final StringBuffer response = new StringBuffer();
        while ((inputLine = bufferedReader.readLine()) != null) {
            response.append(inputLine);
        }
        bufferedReader.close();
        System.out.println(response.toString());
    }
}


