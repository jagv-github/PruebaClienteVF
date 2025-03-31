/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqretail.pruebaclientevf;

import com.tqretail.pruebaclientevf.eventListeners.EvEnvioRealizado;
import com.tqretail.pruebaclientevf.eventListeners.IEvEnvioRealizadoListener;
import com.tqretail.pruebaclientevf.util.UtilWebService;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.ConsultaFactuSistemaFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.DatosAdicionalesRespuestaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr.LRFiltroRegFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.IndicadorPaginacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.RegistroRespuestaConsultaRegFacturacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.RespuestaConsultaType.PeriodoImputacion;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr.ResultadoConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.EstadoEnvioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaExpedidaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro.RespuestaRegFactuSistemaFacturacionType;
//import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion.SfPortTypeVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.sistemafacturacion_wsdl.SfPortTypeVerifactu;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraConsultaSf;

import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CalificacionOperacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ClaveTipoFacturaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DatosPresentacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DesgloseType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DetalleType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.EncadenamientoFacturaAnteriorType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaBCType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ObligadoEmisionConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PeriodoImputacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PersonaFisicaJuridicaESType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PersonaFisicaJuridicaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PrimerRegistroCadenaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.RegistroFacturacionAltaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SiNoType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SistemaInformaticoType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministrolr.RegFactuSistemaFacturacion;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministrolr.RegistroFacturaType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import pruebasimple.eventListeners.EvEnvioRealizado;
//import pruebasimple.eventListeners.IEvEnvioRealizadoListener;
//import util.UtilWebService;
//import wsAeat.CabeceraType;
//import wsAeat.CalificacionOperacionType;
//import wsAeat.ClaveTipoFacturaType;
//import wsAeat.DatosPresentacionType;
//import wsAeat.DesgloseType;
//import wsAeat.DetalleType;
//import wsAeat.EncadenamientoFacturaAnteriorType;
//import wsAeat.EstadoEnvioType;
//import wsAeat.IDFacturaExpedidaType;
//import wsAeat.PersonaFisicaJuridicaESType;
//import wsAeat.PersonaFisicaJuridicaType;
//import wsAeat.PrimerRegistroCadenaType;
//import wsAeat.RespuestaExpedidaType;
//import wsAeat.RespuestaRegFactuSistemaFacturacionType;
//import wsAeat.SfPortTypeVerifactu;
//import wsAeat.RegFactuSistemaFacturacion;
//import wsAeat.RegistroFacturaType;
//import wsAeat.RegistroFacturacionAltaType;
//import wsAeat.SiNoType;
//import wsAeat.SistemaInformaticoType;
//import wsAeat.util.UtilWebService;

/**
 *
 * @author Usuario
 */
public class TareaEnvio {

    private static final Logger log = LoggerFactory.getLogger(TareaEnvio.class);
    private boolean salidaPorTimeOut = Boolean.FALSE;
    public static final String MASCARA_FECHA_TIME = "dd-MM-yyyy HH:mm:ss";
    public static final String MASCARA_FECHA_PRESENTA = "dd-MM-yyyy";
    public static final String DESCRIPCION_FRA_VENTA = "Venta de mercancia";
    public static final String NOMBRE_RAZON_EMISOR = "NECTALIA FIRST FRUIT S.L";
    public static final String NIF_EMISOR = "B21293295";

    public static final String SIST_INFORMATICO_NIF = "B91104059";
    public static final String SIST_INFORMATICO_NOMBRERAZON = "TQ RETAIL S.L.";
    public static final String SIST_INFORMATICO_NOMBRE = "TQVERIFACTU";
    public static final String SIST_INFORMATICO_ID = "1";
    public static final String SIST_INFORMATICO_VERSION = "1.0.0";
    public static final String SIST_INFORMATICO_NROINSTAL = "123";
    public static final SiNoType SIST_INFORMATICO_SOLO_VERIFACTU = SiNoType.S;
    public static final SiNoType SIST_INFORMATICO_MULTI_OT = SiNoType.S;
    public static final SiNoType SIST_INFORMATICO_MULTIPLES_OT = SiNoType.N;

    private Date fechaLocalEnvio = new Date();
    private EvEnvioRealizado evEnvioRealizado = new EvEnvioRealizado(this, 1, null, fechaLocalEnvio,
            EstadoEnvioType.INCORRECTO, "0");
    private ArrayList listaSuscriptoresEvEnvioRealizado = new ArrayList();

