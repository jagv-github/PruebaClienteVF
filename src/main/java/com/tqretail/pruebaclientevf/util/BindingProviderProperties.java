/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tqretail.pruebaclientevf.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Creada para asignar timeOut a las llamadas al servicio web de AEAT
 * @author jagv en TQ Retail S.L.
 */
public class BindingProviderProperties {
   private static final Logger log = LoggerFactory.getLogger(BindingProviderProperties.class);
    public static final java.lang.String CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout";
    public static final java.lang.String REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout";
}
