package com.tqretail.pruebaclientevf;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpClientExample {

    // one instance, reuse
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main(String[] args) throws Exception {

//        HttpClientExample obj = new HttpClientExample();

//        try {
////            System.out.println("Testing 1 - Send Http GET request");
////            obj.sendGet();
//
//            System.out.println("Testing 2 - Send Http POST request");
//            obj.sendPost();
//        } finally {
//            obj.close();
//        }
        String certificado = "CERTFF_2019.P12";         // FirstFruit

        File fCert = new File("./conf/" + certificado);
        if (!fCert.exists()) {
            String msg = "No encontrado certificado digital indicado:" + fCert.getAbsolutePath();
            System.out.println(msg);
        }

//          System.setProperty("javax.net.debug", "ssl,handshake");
        System.setProperty("javax.net.ssl.keyStore", "./conf/" + certificado);
        System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
        System.setProperty("javax.net.ssl.keyStorePassword", "270983"); // FirstFruit

        String xmString = "<soapenv:Envelope xmlns:soapenv=''http://schemas.xmlsoap.org/soap/envelope/''"
                + " xmlns:con=''https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd''"
                + " xmlns:sum=''https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd''>"
                + "<soapenv:Header/>"
                + "<soapenv:Body>"
                + "<con:ConsultaFactuSistemaFacturacion>"
                + "<con:Cabecera>"
                + "<sum:IDVersion>1.0</sum:IDVersion>"
                + "<sum:ObligadoEmision>"
                + "<sum:NombreRazon>NECTALIA FIRST FRUIT S.L</sum:NombreRazon>"
                + "<sum:NIF>B21293295</sum:NIF>"
                + "</sum:ObligadoEmision>"
                + "</con:Cabecera>"
                + "<con:FiltroConsulta>"
                + "<con:PeriodoImputacion>"
                + "<sum:Ejercicio>2024</sum:Ejercicio>"
                + "<sum:Periodo>11</sum:Periodo>"
                + "</con:PeriodoImputacion>"
                + "</con:FiltroConsulta>"
                + "</con:ConsultaFactuSistemaFacturacion>"
                + "</soapenv:Body>"
                + "</soapenv:Envelope>";

        int respCode = uploadToServer(xmString);
        if (respCode == 200) {
            String respData = downloadFromServer();
        }

    }

    private void close() throws IOException {
        httpClient.close();
    }

    private void sendGet() throws Exception {

        HttpGet request = new HttpGet("https://www.google.com/search?q=mkyong");

        // add request headers
        request.addHeader("custom-key", "mkyong");
        request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

        try (CloseableHttpResponse response = httpClient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }

        }

    }

    private void sendPost() throws Exception {

//        HttpPost post = new HttpPost("https://httpbin.org/post");
        HttpPost post = new HttpPost("https://prewww1.aeat.es/wlpl/TIKE-CONT/ws/SistemaFacturacion/VerifactuSOAP");

        // add request parameter, form parameters
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("username", "abc"));
        urlParameters.add(new BasicNameValuePair("password", "123"));
        urlParameters.add(new BasicNameValuePair("custom", "secret"));

        // jagv-->
//        String xmlString;
//        InputStream inputStream = new ByteArrayInputStream(xmlString.getBytes());//init your own inputstream
//        InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream, xmlString.getBytes());
//        httppost.setEntity(inputStreamEntity);
        //<--
        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
                CloseableHttpResponse response = httpClient.execute(post)) {

            System.out.println(EntityUtils.toString(response.getEntity()));
        }

    }
//----------------------------------------------------------------------------

    public static int uploadToServer(String data) throws Exception {
        OutputStream os;
        URL url = new URL("https://prewww1.aeat.es/wlpl/TIKE-CONT/ws/SistemaFacturacion/VerifactuSOAP");

        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setDoOutput(true);
        os = httpConn.getOutputStream();

        BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(os));

        osw.write(data);
        osw.flush();
        osw.close();

        return httpConn.getResponseCode();
    }

    public static String downloadFromServer() throws MalformedURLException, IOException {
        String returnString = null;
        StringBuffer sb = null;
        BufferedInputStream in;

        //set up httpConn code not included same as previous
        URL url = new URL("https://prewww1.aeat.es/wlpl/TIKE-CONT/ws/SistemaFacturacion/VerifactuSOAP");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        in = new BufferedInputStream(httpConn.getInputStream());
        int x = 0;
        sb = new StringBuffer();

        while ((x = in.read()) != -1) {
            sb.append((char) x);
        }

        in.close();
        in = null;

        if (httpConn != null) {
            httpConn.disconnect();
        }

        return sb.toString();
    }
}
