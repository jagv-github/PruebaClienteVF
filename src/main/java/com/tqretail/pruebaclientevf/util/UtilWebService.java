/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqretail.pruebaclientevf.util;

//import com.sun.xml.internal.ws.client.BindingProviderProperties;
//import com.sun.xml.internal.ws.client.BindingProviderProperties;
//import config.AppConfigManager;
//import dao.servicios.webservice.estructuras.Estru_SoapPortEmitidas;
//import dao.servicios.webservice.estructuras.Estru_SoapPortRecibidas;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.consultalr.LRConsultaEmitidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.consultalr.LRConsultaRecibidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaLRFacturasEmitidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaLRFacturasRecibidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRBajaFEmitidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRBajaFRecibidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRFEmitidasType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRFRecibidasType;
//
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrolr.BajaLRFacturasEmitidas;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrolr.BajaLRFacturasRecibidas;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasEmitidas;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasRecibidas;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.ConsultaFactuSistemaFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaExpedidaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaRegFactuSistemaFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion_wsdl.SfPortTypeVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion_wsdl.SfVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike
        .cont.ws.suministrolr.RegFactuSistemaFacturacion;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import wsAeat.RegFactuSistemaFacturacion;
//import wsAeat.RespuestaExpedidaType;
//import wsAeat.RespuestaRegFactuSistemaFacturacionType;
//import wsAeat.SfPortTypeVerifactu;
//import wsAeat.SfVerifactu;

/**
 * Utilidades para mostrar en formato xml los envios y las respuestas Nota: En
 * las respuestas hay que anadir la anotacion
 *
 * @XmlRootElement . si no se hace da error el marshalling
 *
 * @author jagv
 */
public class UtilWebService {

    private static final Logger log = LoggerFactory.getLogger(UtilWebService.class);

    /**
     * Envio facturas emitidas: Pasar la peticion que se envia a AEAT a cadena
     * en formato xml para ser impresa en el log.
     *
     * @param listaFacturasAeat
     * @return
     */
    public static String toXmlString(RegFactuSistemaFacturacion listaFacturasAeat) {
        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
    }

//    /**
//     * Envio facturas recibidas: Pasar la peticion que se envia a AEAT a cadena
//     * en formato xml para ser impresa en el log.
//     *
//     * @param listaFacturasAeat
//     * @return
//     */
//    public static String toXmlString(SuministroLRFacturasRecibidas listaFacturasAeat) {
//        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
//    }
//
//    /**
//     * Envio Baja facturas emitidas: Pasar la peticion que se envia a AEAT a
//     * cadena en formato xml para ser impresa en el log.
//     *
//     * @param listaFacturasAeat
//     * @return
//     */
//    public static String toXmlString(BajaLRFacturasEmitidas listaFacturasAeat) {
//        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
//    }
//
//    /**
//     * Envio baja facturas recibidas: Pasar la peticion que se envia a AEAT a
//     * cadena en formato xml para ser impresa en el log.
//     *
//     * @param listaFacturasAeat
//     * @return
//     */
//    public static String toXmlString(BajaLRFacturasRecibidas listaFacturasAeat) {
//        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
//    }
//
//    /**
//     * Envio consulta facturas emitidas: Pasar la peticion que se envia a AEAT a
//     * cadena en formato xml para ser impresa en el log.
//     *
//     * @param listaFacturasAeat
//     * @return
//     */
//    public static String toXmlString(LRConsultaEmitidasType listaFacturasAeat) {
//        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
//    }
//
//    /**
//     * Envio consulta facturas recibidas: Pasar la peticion que se envia a AEAT
//     * a cadena en formato xml para ser impresa en el log.
//     *
//     * @param listaFacturasAeat
//     * @return
//     */
//    public static String toXmlString(LRConsultaRecibidasType listaFacturasAeat) {
//        return obtenerXmlString(listaFacturasAeat.getClass(), listaFacturasAeat);
//    }
//
    /**
     * Respuesta Envio facturas emitidas: pasar la respuesta de AEAT a cadena en
     * formato xml para ser impresa en el log.
     *
     * @param respuesta
     * @return
     */
    public static String toXmlString(RespuestaRegFactuSistemaFacturacionType respuesta) {
        return obtenerXmlString(respuesta.getClass(), respuesta);
    }

