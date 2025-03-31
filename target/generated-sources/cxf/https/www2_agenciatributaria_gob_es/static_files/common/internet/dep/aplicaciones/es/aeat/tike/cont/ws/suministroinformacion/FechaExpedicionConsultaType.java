
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FechaExpedicionConsultaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FechaExpedicionConsultaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FechaExpedicionFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *         &lt;element name="RangoFechaExpedicion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RangoFechaExpedicionType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FechaExpedicionConsultaType", propOrder = {
    "fechaExpedicionFactura",
    "rangoFechaExpedicion"
})
public class FechaExpedicionConsultaType {

    @XmlElement(name = "FechaExpedicionFactura")
    protected String fechaExpedicionFactura;
    @XmlElement(name = "RangoFechaExpedicion")
    protected RangoFechaExpedicionType rangoFechaExpedicion;

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionFactura() {
        return fechaExpedicionFactura;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionFactura(String value) {
        this.fechaExpedicionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoFechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link RangoFechaExpedicionType }
     *     
     */
    public RangoFechaExpedicionType getRangoFechaExpedicion() {
        return rangoFechaExpedicion;
    }

    /**
     * Define el valor de la propiedad rangoFechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link RangoFechaExpedicionType }
     *     
     */
    public void setRangoFechaExpedicion(RangoFechaExpedicionType value) {
        this.rangoFechaExpedicion = value;
    }

}
