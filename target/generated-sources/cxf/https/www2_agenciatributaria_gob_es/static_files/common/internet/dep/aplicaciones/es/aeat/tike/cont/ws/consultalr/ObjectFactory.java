
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr package. 
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

    private final static QName _ConsultaFactuSistemaFacturacion_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd", "ConsultaFactuSistemaFacturacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaFactuSistemaFacturacionType }
     * 
     */
    public ConsultaFactuSistemaFacturacionType createConsultaFactuSistemaFacturacionType() {
        return new ConsultaFactuSistemaFacturacionType();
    }

    /**
     * Create an instance of {@link LRFiltroRegFacturacionType }
     * 
     */
    public LRFiltroRegFacturacionType createLRFiltroRegFacturacionType() {
        return new LRFiltroRegFacturacionType();
    }

    /**
     * Create an instance of {@link DatosAdicionalesRespuestaType }
     * 
     */
    public DatosAdicionalesRespuestaType createDatosAdicionalesRespuestaType() {
        return new DatosAdicionalesRespuestaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFactuSistemaFacturacionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaFactuSistemaFacturacionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd", name = "ConsultaFactuSistemaFacturacion")
    public JAXBElement<ConsultaFactuSistemaFacturacionType> createConsultaFactuSistemaFacturacion(ConsultaFactuSistemaFacturacionType value) {
        return new JAXBElement<ConsultaFactuSistemaFacturacionType>(_ConsultaFactuSistemaFacturacion_QNAME, ConsultaFactuSistemaFacturacionType.class, null, value);
    }

}
