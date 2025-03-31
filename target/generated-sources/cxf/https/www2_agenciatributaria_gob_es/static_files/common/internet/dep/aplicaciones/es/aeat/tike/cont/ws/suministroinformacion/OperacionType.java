
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OperacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoOperacionType"/&gt;
 *         &lt;element name="Subsanacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SubsanacionType" minOccurs="0"/&gt;
 *         &lt;element name="RechazoPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RechazoPrevioType" minOccurs="0"/&gt;
 *         &lt;element name="SinRegistroPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SinRegistroPrevioType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionType", propOrder = {
    "tipoOperacion",
    "subsanacion",
    "rechazoPrevio",
    "sinRegistroPrevio"
})
public class OperacionType {

    @XmlElement(name = "TipoOperacion", required = true)
    @XmlSchemaType(name = "string")
    protected TipoOperacionType tipoOperacion;
    @XmlElement(name = "Subsanacion")
    @XmlSchemaType(name = "string")
    protected SubsanacionType subsanacion;
    @XmlElement(name = "RechazoPrevio")
    @XmlSchemaType(name = "string")
    protected RechazoPrevioType rechazoPrevio;
    @XmlElement(name = "SinRegistroPrevio")
    @XmlSchemaType(name = "string")
    protected SinRegistroPrevioType sinRegistroPrevio;

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperacionType }
     *     
     */
    public TipoOperacionType getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperacionType }
     *     
     */
    public void setTipoOperacion(TipoOperacionType value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad subsanacion.
     * 
     * @return
     *     possible object is
     *     {@link SubsanacionType }
     *     
     */
    public SubsanacionType getSubsanacion() {
        return subsanacion;
    }

    /**
     * Define el valor de la propiedad subsanacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsanacionType }
     *     
     */
    public void setSubsanacion(SubsanacionType value) {
        this.subsanacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rechazoPrevio.
     * 
     * @return
     *     possible object is
     *     {@link RechazoPrevioType }
     *     
     */
    public RechazoPrevioType getRechazoPrevio() {
        return rechazoPrevio;
    }

    /**
     * Define el valor de la propiedad rechazoPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link RechazoPrevioType }
     *     
     */
    public void setRechazoPrevio(RechazoPrevioType value) {
        this.rechazoPrevio = value;
    }

    /**
     * Obtiene el valor de la propiedad sinRegistroPrevio.
     * 
     * @return
     *     possible object is
     *     {@link SinRegistroPrevioType }
     *     
     */
    public SinRegistroPrevioType getSinRegistroPrevio() {
        return sinRegistroPrevio;
    }

    /**
     * Define el valor de la propiedad sinRegistroPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link SinRegistroPrevioType }
     *     
     */
    public void setSinRegistroPrevio(SinRegistroPrevioType value) {
        this.sinRegistroPrevio = value;
    }

}
