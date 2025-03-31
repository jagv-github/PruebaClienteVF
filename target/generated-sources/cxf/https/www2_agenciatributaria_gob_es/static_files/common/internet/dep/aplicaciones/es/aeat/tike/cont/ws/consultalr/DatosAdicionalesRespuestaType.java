
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.MostrarNombreRazonEmisorType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.MostrarSistemaInformaticoType;


/**
 * <p>Clase Java para DatosAdicionalesRespuestaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosAdicionalesRespuestaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MostrarNombreRazonEmisor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}MostrarNombreRazonEmisorType" minOccurs="0"/&gt;
 *         &lt;element name="MostrarSistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}MostrarSistemaInformaticoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosAdicionalesRespuestaType", propOrder = {
    "mostrarNombreRazonEmisor",
    "mostrarSistemaInformatico"
})
public class DatosAdicionalesRespuestaType {

    @XmlElement(name = "MostrarNombreRazonEmisor")
    @XmlSchemaType(name = "string")
    protected MostrarNombreRazonEmisorType mostrarNombreRazonEmisor;
    @XmlElement(name = "MostrarSistemaInformatico")
    @XmlSchemaType(name = "string")
    protected MostrarSistemaInformaticoType mostrarSistemaInformatico;

    /**
     * Obtiene el valor de la propiedad mostrarNombreRazonEmisor.
     * 
     * @return
     *     possible object is
     *     {@link MostrarNombreRazonEmisorType }
     *     
     */
    public MostrarNombreRazonEmisorType getMostrarNombreRazonEmisor() {
        return mostrarNombreRazonEmisor;
    }

    /**
     * Define el valor de la propiedad mostrarNombreRazonEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link MostrarNombreRazonEmisorType }
     *     
     */
    public void setMostrarNombreRazonEmisor(MostrarNombreRazonEmisorType value) {
        this.mostrarNombreRazonEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad mostrarSistemaInformatico.
     * 
     * @return
     *     possible object is
     *     {@link MostrarSistemaInformaticoType }
     *     
     */
    public MostrarSistemaInformaticoType getMostrarSistemaInformatico() {
        return mostrarSistemaInformatico;
    }

    /**
     * Define el valor de la propiedad mostrarSistemaInformatico.
     * 
     * @param value
     *     allowed object is
     *     {@link MostrarSistemaInformaticoType }
     *     
     */
    public void setMostrarSistemaInformatico(MostrarSistemaInformaticoType value) {
        this.mostrarSistemaInformatico = value;
    }

}