    public static String toXmlString(List<RespuestaExpedidaType> respuesta) {
        return obtenerXmlString(respuesta.getClass(), respuesta);
    }
      public static String toXmlString(ConsultaFactuSistemaFacturacionType mensaje) {
        return obtenerXmlString(mensaje.getClass(), mensaje);
    }
//    /**
//     * Respuesta Envio facturas recibidas : pasar la respuesta de AEAT a cadena
//     * en formato xml para ser impresa en el log.
//     *
//     * @param respuesta
//     * @return
//     */
//    public static String toXmlString(RespuestaLRFRecibidasType respuesta) {
//        return obtenerXmlString(respuesta.getClass(), respuesta);
//    }
//
//    /**
//     * Respuesta Envio baja facturas emitidas: pasar la respuesta de AEAT a
//     * cadena en formato xml para ser impresa en el log.
//     *
//     * @param respuesta
//     * @return
//     */
//    public static String toXmlString(RespuestaLRBajaFEmitidasType respuesta) {
//        return obtenerXmlString(respuesta.getClass(), respuesta);
//    }
//
//    /**
//     * Respuesta Envio baja facturas recibidas: pasar la respuesta de AEAT a
//     * cadena en formato xml para ser impresa en el log.
//     *
//     * @param respuesta
//     * @return
//     */
//    public static String toXmlString(RespuestaLRBajaFRecibidasType respuesta) {
//        return obtenerXmlString(respuesta.getClass(), respuesta);
//    }
//
//    /**
//     * Respuesta consulta facturas emitidas: pasar la respuesta de AEAT a cadena
//     * en formato xml para ser impresa en el log.
//     *
//     * @param respuesta
//     * @return
//     */
//    public static String toXmlString(RespuestaConsultaLRFacturasEmitidasType respuesta) {
//        return obtenerXmlString(respuesta.getClass(), respuesta);
//    }
//
//    /**
//     * Respuesta consulta facturas emitidas: pasar la respuesta de AEAT a cadena
//     * en formato xml para ser impresa en el log.
//     *
//     * @param respuesta
//     * @return
//     */
//    public static String toXmlString(RespuestaConsultaLRFacturasRecibidasType respuesta) {
//        return obtenerXmlString(respuesta.getClass(), respuesta);
//    }

    // ===================================================================================
    private static String obtenerXmlString(Class<?> clase, Object objeto) {
        String salida;
        try {
            Marshaller m = JAXBContext.newInstance(clase).createMarshaller();
            StringWriter sw = new StringWriter();
            m.marshal(objeto, sw);
            salida = sw.toString();
        } catch (JAXBException e) {
            log.error("Error marshalling " + clase.getName() + " " + e);
            salida = "Error pasando a Xml la respuesta obtenida";
        }
        return salida;

    }

//    public static SfPortTypeVerifactu obtenerSoapPortPruebas() {
//        return obtenerSoapPortPruebas(Boolean.FALSE);
//    }
    

    public static SfPortTypeVerifactu obtenerSoapPortPruebas() {  
        SfPortTypeVerifactu soapPort = null;
        SfVerifactu servicio = new SfVerifactu();
        try {
            soapPort = servicio.getSistemaVerifactuPruebas();
            
        } catch (Exception e) {
            log.error("Error:" + e);
        }
        return soapPort;
    }
     


    public static SfPortTypeVerifactu obtenerSoapPortPruebas(Boolean encadenadoTrasEnvio) {
        SfPortTypeVerifactu soapPort;
        SfVerifactu servicio = new SfVerifactu();
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiSOAP soapPort;
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService servicio = new https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService();

        if (!encadenadoTrasEnvio) {
            if (JOptionPane.showConfirmDialog(null, "Va a intentar una comunicacion AEAT a traves del entorno de pruebas. Continuar ?", "Atencion", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                return null;
            }
        }
      
        soapPort = servicio.getSistemaVerifactuPruebas();
        Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
//            if (encadenadoTrasEnvio) {
//                // ojo quitar esto. Es solo para pruebas
//                requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1);
//                requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT,1);
//                log.trace("EJECUTAR CONSULTA ENCADENADA TRAS ENVIO !!! ");
//            } else {
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 10000);
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 10000);
//            }

        return soapPort;
    }
    // **** PRODUCCION ****
    public static SfPortTypeVerifactu obtenerSoapPortProduccion() {
        return obtenerSoapPortProduccion(Boolean.FALSE);
    }

    public static SfPortTypeVerifactu obtenerSoapPortProduccion(Boolean encadenadoTrasEnvio) {
        SfPortTypeVerifactu soapPort;
        SfVerifactu servicio = new SfVerifactu();
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiSOAP soapPort;
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService servicio = new https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService();

        if (!encadenadoTrasEnvio) {
            if (JOptionPane.showConfirmDialog(null, "Va a intentar una comunicacion AEAT a traves del entorno de pruebas. Continuar ?", "Atencion", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                return null;
            }
        }
        soapPort = servicio.getSistemaVerifactu();
        Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
//            if (encadenadoTrasEnvio) {
//                // ojo quitar esto. Es solo para pruebas
//                requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1);
//                requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT,1);
//                log.trace("EJECUTAR CONSULTA ENCADENADA TRAS ENVIO !!! ");
//            } else {
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 10000);
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 10000);
//            }

        return soapPort;
    }

