
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RespuestaConsultaFactuSistemaFacturacion_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", "RespuestaConsultaFactuSistemaFacturacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaDatosRegistroFacturacionType }
     * 
     */
    public RespuestaDatosRegistroFacturacionType createRespuestaDatosRegistroFacturacionType() {
        return new RespuestaDatosRegistroFacturacionType();
    }

    /**
     * Create an instance of {@link RespuestaConsultaType }
     * 
     */
    public RespuestaConsultaType createRespuestaConsultaType() {
        return new RespuestaConsultaType();
    }

    /**
     * Create an instance of {@link RespuestaConsultaFactuSistemaFacturacionType }
     * 
     */
    public RespuestaConsultaFactuSistemaFacturacionType createRespuestaConsultaFactuSistemaFacturacionType() {
        return new RespuestaConsultaFactuSistemaFacturacionType();
    }

    /**
     * Create an instance of {@link EstadoRegFactuType }
     * 
     */
    public EstadoRegFactuType createEstadoRegFactuType() {
        return new EstadoRegFactuType();
    }

    /**
     * Create an instance of {@link RegistroRespuestaConsultaRegFacturacionType }
     * 
     */
    public RegistroRespuestaConsultaRegFacturacionType createRegistroRespuestaConsultaRegFacturacionType() {
        return new RegistroRespuestaConsultaRegFacturacionType();
    }

    /**
     * Create an instance of {@link RespuestaDatosRegistroFacturacionType.FacturasRectificadas }
     * 
     */
    public RespuestaDatosRegistroFacturacionType.FacturasRectificadas createRespuestaDatosRegistroFacturacionTypeFacturasRectificadas() {
        return new RespuestaDatosRegistroFacturacionType.FacturasRectificadas();
    }

    /**
     * Create an instance of {@link RespuestaDatosRegistroFacturacionType.FacturasSustituidas }
     * 
     */
    public RespuestaDatosRegistroFacturacionType.FacturasSustituidas createRespuestaDatosRegistroFacturacionTypeFacturasSustituidas() {
        return new RespuestaDatosRegistroFacturacionType.FacturasSustituidas();
    }

    /**
     * Create an instance of {@link RespuestaDatosRegistroFacturacionType.Destinatarios }
     * 
     */
    public RespuestaDatosRegistroFacturacionType.Destinatarios createRespuestaDatosRegistroFacturacionTypeDestinatarios() {
        return new RespuestaDatosRegistroFacturacionType.Destinatarios();
    }

    /**
     * Create an instance of {@link RespuestaDatosRegistroFacturacionType.Encadenamiento }
     * 
     */
    public RespuestaDatosRegistroFacturacionType.Encadenamiento createRespuestaDatosRegistroFacturacionTypeEncadenamiento() {
        return new RespuestaDatosRegistroFacturacionType.Encadenamiento();
    }

    /**
     * Create an instance of {@link RespuestaConsultaType.PeriodoImputacion }
     * 
     */
    public RespuestaConsultaType.PeriodoImputacion createRespuestaConsultaTypePeriodoImputacion() {
        return new RespuestaConsultaType.PeriodoImputacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaFactuSistemaFacturacionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaFactuSistemaFacturacionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", name = "RespuestaConsultaFactuSistemaFacturacion")
    public JAXBElement<RespuestaConsultaFactuSistemaFacturacionType> createRespuestaConsultaFactuSistemaFacturacion(RespuestaConsultaFactuSistemaFacturacionType value) {
        return new JAXBElement<RespuestaConsultaFactuSistemaFacturacionType>(_RespuestaConsultaFactuSistemaFacturacion_QNAME, RespuestaConsultaFactuSistemaFacturacionType.class, null, value);
    }

}
