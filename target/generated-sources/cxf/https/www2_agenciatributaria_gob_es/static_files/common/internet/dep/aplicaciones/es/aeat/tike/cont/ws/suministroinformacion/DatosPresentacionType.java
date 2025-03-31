
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosPresentacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosPresentacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NIFPresentador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *         &lt;element name="TimestampPresentacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPresentacionType", propOrder = {
    "nifPresentador",
    "timestampPresentacion"
})
public class DatosPresentacionType {

    @XmlElement(name = "NIFPresentador", required = true)
    protected String nifPresentador;
    @XmlElement(name = "TimestampPresentacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampPresentacion;

    /**
     * Obtiene el valor de la propiedad nifPresentador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFPresentador() {
        return nifPresentador;
    }

    /**
     * Define el valor de la propiedad nifPresentador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFPresentador(String value) {
        this.nifPresentador = value;
    }

    /**
     * Obtiene el valor de la propiedad timestampPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestampPresentacion() {
        return timestampPresentacion;
    }

    /**
     * Define el valor de la propiedad timestampPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestampPresentacion(XMLGregorianCalendar value) {
        this.timestampPresentacion = value;
    }

}
