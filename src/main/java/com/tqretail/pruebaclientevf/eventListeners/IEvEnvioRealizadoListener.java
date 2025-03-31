package com.tqretail.pruebaclientevf.eventListeners;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.EventListener;

/**
 * Este interface de listener nos sirve para lanzar el evento de que se ha
 * terminado realizar un envio de facturas emitidas
 *
 * @author jagv en TQ Retail S.L.
 */

public interface IEvEnvioRealizadoListener extends EventListener {

    void EvEnvioRealizado(EvEnvioRealizado args);
}