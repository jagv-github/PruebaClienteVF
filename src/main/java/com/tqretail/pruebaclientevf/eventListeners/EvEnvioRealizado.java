/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tqretail.pruebaclientevf.eventListeners;


//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.ssii.fact.ws.respuestasuministro.RespuestaLRFEmitidasType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.EstadoEnvioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaExpedidaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaRegFactuSistemaFacturacionType;
import java.util.Date;
import java.util.EventObject;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import wsAeat.EstadoEnvioType;
//import wsAeat.RespuestaExpedidaType;
//import wsAeat.RespuestaRegFactuSistemaFacturacionType;

/**
 * Este objeto evento transporta respuesta al envio de facturas emitidas realizado
 * @author jagv en TQ Retail S.L.
 */
public class EvEnvioRealizado extends EventObject {

    private static final Logger log = LoggerFactory.getLogger(EvEnvioRealizado.class);
    
    private int resultado;
    private RespuestaRegFactuSistemaFacturacionType respuesta;
    private Date fechaEnvio;
    private int nroFrasEnviadas=0;
    private String textoError ="";
    private EstadoEnvioType estadoEnvio;
    private String tiempoEspera="0";
    private List<RespuestaExpedidaType> listaRespuestas;

    public EvEnvioRealizado(Object source, int resultado,
            RespuestaRegFactuSistemaFacturacionType respuesta, Date fechaEnvio) {
        super(source);
      
        this.resultado = resultado;
        this.respuesta = respuesta;
        this.fechaEnvio = fechaEnvio;
//        this.listaDetInven = listaRegs;
    }
 public EvEnvioRealizado(Object source, int resultado,
            List<RespuestaExpedidaType> listaRespuestas, Date fechaEnvio, 
            EstadoEnvioType estadoEnvio, String tiempoEspera) {
        super(source);
      
        this.resultado = resultado;
        this.listaRespuestas = listaRespuestas;
        this.fechaEnvio = fechaEnvio;
        this.estadoEnvio = estadoEnvio;
        this.tiempoEspera = tiempoEspera;
        
    }
  

    public int getResultado() {
        return resultado;
    }

    public RespuestaRegFactuSistemaFacturacionType getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(RespuestaRegFactuSistemaFacturacionType respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }



  

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNroFrasEnviadas() {
        return nroFrasEnviadas;
    }

    public void setNroFrasEnviadas(int nroFrasEnviadas) {
        this.nroFrasEnviadas = nroFrasEnviadas;
    }

    public String getTextoError() {
        return textoError;
    }

    public void setTextoError(String textoError) {
        this.textoError = textoError;
    }

    public EstadoEnvioType getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(EstadoEnvioType estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(String tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public List<RespuestaExpedidaType> getListaRespuestas() {
        return listaRespuestas;
    }

    public void setListaRespuestas(List<RespuestaExpedidaType> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }


 
    
}