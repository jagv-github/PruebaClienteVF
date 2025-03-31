/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import com.tqretail.pruebaclientevf.eventListeners.EvEnvioRealizado;
import com.tqretail.pruebaclientevf.eventListeners.IEvEnvioRealizadoListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class PruebaEnvioBean implements IEvEnvioRealizadoListener {

    private static final Logger log = LoggerFactory.getLogger(PruebaEnvioBean.class);
    PantallaCtrl ctrl;
    TareaEnvio tareaEnvio;

    public PruebaEnvioBean(PantallaCtrl ctrl) {
        this.ctrl = ctrl;
    }

    /**
     * ejecutar envio de altas y modificaciones de facturas emitidas
     *
     * @param tipoComunicacion
     * @throws ErrorGenericoDatos
     */
    public void ejecutaEnvio() throws Exception {
        // obtenemos la lista de estructuras de facturas a enviar
        //obtenerListaEstruFacturasEmiEnviar();

        // instanciamos la tarea que las enviara, suscribiendonos a su evento
        tareaEnvio = new TareaEnvio(ctrl);
        tareaEnvio.addSuscriptores_EvEnvioRealizado(this);
        // ejecutamos el envio
        tareaEnvio.ejecutar();

    }

    /**
     * Evento que se dispara cuando termina el envio
     *
     * @param args
     */
    @Override
    public void EvEnvioRealizado(EvEnvioRealizado args) {
        log.trace("evento envio terminado ");
//        String ejercicioDef = "2017";
//        RespuestaLRFEmitidasType respuesta = args.getRespuesta();
//        if (respuesta != null) {
//
//            String CSV = respuesta.getCSV();
//            String timeStampPresenta = new SimpleDateFormat(Const.MASCARA_FECHA_TIME).format(new Date());
//            for (RespuestaExpedidaType respuestaFraPresentada : respuesta.getRespuestaLinea()) {
//                if (respuesta.getDatosPresentacion() != null) {
//                    if (respuesta.getDatosPresentacion().getTimestampPresentacion() != null) {
//                        timeStampPresenta = respuesta.getDatosPresentacion().getTimestampPresentacion();
//                    }
//                }
//                String serieFra = respuestaFraPresentada.getIDFactura().getNumSerieFacturaEmisor();
//                log.trace("serieFra:" + serieFra);
//
//                // la buscamos de un modo especial, como F3, pues ocurre que las fras F3 al principio
//                // de cada año tienen fecha del año nuevo, pero el ejercicio grabado es del antiguo
//                // ya que la factura a la que sustituyen es del antiguo, pero la nueva se emite 
//                // el nuevo año
//                String idTipoFraF3 = respuestaFraPresentada.getIDFactura().getNumSerieFacturaEmisor().substring(0, 2);
//                Estru_FacturasEmiNew estruFraLocal = null;
//                if (idTipoFraF3.equalsIgnoreCase("F3")) {
//                    estruFraLocal = tareaEnvio.obtenerEstruFraLocal_F3(listaEstruFacturasemiEnviar, serieFra);
//                } else {
//                    String ejer;
//                    try {
//                        Date fechaExpe = new SimpleDateFormat(Const.MASCARA_FECHA)
//                                .parse(respuestaFraPresentada.getIDFactura().getFechaExpedicionFacturaEmisor());
//                        ejer = new SimpleDateFormat("yyyy").format(fechaExpe);
//                    } catch (ParseException ex) {
//                        log.error("Error parse fecha datos respuessta recibida " + respuestaFraPresentada.getIDFactura().getFechaExpedicionFacturaEmisor());
//                        if (Perfil.isModoEjeAutomatico()) {
//                            MensajeAuto.grabaMsgSesionAuto("I3:Fra:" + serieFra + ":Error fecha datos respuessta ");
//                            MensajeAuto.grabaMsgDetalleErrSesionAuto("I3:Fra:" + serieFra + ":Error fecha datos respuessta :"
//                                    + respuestaFraPresentada.getIDFactura().getFechaExpedicionFacturaEmisor());
//                        }
//                        continue;
//                    }
//                    estruFraLocal = tareaEnvio.obtenerEstruFraLocal(listaEstruFacturasemiEnviar, serieFra, ejer);
//                }
//                if (estruFraLocal != null) {
//                    try {
//                        frasEmiCtrl.actuEstadoAltaMod(args.getFechaEnvio(), estruFraLocal.getFacturaemi(), respuestaFraPresentada, CSV, timeStampPresenta);
////                        throw new ErrorGenericoDatos("simular error grabacion");
//                    } catch (ErrorGenericoDatos ex) {
//                        log.error("Error modificando factura Local ");
//                        // Establecemos en la lista de estructuras que ha habido un error en esta
//                        estruFraLocal.setStError(-2); // error de grabacion en nuestras tablas. Pero factura enviada !
//                        estruFraLocal.setTextoErrorEnFra("Error actualizando estado de factura en nuestra Base de Datos"); // error de grabacion en nuestras tablas. Pero factura enviada !
//                        // quitamos el check de envio para esta factura en  el grid
//                        if (estruFraLocal.getFacturaemi().getEstado().equalsIgnoreCase(Const.ListaEstadoEnvioFactura.ENVIADO.getValor())) {
//                            estruFraLocal.setStCheckEnvio(Boolean.FALSE);
//                        }
//                        if (Perfil.isModoEjeAutomatico()) {
//                            MensajeAuto.grabaMsgSesionAuto("I3:Fra:" + serieFra + ":Error modificando estado factura en local");
//                            MensajeAuto.grabaMsgDetalleErrSesionAuto("I3:Fra:" + serieFra + ":Error modificando estado factura en local:"
//                                    + ex.getMessage());
//                        }
//
//                    }
//                } else {
//                    log.error("No localizada factura enviada partiendo de la respuesta !");
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I2:Fra:" + serieFra + ":Error localizando factura en local", Boolean.TRUE);
//                    }
//                    continue;
//                }
////                try {
////                    Date fechaExpe = new SimpleDateFormat(Const.MASCARA_FECHA)
////                            .parse(respuestaFraPresentada.getIDFactura().getFechaExpedicionFacturaEmisor());
////                    ejercicio = new SimpleDateFormat("YYYY").format(fechaExpe);
////                } catch (ParseException ex) {
////                    log.error("Error parse fecha datos respuessta recibida" + respuestaFraPresentada.getIDFactura().getFechaExpedicionFacturaEmisor());
////                }
//                EstadoRegistroType estadoRegistro = respuestaFraPresentada.getEstadoRegistro();
//                log.trace("CSV:" + CSV);
//
//                log.trace("Factura:" + serieFra
//                        + " estado registro:" + estadoRegistro.toString());
//                if (estadoRegistro != EstadoRegistroType.CORRECTO) {
//                    log.trace("Error:" + respuestaFraPresentada.getCodigoErrorRegistro()
//                            + ":" + respuestaFraPresentada.getDescripcionErrorRegistro());
//                    // estudiamos los casos en que lo damos por correcto el envio
////04/05/18                    
////                    switch (respuestaFraPresentada.getCodigoErrorRegistro().intValue()) {
////                        case 3000:
////                            respuestaFraPresentada.getRegistroDuplicado().getCodigoErrorRegistro();
////                            estruFraLocal.setStError(-9998);
////                            estruFraLocal.setStCheckEnvio(Boolean.FALSE);
////                            break;
////                        default:
////                            estruFraLocal.setStError(respuestaFraPresentada.getCodigoErrorRegistro().intValue());
////
////                    }
////                    estruFraLocal.setTextoErrorEnFra(respuestaFraPresentada.getDescripcionErrorRegistro());
//                    switch (respuestaFraPresentada.getCodigoErrorRegistro().intValue()) {
//                        case 3000:
//                            //04/05/18. Ahora viene en la respuesta la etiqueta registro duplicado
////                            estruFraLocal.setTextoErrorEnFra(respuestaFraPresentada.getRegistroDuplicado().getDescripcionErrorRegistro());
////                            estruFraLocal.setStError(-9998);
//                            RegistroDuplicadoType regDup = respuestaFraPresentada.getRegistroDuplicado();
//
//                            estruFraLocal.setTextoErrorEnFra(StringUtils.left(respuestaFraPresentada.getDescripcionErrorRegistro()
//                                    + ":" + regDup.getDescripcionErrorRegistro(), 100));
//
//                            if (regDup.getEstadoRegistro() == EstadoRegistroSIIType.CORRECTA) {
//                                estruFraLocal.setStError(-9998);
//                            }
//
//                            estruFraLocal.setStCheckEnvio(Boolean.FALSE);
//                            if (Perfil.isModoEjeAutomatico()) {
//                                String txtMsg = "I3:Fra:" + serieFra + ":" + respuestaFraPresentada.getDescripcionErrorRegistro()
//                                        + ". Estado registro:"
//                                        + regDup.getEstadoRegistro().toString();
//                                if (UtilProg.noEsVacioString(regDup.getDescripcionErrorRegistro())) {
//                                    txtMsg += ":" + regDup.getDescripcionErrorRegistro();
//                                }
//                                MensajeAuto.grabaMsgDetalleErrSesionAuto(txtMsg);
//                            }
//                            break;
//                        default:
//                            estruFraLocal.setStError(respuestaFraPresentada.getCodigoErrorRegistro().intValue());
//                            estruFraLocal.setTextoErrorEnFra(respuestaFraPresentada.getDescripcionErrorRegistro());
//                            if (Perfil.isModoEjeAutomatico()) {
//                                if (estadoRegistro == EstadoRegistroType.CORRECTO) {
//                                    MensajeAuto.grabaMsgSesionAuto("E4:Fra:" + serieFra + ":estado registro:"
//                                            + estadoRegistro.toString()
//                                            + ":" + respuestaFraPresentada.getDescripcionErrorRegistro(), Boolean.TRUE);
//                                } else {
//                                    MensajeAuto.grabaMsgSesionAuto("I3:Fra:" + serieFra + ":estado registro:"
//                                            + estadoRegistro.toString()
//                                            + ":" + respuestaFraPresentada.getDescripcionErrorRegistro(), Boolean.TRUE);
//
//                                }
//                            }
//
//                    }
//
//                } else {
//                    estruFraLocal.setStCheckEnvio(Boolean.FALSE);
//                    estruFraLocal.setStError(-9999);
//                    if (Perfil.isModoEjeAutomatico()) {
//                        if (estadoRegistro == EstadoRegistroType.CORRECTO) {
//                            MensajeAuto.grabaMsgDetalleErrSesionAuto("E4:Fra:" + serieFra + ":estado registro:"
//                                    + estadoRegistro.toString());
//                        } else {
//                            MensajeAuto.grabaMsgDetalleErrSesionAuto("I3:Fra:" + serieFra + ":estado registro:"
//                                    + estadoRegistro.toString());
//                        }
//                    }
//                }
//            }
//
//            boolean Hayerrores = Boolean.FALSE;
//            for (Estru_FacturasEmiNew estruFra : listaEstruFacturasemiEnviar) {
//                if (estruFra.getStError() > -9999) {
//                    Hayerrores = Boolean.TRUE;
//                    break;
//                }
//            }
//
//            if (Perfil.isModoEjeAutomatico()) {
//                MensajeAuto.grabaMsgSesionAuto("===================================", Boolean.TRUE);
//                MensajeAuto.grabaMsgSesionAuto("E2:EMITIDAS. Fin envio :"
//                        + respuesta.getEstadoEnvio().toString(), Boolean.TRUE);
//                if (listaEstruSeleccion.size() != listaEstruFacturasemiEnviar.size()) {
//                    MensajeAuto.grabaMsgSesionAuto("E3:ATENCION ENVIO INCOMPLETO. QUEDAN FRAS. EMITIDAS POR ENVIAR", Boolean.TRUE);
//                } else {
//                    if (args.getNroFrasEnviadas() != listaEstruFacturasemiEnviar.size()) {
//                        MensajeAuto.grabaMsgSesionAuto("E3:ATENCION ENVIO INCOMPLETO. QUEDAN FRAS. EMITIDAS POR ENVIAR", Boolean.TRUE);
//                    } else {
//                        if (args.getNroFrasEnviadas() != respuesta.getRespuestaLinea().size()) {
//                            MensajeAuto.grabaMsgSesionAuto("E3:ATENCION RESPUESTA INCOMPLETA. NRO. FRAS INFORMADAS EN LA RESPUESTA ES MENOR QUE LAS ENVIADAS", Boolean.TRUE);
//
//                        }
//                    }
//                }
//                MensajeAuto.grabaMsgSesionAuto("===================================", Boolean.TRUE);
//
//            }
//
//            if (!Hayerrores) {
//                Mensajes.mostrarMensajeSimple("Envio finalizado. Resultado :" + respuesta.getEstadoEnvio().toString());
//
//            } else {
//                if (!Perfil.isModoEjeAutomatico()) {
//                    new FactEmitidasDlgResuErrorEnvio(ctrl.ctrlGral.getFrm(), listaEstruFacturasemiEnviar);
//                }
//            }
//
//            if (Perfil.isModoEjeAutomatico()) {
//                avisa_SuscriptoresEvProcesosAuto(new EvProcesosAutoFinalizado(this, 1));
//            } else {
//
//                ejecutaConsultaAEAT(); // lanzamos la consulta a AEAT de lo que hemos hecho
//            }
//
//        } else {
//            switch (args.getResultado()) {
//                case -2:
//                    String msg = "";
//                    if (args.getTextoError() == null) {
//                        args.setTextoError("null");
//                    }
//                    if (args.getTextoError().toUpperCase().contains("READ")) {
//                        msg = "Sobrepasado tiempo de espera para recepcion de datos  de AEAT tras el envio";
//                        Mensajes.mostrarMensajeSimple(msg, JOptionPane.ERROR_MESSAGE);
//                    } else if (args.getTextoError().toUpperCase().contains("CONNECT")) {
//                        msg = "Sobrepasado tiempo de espera para conexion con servicio de AEAT";
//                        Mensajes.mostrarMensajeSimple(msg, JOptionPane.WARNING_MESSAGE);
//                    } else {
//                        msg = args.getTextoError();
//                        Mensajes.mostrarMensajeSimple("Error en comunicaciones con AEAT", JOptionPane.WARNING_MESSAGE);
//                    }
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I2:Error en comunicaciones:" + msg, Boolean.TRUE);
//                    }
//                    break;
//                case -1:
//                    Mensajes.mostrarMensajeSimple("Tiempo de espera agotado");
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I3:Tiempo de espera agotado", Boolean.TRUE);
//                    }
//                    break;
//                case 1:
//                    if (!Perfil.isModoEjeAutomatico()) {
//                        new FactEmitidasDlgResuErrorEnvio(ctrl.ctrlGral.getFrm(), listaEstruFacturasemiEnviar);
//                    }
//                    break;
//                case 0:
//                default:
//                    Mensajes.mostrarMensajeSimple("No hay respuesta valida ");
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I2:No hay respuesta válida !!", Boolean.TRUE);
//                    }
//
//            }
//            if (Perfil.isModoEjeAutomatico()) {
//                MensajeAuto.grabaMsgSesionAuto("===========================================================", Boolean.TRUE);
//                MensajeAuto.grabaMsgSesionAuto("E3:ERROR. ENVIO NO REALIZADO. QUEDAN FRAS. EMITIDAS POR ENVIAR", Boolean.TRUE);
//                MensajeAuto.grabaMsgSesionAuto("===========================================================", Boolean.TRUE);
//                avisa_SuscriptoresEvProcesosAuto(new EvProcesosAutoFinalizado(this, 2));
//            }
//        }

    }

}
