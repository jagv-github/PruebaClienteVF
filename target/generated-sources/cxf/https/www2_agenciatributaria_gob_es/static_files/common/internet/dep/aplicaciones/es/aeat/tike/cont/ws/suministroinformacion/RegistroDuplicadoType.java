
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistroDuplicadoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroDuplicadoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPeticionRegistroDuplicado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax20Type"/&gt;
 *         &lt;element name="EstadoRegistroDuplicado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EstadoRegistroSFType"/&gt;
 *         &lt;element name="CodigoErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ErrorDetalleType" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax500Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroDuplicadoType", propOrder = {
    "idPeticionRegistroDuplicado",
    "estadoRegistroDuplicado",
    "codigoErrorRegistro",
    "descripcionErrorRegistro"
})
public class RegistroDuplicadoType {

    @XmlElement(name = "IdPeticionRegistroDuplicado", required = true)
    protected String idPeticionRegistroDuplicado;
    @XmlElement(name = "EstadoRegistroDuplicado", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoRegistroSFType estadoRegistroDuplicado;
    @XmlElement(name = "CodigoErrorRegistro")
    protected BigInteger codigoErrorRegistro;
    @XmlElement(name = "DescripcionErrorRegistro")
    protected String descripcionErrorRegistro;

    /**
     * Obtiene el valor de la propiedad idPeticionRegistroDuplicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPeticionRegistroDuplicado() {
        return idPeticionRegistroDuplicado;
    }

    /**
     * Define el valor de la propiedad idPeticionRegistroDuplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPeticionRegistroDuplicado(String value) {
        this.idPeticionRegistroDuplicado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRegistroDuplicado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoRegistroSFType }
     *     
     */
    public EstadoRegistroSFType getEstadoRegistroDuplicado() {
        return estadoRegistroDuplicado;
    }

    /**
     * Define el valor de la propiedad estadoRegistroDuplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoRegistroSFType }
     *     
     */
    public void setEstadoRegistroDuplicado(EstadoRegistroSFType value) {
        this.estadoRegistroDuplicado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }

    /**
     * Define el valor de la propiedad codigoErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoErrorRegistro(BigInteger value) {
        this.codigoErrorRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }

    /**
     * Define el valor de la propiedad descripcionErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionErrorRegistro(String value) {
        this.descripcionErrorRegistro = value;
    }

}