//=========================================  gestion del soapPort ===============================================
//    /**
//     * Devuelve una estructura con el SiiSOAP para facturas emitidas y un
//     * indicador de si el tipo de destino es entorno de pruebas AEAT o no
//     *
//     * @return
//     */
//    public static Estru_SoapPortEmitidas obtenerSoapPort_Emitidas() {
//        return obtenerSoapPort_Emitidas(Boolean.FALSE);
//    }
//
//    public static Estru_SoapPortEmitidas obtenerSoapPort_Emitidas(Boolean encadenadoTrasEnvio) {
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiSOAP soapPort;
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService servicio = new https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactemitidas.SiiService();
//
//        Estru_SoapPortEmitidas estruSoapPort;
//
//        if (AppConfigManager.getEntorno_Pruebas()) {
//            if (!encadenadoTrasEnvio) {
//                if (JOptionPane.showConfirmDialog(null, "Va a intentar una comunicacion AEAT a traves del entorno de pruebas. Continuar ?", "Atencion", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
//                    return null;
//                }
//            }
//            soapPort = servicio.getSuministroFactEmitidasPruebas();
//            Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
////            if (encadenadoTrasEnvio) {
////                // ojo quitar esto. Es solo para pruebas
////                requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1);
////                requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT,1);
////                log.trace("EJECUTAR CONSULTA ENCADENADA TRAS ENVIO !!! ");
////            } else {
//            requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//            requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, AppConfigManager.getTimeOutAEAT());
////            }
//            estruSoapPort = new Estru_SoapPortEmitidas(soapPort);
//            estruSoapPort.setEsEntornoPruebas(Boolean.TRUE);
//
//        } else {
//
//            soapPort = servicio.getSuministroFactEmitidas();
//            Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
//            requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//            requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//
//            estruSoapPort = new Estru_SoapPortEmitidas(soapPort);
////            estruSoapPort.setEsEntornoPruebas(true); // de momento dejamos el pruebas
//            estruSoapPort.setEsEntornoPruebas(Boolean.FALSE);
//        }
//        return estruSoapPort;
//    }
//
//    /**
//     * Devuelve una estructura con el SiiSOAP para facturas emitidas y un
//     * indicador de si el tipo de destino es entorno de pruebas AEAT o no
//     *
//     * @return
//     */
//    public static Estru_SoapPortRecibidas obtenerSoapPort_Recibidas() {
//        return obtenerSoapPort_Recibidas(Boolean.FALSE);
//    }
//
//    public static Estru_SoapPortRecibidas obtenerSoapPort_Recibidas(Boolean encadenadoTrasEnvio) {
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactrecibidas.SiiSOAP soapPort;
//        https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactrecibidas.SiiService servicio = new https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.suministrofactrecibidas.SiiService();
//
//        Estru_SoapPortRecibidas estruSoapPort;
//
//        if (AppConfigManager.getEntorno_Pruebas()) {
//            if (!encadenadoTrasEnvio) {
//                if (JOptionPane.showConfirmDialog(null, "Va a intentar una comunicacion AEAT a traves del entorno de pruebas. Continuar ?", "Atencion", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
//                    log.info("Comunicacion  cancelado por el operador");
//                    return null;
//                }
//            }
//            soapPort = servicio.getSuministroFactRecibidasPruebas();
//            Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
////            if (encadenadoTrasEnvio) {
////                // ojo quitar esto. Es solo para pruebas
////                requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000);
////                requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT,1);
////                log.trace("EJECUTAR CONSULTA ENCADENADA TRAS ENVIO !!! ");
////            } else {
//            requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//            requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, AppConfigManager.getTimeOutAEAT());
////            }
//
//            estruSoapPort = new Estru_SoapPortRecibidas(soapPort);
//            estruSoapPort.setEsEntornoPruebas(Boolean.TRUE);
//
//        } else {
//
//            soapPort = servicio.getSuministroFactRecibidas();
//            Map<String, Object> requestContext = ((BindingProvider) soapPort).getRequestContext();
//            requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//            requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, AppConfigManager.getTimeOutAEAT());
//
////            soapPort = servicio.getSuministroFactRecibidasPruebas(); // de momento dejamos el pruebas
//            estruSoapPort = new Estru_SoapPortRecibidas(soapPort);
////            estruSoapPort.setEsEntornoPruebas(true); // de momento dejamos el pruebas
//            estruSoapPort.setEsEntornoPruebas(Boolean.FALSE);
//        }
//        return estruSoapPort;
//    }
}
