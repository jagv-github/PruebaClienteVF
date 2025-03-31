
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DatosPresentacion2Type;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaType;


/**
 * <p>Clase Java para RegistroRespuestaConsultaRegFacturacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroRespuestaConsultaRegFacturacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaType"/&gt;
 *         &lt;element name="DatosRegistroFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaDatosRegistroFacturacionType"/&gt;
 *         &lt;element name="DatosPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DatosPresentacion2Type" minOccurs="0"/&gt;
 *         &lt;element name="EstadoRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}EstadoRegFactuType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroRespuestaConsultaRegFacturacionType", propOrder = {
    "idFactura",
    "datosRegistroFacturacion",
    "datosPresentacion",
    "estadoRegistro"
})
public class RegistroRespuestaConsultaRegFacturacionType {

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaType idFactura;
    @XmlElement(name = "DatosRegistroFacturacion", required = true)
    protected RespuestaDatosRegistroFacturacionType datosRegistroFacturacion;
    @XmlElement(name = "DatosPresentacion")
    protected DatosPresentacion2Type datosPresentacion;
    @XmlElement(name = "EstadoRegistro", required = true)
    protected EstadoRegFactuType estadoRegistro;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public IDFacturaExpedidaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad datosRegistroFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDatosRegistroFacturacionType }
     *     
     */
    public RespuestaDatosRegistroFacturacionType getDatosRegistroFacturacion() {
        return datosRegistroFacturacion;
    }

    /**
     * Define el valor de la propiedad datosRegistroFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDatosRegistroFacturacionType }
     *     
     */
    public void setDatosRegistroFacturacion(RespuestaDatosRegistroFacturacionType value) {
        this.datosRegistroFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public DatosPresentacion2Type getDatosPresentacion() {
        return datosPresentacion;
    }

    /**
     * Define el valor de la propiedad datosPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public void setDatosPresentacion(DatosPresentacion2Type value) {
        this.datosPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link EstadoRegFactuType }
     *     
     */
    public EstadoRegFactuType getEstadoRegistro() {
        return estadoRegistro;
    }

    /**
     * Define el valor de la propiedad estadoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoRegFactuType }
     *     
     */
    public void setEstadoRegistro(EstadoRegFactuType value) {
        this.estadoRegistro = value;
    }

}