    private JFrame frm;
    private PantallaCtrl ctrl;

//    public TareaEnvio(JFrame frm) {
//        this.frm = frm;
//    }

    public TareaEnvio(PantallaCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void addSuscriptores_EvEnvioRealizado(IEvEnvioRealizadoListener listener) {
        // agregamos el escuchador a nuestra lista. Este metodo es llamado
        // por quien quiera escuchar el evento Ev_1 aqui
        listaSuscriptoresEvEnvioRealizado.add(listener);
    }

    private void avisaSuscriptores_EvEnvioRealizado(EvEnvioRealizado evento) {
        ListIterator li = listaSuscriptoresEvEnvioRealizado.listIterator();
        while (li.hasNext()) {
            // Convertimos (CAST) de nuestro objeto
            IEvEnvioRealizadoListener listener = (IEvEnvioRealizadoListener) li.next();
            // Ejecutamos el metodo manejador del evento con los parametros necesarios
            listener.EvEnvioRealizado(evento);
        }
    }

    public void ejecutar() throws Exception {
        TareaSW miTarea = new TareaSW();
//        miPB = new BarraProgreso(frm);
//        miPB.getBarraProgreso().setString("Preparando facturas para envio  ...: ");

        // anadimos a la tarea el listener del cambio en el proreso y fin de la misma
        miTarea.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent event) {
//                log.trace("event tarea:" + event.getPropertyName());
                switch (event.getPropertyName()) {
                    case "progress":
//                        if (miPB != null) {
//                            int valor = (Integer) event.getNewValue();
//                            if (valor < 100) {
//                                miPB.getBarraProgreso().setString("0%");
//                                miPB.getBarraProgreso().setString(String.format("%d%%", valor));
//                            } else {
//                                miPB.getBarraProgreso().setString("Realizando envio a AEAT ...");
//                            }
//
//                        }
                        break;
                    case "state":
                        switch ((SwingWorker.StateValue) event.getNewValue()) {
                            case DONE:
//                                miPB.setVisible(false);
                                log.info("Tarea finalizada");
//                                UtilProg.cursorNormal(ctrl);
                                if (!salidaPorTimeOut) {
                                    avisaSuscriptores_EvEnvioRealizado(evEnvioRealizado);
                                    System.out.println("Aqui hay que avisar a suscriptores del evento envioRealizado");
                                }
//                                if (miPB != null) {
//                                    miPB.setVisible(Boolean.FALSE);
//                                }
                        }
                        break;
                }
            }
        });
