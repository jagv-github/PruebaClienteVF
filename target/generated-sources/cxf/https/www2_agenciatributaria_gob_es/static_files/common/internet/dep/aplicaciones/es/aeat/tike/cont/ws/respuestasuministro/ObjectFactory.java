
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro package. 
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

    private final static QName _RespuestaRegFactuSistemaFacturacion_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd", "RespuestaRegFactuSistemaFacturacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestasuministro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaRegFactuSistemaFacturacionType }
     * 
     */
    public RespuestaRegFactuSistemaFacturacionType createRespuestaRegFactuSistemaFacturacionType() {
        return new RespuestaRegFactuSistemaFacturacionType();
    }

    /**
     * Create an instance of {@link RespuestaBaseType }
     * 
     */
    public RespuestaBaseType createRespuestaBaseType() {
        return new RespuestaBaseType();
    }

    /**
     * Create an instance of {@link RespuestaExpedidaType }
     * 
     */
    public RespuestaExpedidaType createRespuestaExpedidaType() {
        return new RespuestaExpedidaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaRegFactuSistemaFacturacionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaRegFactuSistemaFacturacionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd", name = "RespuestaRegFactuSistemaFacturacion")
    public JAXBElement<RespuestaRegFactuSistemaFacturacionType> createRespuestaRegFactuSistemaFacturacion(RespuestaRegFactuSistemaFacturacionType value) {
        return new JAXBElement<RespuestaRegFactuSistemaFacturacionType>(_RespuestaRegFactuSistemaFacturacion_QNAME, RespuestaRegFactuSistemaFacturacionType.class, null, value);
    }

}
