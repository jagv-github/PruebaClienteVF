
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministrolr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.RegistroFacturacionAltaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.RegistroFacturacionAnulacionType;


/**
 * Datos correspondientes a los registros de facturacion
 * 
 * <p>Clase Java para RegistroFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroFacturaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroAlta"/&gt;
 *           &lt;element ref="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroAnulacion"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroFacturaType", propOrder = {
    "registroAlta",
    "registroAnulacion"
})
public class RegistroFacturaType {

    @XmlElement(name = "RegistroAlta", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd")
    protected RegistroFacturacionAltaType registroAlta;
    @XmlElement(name = "RegistroAnulacion", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd")
    protected RegistroFacturacionAnulacionType registroAnulacion;

    /**
     * Obtiene el valor de la propiedad registroAlta.
     * 
     * @return
     *     possible object is
     *     {@link RegistroFacturacionAltaType }
     *     
     */
    public RegistroFacturacionAltaType getRegistroAlta() {
        return registroAlta;
    }

    /**
     * Define el valor de la propiedad registroAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroFacturacionAltaType }
     *     
     */
    public void setRegistroAlta(RegistroFacturacionAltaType value) {
        this.registroAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad registroAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link RegistroFacturacionAnulacionType }
     *     
     */
    public RegistroFacturacionAnulacionType getRegistroAnulacion() {
        return registroAnulacion;
    }

    /**
     * Define el valor de la propiedad registroAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroFacturacionAnulacionType }
     *     
     */
    public void setRegistroAnulacion(RegistroFacturacionAnulacionType value) {
        this.registroAnulacion = value;
    }

}
