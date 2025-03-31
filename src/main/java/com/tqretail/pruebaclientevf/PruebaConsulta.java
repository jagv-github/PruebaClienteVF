/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import static com.tqretail.pruebaclientevf.TareaEnvio.NIF_EMISOR;
import static com.tqretail.pruebaclientevf.TareaEnvio.NOMBRE_RAZON_EMISOR;
import com.tqretail.pruebaclientevf.util.UtilWebService;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.ConsultaFactuSistemaFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.DatosAdicionalesRespuestaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.LRFiltroRegFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.IndicadorPaginacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.RegistroRespuestaConsultaRegFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.RespuestaConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.ResultadoConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.EstadoEnvioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaExpedidaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion_wsdl.SfPortTypeVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion_wsdl.SfVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraConsultaSf;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DatosPresentacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaBCType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ObligadoEmisionConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PeriodoImputacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministrolr.RegistroFacturaType;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.xml.ws.Holder;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class PruebaConsulta {

    private static final Logger log = LoggerFactory.getLogger(PruebaConsulta.class);

    public void EjecutaConsulta() {
        SfPortTypeVerifactu soapPort = null;

        SfVerifactu servicio = new SfVerifactu();
        try {
            soapPort = servicio.getSistemaVerifactuPruebas();
            System.out.println("Ok");

        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }
//        // a ver que es esto
//        Client client = ClientProxy.getClient(soapPort);
//        HTTPConduit http = (HTTPConduit) client.getConduit();
//        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
//
//        httpClientPolicy.setConnectionTimeout(5000);
//        httpClientPolicy.setAllowChunking(false);
//        httpClientPolicy.setReceiveTimeout(5000);
//        
//        http.setClient(httpClientPolicy);

//        try {
//            setupTLS(soapPort);
//        } catch (IOException ex) {
//            java.util.logging.Logger.getLogger(PruebaConsulta.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (GeneralSecurityException ex) {
//            java.util.logging.Logger.getLogger(PruebaConsulta.class.getName()).log(Level.SEVERE, null, ex);
//        }

        // solicitud de consulta
        Holder<CabeceraConsultaSf> cabeceraConsulta = getCabeceraConsulta();
        LRFiltroRegFacturacionType filtroConsulta = getFiltroConsulta();
        DatosAdicionalesRespuestaType datosAdicionalesRespuesta = new DatosAdicionalesRespuestaType();
        Holder<RespuestaConsultaType.PeriodoImputacion> periodoImputacion = new Holder<RespuestaConsultaType.PeriodoImputacion>();

        Holder<IndicadorPaginacionType> indicadorPaginacion = new Holder<IndicadorPaginacionType>();
        Holder<ResultadoConsultaType> resultadoConsulta = new Holder<ResultadoConsultaType>();
        Holder<List<RegistroRespuestaConsultaRegFacturacionType>> registroRespuestaConsultaFactuSistemaFacturacion = new Holder<List<RegistroRespuestaConsultaRegFacturacionType>>();
        Holder<IDFacturaExpedidaBCType> clavePaginacion = new Holder<IDFacturaExpedidaBCType>();

        ConsultaFactuSistemaFacturacionType consulta = new ConsultaFactuSistemaFacturacionType();
        consulta.setCabecera(cabeceraConsulta.value);
        consulta.setFiltroConsulta(filtroConsulta);

        String xmlString = UtilWebService.toXmlString(consulta);
        log.info(xmlString);

//                    BindingProvider bindingProvider = (BindingProvider) soapPortEntornoPruebas;
//                    Map<String, Object> rc = bindingProvider.getResponseContext();
//
//                    bindingProvider.getRequestContext().put(
//                            BindingProvider.ENDPOINT_ADDRESS_PROPERTY, consulta);
        List<RespuestaExpedidaType> respuesta = null;
        soapPort.consultaFactuSistemaFacturacion(cabeceraConsulta,
                filtroConsulta, datosAdicionalesRespuesta,
                periodoImputacion, indicadorPaginacion,
                resultadoConsulta,
                registroRespuestaConsultaFactuSistemaFacturacion, clavePaginacion);

//                    // Aqui se realiza el envio realmente
//                    soapPortEntornoPruebas.regFactuSistemaFacturacion(cabecera,
//                            listaFacturasAeat.getRegistroFactura(),
//                            CSV, datosPresenta, tiempoEspera, estadoEnvio, respuestaLinea);
        log.trace(resultadoConsulta.value.toString());
    }

    private Holder<CabeceraConsultaSf> getCabeceraConsulta() {
        Holder<CabeceraConsultaSf> hCab = new Holder<>();

//        PersonaFisicaJuridicaESType persFis = getPersonaFisicaJuridica();
        CabeceraConsultaSf cabecera = new CabeceraConsultaSf();
        cabecera.setIDVersion("1.0");
//        cabecera.setDestinatario(persFis);
        ObligadoEmisionConsultaType obligado = new ObligadoEmisionConsultaType();
        obligado.setNIF(NIF_EMISOR);
        obligado.setNombreRazon(NOMBRE_RAZON_EMISOR);
        cabecera.setObligadoEmision(obligado);
        hCab.value = cabecera;

        return hCab;
    }

    private LRFiltroRegFacturacionType getFiltroConsulta() {
        LRFiltroRegFacturacionType filtro = new LRFiltroRegFacturacionType();
        PeriodoImputacionType periodo = new PeriodoImputacionType();
        periodo.setEjercicio("2025");
        periodo.setPeriodo("02");
        filtro.setPeriodoImputacion(periodo);
        return filtro;
    }
 private static void setupTLS(SfPortTypeVerifactu port)
        throws IOException, GeneralSecurityException {
        final TLSClientParameters tlsCP = new TLSClientParameters();
        tlsCP.setDisableCNCheck(true);

        final KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
//        try (InputStream is = new FileInputStream("src/main/config/clientKeystore.jks")) {
//            keyStore.load(is, "cspass".toCharArray());
//        }
        try (InputStream is = new FileInputStream("./conf/CERTFF_2019.P12")) {
            keyStore.load(is, "270983".toCharArray());
        }

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(keyStore, "270983".toCharArray());
        tlsCP.setKeyManagers(kmf.getKeyManagers());

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(keyStore);
        tlsCP.setTrustManagers(tmf.getTrustManagers());

        ((HTTPConduit) ClientProxy.getClient(port).getConduit()).setTlsClientParameters(tlsCP);
    }
}
