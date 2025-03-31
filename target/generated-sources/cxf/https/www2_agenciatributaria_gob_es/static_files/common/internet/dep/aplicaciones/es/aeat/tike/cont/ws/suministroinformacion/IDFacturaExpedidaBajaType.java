
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Datos de identificación de factura que se anula para operaciones de baja
 * 
 * <p>Clase Java para IDFacturaExpedidaBajaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDFacturaExpedidaBajaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDEmisorFacturaAnulada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *         &lt;element name="NumSerieFacturaAnulada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextoIDFacturaType"/&gt;
 *         &lt;element name="FechaExpedicionFacturaAnulada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDFacturaExpedidaBajaType", propOrder = {
    "idEmisorFacturaAnulada",
    "numSerieFacturaAnulada",
    "fechaExpedicionFacturaAnulada"
})
public class IDFacturaExpedidaBajaType {

    @XmlElement(name = "IDEmisorFacturaAnulada", required = true)
    protected String idEmisorFacturaAnulada;
    @XmlElement(name = "NumSerieFacturaAnulada", required = true)
    protected String numSerieFacturaAnulada;
    @XmlElement(name = "FechaExpedicionFacturaAnulada", required = true)
    protected String fechaExpedicionFacturaAnulada;

    /**
     * Obtiene el valor de la propiedad idEmisorFacturaAnulada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEmisorFacturaAnulada() {
        return idEmisorFacturaAnulada;
    }

    /**
     * Define el valor de la propiedad idEmisorFacturaAnulada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEmisorFacturaAnulada(String value) {
        this.idEmisorFacturaAnulada = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieFacturaAnulada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieFacturaAnulada() {
        return numSerieFacturaAnulada;
    }

    /**
     * Define el valor de la propiedad numSerieFacturaAnulada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieFacturaAnulada(String value) {
        this.numSerieFacturaAnulada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFacturaAnulada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionFacturaAnulada() {
        return fechaExpedicionFacturaAnulada;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFacturaAnulada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionFacturaAnulada(String value) {
        this.fechaExpedicionFacturaAnulada = value;
    }

}
