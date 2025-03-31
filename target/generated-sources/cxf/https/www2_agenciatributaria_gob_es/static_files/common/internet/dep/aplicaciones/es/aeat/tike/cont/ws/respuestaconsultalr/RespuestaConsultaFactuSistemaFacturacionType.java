
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaBCType;


/**
 * <p>Clase Java para RespuestaConsultaFactuSistemaFacturacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaFactuSistemaFacturacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaConsultaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistroRespuestaConsultaFactuSistemaFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaRegFacturacionType" maxOccurs="10000" minOccurs="0"/&gt;
 *         &lt;element name="ClavePaginacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaBCType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaFactuSistemaFacturacionType", propOrder = {
    "registroRespuestaConsultaFactuSistemaFacturacion",
    "clavePaginacion"
})
public class RespuestaConsultaFactuSistemaFacturacionType
    extends RespuestaConsultaType
{

    @XmlElement(name = "RegistroRespuestaConsultaFactuSistemaFacturacion")
    protected List<RegistroRespuestaConsultaRegFacturacionType> registroRespuestaConsultaFactuSistemaFacturacion;
    @XmlElement(name = "ClavePaginacion")
    protected IDFacturaExpedidaBCType clavePaginacion;

    /**
     * Gets the value of the registroRespuestaConsultaFactuSistemaFacturacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaFactuSistemaFacturacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaFactuSistemaFacturacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaRegFacturacionType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaRegFacturacionType> getRegistroRespuestaConsultaFactuSistemaFacturacion() {
        if (registroRespuestaConsultaFactuSistemaFacturacion == null) {
            registroRespuestaConsultaFactuSistemaFacturacion = new ArrayList<RegistroRespuestaConsultaRegFacturacionType>();
        }
        return this.registroRespuestaConsultaFactuSistemaFacturacion;
    }

    /**
     * Obtiene el valor de la propiedad clavePaginacion.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaBCType }
     *     
     */
    public IDFacturaExpedidaBCType getClavePaginacion() {
        return clavePaginacion;
    }

    /**
     * Define el valor de la propiedad clavePaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaBCType }
     *     
     */
    public void setClavePaginacion(IDFacturaExpedidaBCType value) {
        this.clavePaginacion = value;
    }

}
