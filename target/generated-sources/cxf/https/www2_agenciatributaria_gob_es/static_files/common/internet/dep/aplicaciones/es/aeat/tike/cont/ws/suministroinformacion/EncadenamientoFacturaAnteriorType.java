
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Datos de encadenamiento 
 * 
 * <p>Clase Java para EncadenamientoFacturaAnteriorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncadenamientoFacturaAnteriorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDEmisorFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *         &lt;element name="NumSerieFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type"/&gt;
 *         &lt;element name="FechaExpedicionFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha"/&gt;
 *         &lt;element name="Huella" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax64Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncadenamientoFacturaAnteriorType", propOrder = {
    "idEmisorFactura",
    "numSerieFactura",
    "fechaExpedicionFactura",
    "huella"
})
public class EncadenamientoFacturaAnteriorType {

    @XmlElement(name = "IDEmisorFactura", required = true)
    protected String idEmisorFactura;
    @XmlElement(name = "NumSerieFactura", required = true)
    protected String numSerieFactura;
    @XmlElement(name = "FechaExpedicionFactura", required = true)
    protected String fechaExpedicionFactura;
    @XmlElement(name = "Huella", required = true)
    protected String huella;

    /**
     * Obtiene el valor de la propiedad idEmisorFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEmisorFactura() {
        return idEmisorFactura;
    }

    /**
     * Define el valor de la propiedad idEmisorFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEmisorFactura(String value) {
        this.idEmisorFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieFactura() {
        return numSerieFactura;
    }

    /**
     * Define el valor de la propiedad numSerieFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieFactura(String value) {
        this.numSerieFactura = value;
    }

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
     * Obtiene el valor de la propiedad huella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuella() {
        return huella;
    }

    /**
     * Define el valor de la propiedad huella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuella(String value) {
        this.huella = value;
    }

}