//        UtilProg.cursorEspera(ctrl);

        miTarea.execute();  // ejecutar la tarea de actualizacion
    }

    public class TareaSW extends SwingWorker<Void, String> {

        public TareaSW() throws Exception {
        }

        @Override
        public Void doInBackground() {
            try {

//                publish("TipoComunicacion : " + tipoComunicacion.getTexto().toUpperCase() + ". Preparando facuras a realizar . . .");
//                log.info("TipoComunicacion : " + tipoComunicacion.getTexto().toUpperCase() + ". Inicio preparacion facturasAeat");
                log.info("TipoComunicacion. Inicio preparacion facturasAeat");

                RegFactuSistemaFacturacion listaFacturasAeat = preparaFacturasAeat(null);
                evEnvioRealizado.setNroFrasEnviadas(listaFacturasAeat.getRegistroFactura().size());

                log.trace("fin preparacion facturasAeat. Preparadas:"
                        + listaFacturasAeat.getRegistroFactura().size());
                publish("");
                if (listaFacturasAeat.getRegistroFactura().isEmpty()) {
                    log.info("No hay facturas a enviar");
//                    Mensajes.mostrarMensajeSimple(Literales.MSG_NO_HAY_FACTURAS_VALIDAS);
                    evEnvioRealizado.setRespuesta(null);
                    evEnvioRealizado.setResultado(1);
                    evEnvioRealizado.setFechaEnvio(fechaLocalEnvio);
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I2:" + Literales.MSG_NO_HAY_FACTURAS_VALIDAS, Boolean.TRUE);
//                    }

                    return null;
                }
                // hay facturas

                String xmlString = UtilWebService.toXmlString(listaFacturasAeat);
                log.info(xmlString);
                SfPortTypeVerifactu soapPortEntornoPruebas = UtilWebService.obtenerSoapPortPruebas(false);
//                SfPortTypeVerifactu soapPortEntornoPruebas = UtilWebService.obtenerSoapPortPruebas();
//                SfPortTypeVerifactu soapPortEntornoPruebas = UtilWebService.obtenerSoapPortProduccion(false);
//                Estru_SoapPortEmitidas estruSoapPort = UtilWebService.obtenerSoapPort_Emitidas();
                if (soapPortEntornoPruebas == null) {
                    evEnvioRealizado.setResultado(-2);
                    evEnvioRealizado.setRespuesta(null);
                    evEnvioRealizado.setFechaEnvio(fechaLocalEnvio);
                    log.error("No se ha podido obtener el soapPort");
                    return null;
                }

                publish("Enviando facturas ...");
//                log.info("TipoComunicacion : " + tipoComunicacion.getTexto().toUpperCase() + ". Nro. facturas incluidas en el envio:" + listaFacturasAeat.getRegistroLRFacturasEmitidas().size());
//                log.info("Enviar -->");
                publish("Enviando facturas ...");
                log.info(" Nro. facturas incluidas en el envio:" + listaFacturasAeat.getRegistroFactura().size());
                log.info("Enviar -->");

                // activamos un timer
                Timer timer = new Timer(10000 * 2, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // si cumplido el timer estamos esperando es
                        // que la conexion no va bien. Abrimos la ventana y mostramos mensaje
                        publish("Proceso cancelado ");
                        salidaPorTimeOut = Boolean.TRUE;
                        avisaSuscriptores_EvEnvioRealizado(new EvEnvioRealizado(this, -1, null, fechaLocalEnvio));
                        log.error("Cancelado.  Ttimeout");
                    }
                });
                timer.setRepeats(Boolean.FALSE);
                timer.start();

//                RespuestaConsultaFactuSistemaFacturacionType respuesta = null;
//                RespuestaRegFactuSistemaFacturacionType respuesta = null;
                List<RespuestaExpedidaType> respuesta = null;

//                RespuestaLRFEmitidasType respuesta = null;
                Holder<CabeceraType> cabecera = getCabecera();
                Holder<DatosPresentacionType> datosPresenta = new Holder<>(getDatosPresenta());
                Holder<String> CSV = new Holder<>("");
                Holder<String> tiempoEspera = new Holder<>("");
                Holder<EstadoEnvioType> estadoEnvio = new Holder<>(EstadoEnvioType.CORRECTO);
                Holder<List<RespuestaExpedidaType>> respuestaLinea = new Holder<>();

                try {

                    // pasamos el request a formato xml para mostrarlo en el trace
//                    String xmlString = UtilWebService.toXmlString(listaFacturasAeat); // lo hemos puesto mas arriba
//                    log.info(xmlString);
                    // solicitud de consulta
                    Holder<CabeceraConsultaSf> cabeceraConsulta = getCabeceraConsulta();
                    LRFiltroRegFacturacionType filtroConsulta = getFiltroConsulta();
                    DatosAdicionalesRespuestaType datosAdicionalesRespuesta = new DatosAdicionalesRespuestaType();
                    Holder<PeriodoImputacion> periodoImputacion = new Holder<>();

                    Holder<IndicadorPaginacionType> indicadorPaginacion = null;
                    Holder<ResultadoConsultaType> resultadoConsulta = null;
                    Holder<List<RegistroRespuestaConsultaRegFacturacionType>> registroRespuestaConsultaFactuSistemaFacturacion = null;
                    Holder<IDFacturaExpedidaBCType> clavePaginacion = null;

                    ConsultaFactuSistemaFacturacionType consulta = new ConsultaFactuSistemaFacturacionType();
                    consulta.setCabecera(cabeceraConsulta.value);
                    consulta.setFiltroConsulta(filtroConsulta);

                    xmlString = UtilWebService.toXmlString(consulta);
                    log.info(xmlString);

//                    BindingProvider bindingProvider = (BindingProvider) soapPortEntornoPruebas;
//                    Map<String, Object> rc = bindingProvider.getResponseContext();
//
//                    bindingProvider.getRequestContext().put(
//                            BindingProvider.ENDPOINT_ADDRESS_PROPERTY, consulta);


                    
                    soapPortEntornoPruebas.consultaFactuSistemaFacturacion(cabeceraConsulta,
                            filtroConsulta, datosAdicionalesRespuesta,
                            periodoImputacion, indicadorPaginacion,
                            resultadoConsulta,
                            registroRespuestaConsultaFactuSistemaFacturacion, clavePaginacion);

//                    // Aqui se realiza el envio realmente
//                    soapPortEntornoPruebas.regFactuSistemaFacturacion(cabecera,
//                            listaFacturasAeat.getRegistroFactura(),
//                            CSV, datosPresenta, tiempoEspera, estadoEnvio, respuestaLinea);
                    respuesta = respuestaLinea.value;

//                    respuesta = soapPortEntornoPruebas.suministroLRFacturasEmitidas(listaFacturasAeat);
                    // pasamos la respuesta a formato xml para mostrarlo en el trace
//                    xmlString = UtilWebService.toXmlString(respuesta);
                    xmlString = UtilWebService.toXmlString(respuestaLinea.value);
                    log.info(xmlString);

                    timer.stop(); // paramos el timer porque ya he conseguido conexion

                    if (!salidaPorTimeOut) {
                        log.trace("Envio realizado.");
                    } else {
                        log.trace("timeOut detectado");
                    }
                    publish("");
                } catch (Exception e) {
                    publish("");
                    timer.stop();
                    log.error("Error en envio:" + e.getMessage());
                    evEnvioRealizado.setResultado(-2);
                    evEnvioRealizado.setTextoError(e.getMessage());
                    if (e.getMessage().toUpperCase().contains("TIMED OUT")) {
                        evEnvioRealizado.setListaRespuestas(respuesta);
                        evEnvioRealizado.setFechaEnvio(fechaLocalEnvio);
                        return null;
                    }
                }
                if (!salidaPorTimeOut) {
                    if (respuesta != null) {
//                        log.trace("respuesta  global :" + respuesta.getEstadoEnvio().toString()
//                                + " Nro. fras informadas en respuesta:" + respuesta.getRespuestaLinea().size());
                        log.trace("respuesta  global :" + estadoEnvio.value.toString()
                                + " Nro. fras informadas en respuesta:" + respuesta.size());

                    } else {
                        log.error("Resupuesta obtenida: " + null);
                    }
                    evEnvioRealizado.setListaRespuestas(respuesta);
                    if (evEnvioRealizado.getResultado() != -2) {
//                        // el -2 indica que ha habido un error de comunicaciones o timeout
//                        // en el envio
                        evEnvioRealizado.setResultado(0);
                    }
                    evEnvioRealizado.setFechaEnvio(fechaLocalEnvio);
                    evEnvioRealizado.setEstadoEnvio(estadoEnvio.value);
                    evEnvioRealizado.setTiempoEspera(tiempoEspera.value);

                } else {
                    // registrar en el log la respuesta
                    registrarRespuestaTimeOut(respuesta);
                }
            } catch (Exception e) {
//                if (Perfil.isModoEjeAutomatico()) {
//                    MensajeAuto.grabaMsgSesionAuto("I2:Detectado error en el proceso de envío");
//                    MensajeAuto.grabaMsgDetalleErrSesionAuto("I2:Error dentro de la doInbackground:" + e.getMessage());
//                }
                log.error("Error dentro de la doInbackground:" + e.getMessage());
            }
            return null;
        }

        /**
         * Esto traslada los mensajes realizados con publish a label del
         * panelEstado Recibe como paremtro un List<String> ya que es String el
         * segundo parametro del SwingWorker
         *
         * @param chunks
         */
        @Override
        protected void process(List<String> chunks) {
            for (int i = 0; i < chunks.size(); i++) {
                ctrl.getLblEstado().setText(chunks.get(i));
            }
        }

        @Override
        protected void done() {
        }

        // -------------  metodos auxiliares del swinworker -------------------
        /**
         * Este metodo de momento crea una lista con una sola factura y rellena
         * los datos de la factura a mano Cuando esté definitiva partirá de una
         * lista de facturas recibida del cliente de este servicio que
         * convertirá a una lista de facturas en formato para enviar a
         * Verifactu. Cada factura será convertida de un formato a otro en el
         * Manager
         *
         * @param regAnterior.
         * @return
         */
        private RegFactuSistemaFacturacion preparaFacturasAeat(EncadenamientoFacturaAnteriorType regAnterior) {
            RegFactuSistemaFacturacion listaFacturas = new RegFactuSistemaFacturacion();
            // nos centramos solo en la lista de fras. El resto de los datos los aportamos luego

            // cargamos una factura
            RegistroFacturaType fraAEAT = new RegistroFacturaType();
            RegistroFacturacionAltaType regAlta = new RegistroFacturacionAltaType();
            regAlta.setIDVersion("1.0");// debe estar en un parametro. Es la version de verifactu actual)ConstantesAEAT L16
            // IDFactura
            IDFacturaExpedidaType idFra = new IDFacturaExpedidaType();
            idFra.setIDEmisorFactura(NIF_EMISOR); // nif emisor
            idFra.setNumSerieFactura("F-2025/00001");
            idFra.setFechaExpedicionFactura(new SimpleDateFormat(MASCARA_FECHA_PRESENTA).format(new Date()));
            regAlta.setIDFactura(idFra);

            // Nombre Emisor
            regAlta.setNombreRazonEmisor(NOMBRE_RAZON_EMISOR);

            // tipoFactura
            regAlta.setTipoFactura(ClaveTipoFacturaType.F_1);//Factura normal

            // Fecha Operacion (No obligatorio)
            regAlta.setFechaOperacion(idFra.getFechaExpedicionFactura());

            // Descripcion 
            regAlta.setDescripcionOperacion(DESCRIPCION_FRA_VENTA);

            // Destinatario /s
            RegistroFacturacionAltaType.Destinatarios destinatarios = new RegistroFacturacionAltaType.Destinatarios();
            PersonaFisicaJuridicaType destinatario = new PersonaFisicaJuridicaType();
            destinatario.setNIF("11111111KH");
            destinatario.setNombreRazon("Destinatario Factura");
            destinatarios.getIDDestinatario().add(destinatario);
            regAlta.setDestinatarios(destinatarios);

            //Desglose
            // Puede haber varios desgloses: distintos ivas o bien cantidades exentas, etc
            DesgloseType desglose = new DesgloseType();
            // Primer desglose
//            DetalleType detalle = new DetalleType();
//            detalle.setImpuesto("01"); // iva (segun lista AEAT L1). Por defecto se tomaría este valor
//            detalle.setClaveRegimen("01"); // operacion regimen general L8A /L8B
//            detalle.setCalificacionOperacion(CalificacionOperacionType.S_1);
//            detalle.setTipoImpositivo(new BigDecimal(21).toString());
//            detalle.setBaseImponibleOimporteNoSujeto(new BigDecimal(1000).toString());
//            detalle.setCuotaRepercutida(new BigDecimal(210).toString());
//            desglose.getDetalleDesglose().add(detalle);
            DetalleType detalle = new DetalleType();
            detalle.setImpuesto("01"); // iva (segun lista AEAT L1). Por defecto se tomaría este valor
            detalle.setClaveRegimen("01"); // operacion regimen general L8A /L8B
            detalle.setCalificacionOperacion(CalificacionOperacionType.S_1);
            detalle.setTipoImpositivo(new BigDecimal(40).toString());
            detalle.setBaseImponibleOimporteNoSujeto(new BigDecimal(2).toString());
            detalle.setCuotaRepercutida(new BigDecimal(1).toString());
            desglose.getDetalleDesglose().add(detalle);

//            // otro desglose
//            detalle = new DetalleType();
//            detalle.setImpuesto("01"); // iva (segun lista AEAT L1). Por defecto se tomaría este valor
//            detalle.setClaveRegimen("01"); // operacion regimen general L8A /L8B
//            detalle.setCalificacionOperacion(CalificacionOperacionType.S_1);
//            detalle.setTipoImpositivo(new BigDecimal(4).toString());
//            detalle.setBaseImponibleOimporteNoSujeto(new BigDecimal(200).toString());
//            detalle.setCuotaRepercutida(new BigDecimal(8).toString());
//            desglose.getDetalleDesglose().add(detalle);
            regAlta.setDesglose(desglose); // metemos el desglose en el regAlta

            // cuota total
            BigDecimal cuotaTotal = new BigDecimal(210).add(new BigDecimal(8));
            regAlta.setCuotaTotal(cuotaTotal.toString());

            // importe total
            BigDecimal importeTotal = new BigDecimal(1000).add(new BigDecimal(210))
                    .add(new BigDecimal(200)).add(new BigDecimal(8));
            regAlta.setImporteTotal(importeTotal.toString());

            // encadenamiento
            RegistroFacturacionAltaType.Encadenamiento encadenamiento = new RegistroFacturacionAltaType.Encadenamiento();
            if (regAnterior == null) {
                encadenamiento.setPrimerRegistro(PrimerRegistroCadenaType.S);
            } else {
                // este regAnterior lo tomaremos en su momento de la primera factura que tengamos
                // que enviar
                encadenamiento.setRegistroAnterior(regAnterior);
            }
            regAlta.setEncadenamiento(encadenamiento);

            // Sistema informatico
            SistemaInformaticoType sistemaInformatico = new SistemaInformaticoType();
            sistemaInformatico.setNIF(SIST_INFORMATICO_NIF);
            sistemaInformatico.setNombreRazon(SIST_INFORMATICO_NOMBRERAZON);
            sistemaInformatico.setNombreRazon(SIST_INFORMATICO_NOMBRE);
            sistemaInformatico.setVersion(SIST_INFORMATICO_VERSION);
            sistemaInformatico.setIdSistemaInformatico(SIST_INFORMATICO_ID);
            sistemaInformatico.setIdSistemaInformatico(SIST_INFORMATICO_NROINSTAL);
            sistemaInformatico.setTipoUsoPosibleSoloVerifactu(SIST_INFORMATICO_SOLO_VERIFACTU);
            sistemaInformatico.setTipoUsoPosibleMultiOT(SIST_INFORMATICO_MULTI_OT);
            sistemaInformatico.setIndicadorMultiplesOT(SIST_INFORMATICO_MULTIPLES_OT);
            regAlta.setSistemaInformatico(sistemaInformatico);

            // FechaHoraHusoGenRegistro1
            GregorianCalendar ahora = new GregorianCalendar(TimeZone.getTimeZone("Europe/Madrid"));
            XMLGregorianCalendar fecha;
            try {
                fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(ahora);
                regAlta.setFechaHoraHusoGenRegistro(fecha);
            } catch (DatatypeConfigurationException ex) {
                java.util.logging.Logger.getLogger(TareaEnvio.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Huella
            regAlta.setTipoHuella("01");// tipo de Huella. ConstAEAT L12);
            regAlta.setHuella("Huella");

            fraAEAT.setRegistroAlta(regAlta);
            listaFacturas.getRegistroFactura().add(fraAEAT);

            return listaFacturas;
        }

        /**
         * Preparar la lista de facturas en formato Aeat a enviar
         *
         * @return
         */
//        private SuministroLRFacturasEmitidas preparaFacturasAeat() throws ErrorGenericoDatos {
//            int nroFrasAPreparar = listaEstruFacturasemiEnviar.size();
//            int nroFrasPreparadas = 0;
//            BigDecimal progreso = BigDecimal.ZERO;
//            log.info("Cargando lista de facturas ... ");
//            // cargamos la lista de facturas en formato aeat partiendo de las nuestras
//
//            SuministroLRFacturasEmitidas listaFacturasAeat = new SuministroLRFacturasEmitidas();
//            listaFacturasEnviar = new ArrayList<>();
//
//            // cargamos la cabecera del envio
//            CabeceraSii cab = new CabeceraSii();
//            cab.setIDVersionSii(ConstAEAT.SII_Version);
//            cab.setTitular(UtilAeat.getTitular());
//            cab.setTipoComunicacion(tipoComunicacion.getValorAeat());
//
//            listaFacturasAeat.setCabecera(cab);
//
//            for (Estru_FacturasEmiNew estruFralocal : listaEstruFacturasemiEnviar) {
//                if (!estruFralocal.getStCheckEnvio()) {
//                    continue; // no esta seleccionada para envio. Continuar con la siguiente
//                }
//                String estadoFra = estruFralocal.getFacturaemi().getEstado();
//                switch (tipoComunicacion) {
//                    case BAJA:
//                        if (estadoFra.equalsIgnoreCase(Const.ListaEstadoEnvioFactura.PENDIENTE.getValor())) {
//                            continue;
//                        }
//                        break;
//                    case MODIF:
//                        if (!estadoFra.equalsIgnoreCase(Const.ListaEstadoEnvioFactura.PDTE_MODIF.getValor())) {
//                            continue;
//                        }
//                        break;
//                    case ALTA:
//                    default:
//                        if (!estadoFra.equalsIgnoreCase(Const.ListaEstadoEnvioFactura.PENDIENTE.getValor())) {
//                            continue;
//                        }
//                }
//                SII_FactuEmi fraLocal = estruFralocal.getFacturaemi();
//                listaFacturasEnviar.add(fraLocal);
//                nroFrasPreparadas++;
//
//                // actualizamos valor de barra de progreso
//                progreso = new BigDecimal(nroFrasPreparadas).divide(new BigDecimal(nroFrasAPreparar), 2, RoundingMode.UP);
//                setProgress(progreso.multiply(new BigDecimal(100)).intValue());
//
//                publish("Preparando factura " + fraLocal.getNumSerieFacturaEmisor());
//                log.trace("Preparando factura " + fraLocal.getNumSerieFacturaEmisor());
//                try {
//                    LRfacturasEmitidasType facturaAeat = FactEmitidasManager.crearFacturaEmitidaAeat(fraLocal);
//
//                    // anadimos esta factura a la lista
//                    listaFacturasAeat.getRegistroLRFacturasEmitidas().add(facturaAeat);
//
//                    if (facturaAeat == null) {
//                        log.trace("es null!!!!");
//                    }
//                    log.trace("incluida fra:" + facturaAeat.getIDFactura().getNumSerieFacturaEmisor());
////                    log.trace("facturas icluidas por ahora:" + listaFacturasAeat.getRegistroLRFacturasEmitidas().size());
////                    for (  LRfacturasEmitidasType fra : listaFacturasAeat.getRegistroLRFacturasEmitidas()) {
////                        log.trace("fractura incluida:" + fra.getIDFactura().getNumSerieFacturaEmisor());
////                    }
//
//                } catch (Exception ex) {
//                    estruFralocal.setStError(-1);
//                    log.trace("anotar error:" + ex.getMessage());
//                    estruFralocal.setTextoErrorEnFra(ex.getMessage());
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("I3:Error preparando factura " + fraLocal.getNumSerieFacturaEmisor() + ": No se incluye en el envio");
//                        MensajeAuto.grabaMsgDetalleErrSesionAuto("I3:Error preparando factura " + fraLocal.getNumSerieFacturaEmisor() + ex.getMessage());
//                    }
//                    log.error("Error preparando factura :" + fraLocal.getNumSerieFacturaEmisor() + ":" + ex.getMessage());
//
//                }
//            }
//            return listaFacturasAeat;
//        }
    }

    private void registrarRespuestaTimeOut(RespuestaRegFactuSistemaFacturacionType respuesta) {
        log.info("Respuesta recibida fuera de tiempo ");
//        if (Perfil.isModoEjeAutomatico()) {
//            MensajeAuto.grabaMsgSesionAuto("I3:Respuesta recibida fuera de tiempo",
//                    Boolean.TRUE);
//        }
        if (respuesta != null) {
            log.info("Respuesta NO es null");
//            String CSV = respuesta.getCSV();
//            String timeStampPresenta = new SimpleDateFormat(MASCARA_FECHA_TIME).format(new Date());
//            for (RespuestaExpedidaType respuestaFraPresentada : respuesta.getRespuestaLinea()) {
//                if (respuesta.getDatosPresentacion() != null) {
//                    if (respuesta.getDatosPresentacion().getTimestampPresentacion() != null) {
//                        timeStampPresenta = respuesta.getDatosPresentacion().getTimestampPresentacion();
//                    }
//                }
//                String serieFra = respuestaFraPresentada.getIDFactura().getNumSerieFactura();
//                String ejercicio = ejercicioDef;
//                SII_FactuEmi facturaLocalEnviada = obtenerFraLocal(listaFacturasemiEnviar, serieFra, ejercicio);
//                Estru_FacturasEmiNew estruFraLocalEnviada = obtenerEstruFraLocal(listaEstruFacturasemiEnviar, serieFra, ejercicio);
//                if (estruFraLocalEnviada != null) {
//                    log.info("Factura enviada:" + estruFraLocalEnviada.getFacturaemi().getNumSerieFacturaEmisor()
//                            + " resultado:" + respuestaFraPresentada.getEstadoRegistro().toString()
//                            + " texto:" + respuestaFraPresentada.getDescripcionErrorRegistro());
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("E1:Factura enviada:"
//                                + estruFraLocalEnviada.getFacturaemi().getNumSerieFacturaEmisor()
//                                + " resultado:" + respuestaFraPresentada.getEstadoRegistro().toString()
//                                + " texto:" + respuestaFraPresentada.getDescripcionErrorRegistro(),
//                                Boolean.TRUE);
//                    }
//                } else {
//                    log.error("No localizada factura enviada partiendo de la respuesta !");
//                    MensajeAuto.grabaMsgSesionAuto("I3:No localizada factura enviada partiendo de la respuesta !",
//                            Boolean.TRUE);
//                }
//            }
        } else {
            log.error("Valor nulo en respuesta");
//            if (Perfil.isModoEjeAutomatico()) {
//                MensajeAuto.grabaMsgSesionAuto("I3:Respuesta:NULL",
//                        Boolean.TRUE);
//            }
        }

    }

    private void registrarRespuestaTimeOut(List<RespuestaExpedidaType> respuesta) {
        log.info("Respuesta recibida fuera de tiempo ");
//        if (Perfil.isModoEjeAutomatico()) {
//            MensajeAuto.grabaMsgSesionAuto("I3:Respuesta recibida fuera de tiempo",
//                    Boolean.TRUE);
//        }
        if (respuesta != null) {
            log.info("Respuesta NO es null");
//            String CSV = respuesta.getCSV();
//            String timeStampPresenta = new SimpleDateFormat(MASCARA_FECHA_TIME).format(new Date());
//            for (RespuestaExpedidaType respuestaFraPresentada : respuesta.getRespuestaLinea()) {
//                if (respuesta.getDatosPresentacion() != null) {
//                    if (respuesta.getDatosPresentacion().getTimestampPresentacion() != null) {
//                        timeStampPresenta = respuesta.getDatosPresentacion().getTimestampPresentacion();
//                    }
//                }
//                String serieFra = respuestaFraPresentada.getIDFactura().getNumSerieFactura();
//                String ejercicio = ejercicioDef;
//                SII_FactuEmi facturaLocalEnviada = obtenerFraLocal(listaFacturasemiEnviar, serieFra, ejercicio);
//                Estru_FacturasEmiNew estruFraLocalEnviada = obtenerEstruFraLocal(listaEstruFacturasemiEnviar, serieFra, ejercicio);
//                if (estruFraLocalEnviada != null) {
//                    log.info("Factura enviada:" + estruFraLocalEnviada.getFacturaemi().getNumSerieFacturaEmisor()
//                            + " resultado:" + respuestaFraPresentada.getEstadoRegistro().toString()
//                            + " texto:" + respuestaFraPresentada.getDescripcionErrorRegistro());
//                    if (Perfil.isModoEjeAutomatico()) {
//                        MensajeAuto.grabaMsgSesionAuto("E1:Factura enviada:"
//                                + estruFraLocalEnviada.getFacturaemi().getNumSerieFacturaEmisor()
//                                + " resultado:" + respuestaFraPresentada.getEstadoRegistro().toString()
//                                + " texto:" + respuestaFraPresentada.getDescripcionErrorRegistro(),
//                                Boolean.TRUE);
//                    }
//                } else {
//                    log.error("No localizada factura enviada partiendo de la respuesta !");
//                    MensajeAuto.grabaMsgSesionAuto("I3:No localizada factura enviada partiendo de la respuesta !",
//                            Boolean.TRUE);
//                }
//            }
        } else {
            log.error("Valor nulo en respuesta");
//            if (Perfil.isModoEjeAutomatico()) {
//                MensajeAuto.grabaMsgSesionAuto("I3:Respuesta:NULL",
//                        Boolean.TRUE);
//            }
        }

    }

    //---------------------------------------------------------------------------------
    private Holder<CabeceraType> getCabecera() {
        Holder<CabeceraType> hCab = new Holder<>();
        PersonaFisicaJuridicaESType persFis = getPersonaFisicaJuridica();
        CabeceraType cabecera = new CabeceraType();
        cabecera.setObligadoEmision(persFis);
        hCab.value = cabecera;

        return hCab;
    }

    private PersonaFisicaJuridicaESType getPersonaFisicaJuridica() {
        PersonaFisicaJuridicaESType persFis = new PersonaFisicaJuridicaESType();
        persFis.setNombreRazon("JAGV");
        persFis.setNIF("24168602H");
        return persFis;
    }

    private DatosPresentacionType getDatosPresenta() {
        DatosPresentacionType datosPresenta = new DatosPresentacionType();
        datosPresenta.setNIFPresentador("24168602H");
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date2 = null;
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException ex) {
            java.util.logging.Logger.getLogger(TareaEnvio.class.getName()).log(Level.SEVERE, null, ex);
        }
        datosPresenta.setTimestampPresentacion(date2);

        return datosPresenta;
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

}
