
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Cabecera de la Cobnsulta 
 * 
 * <p>Clase Java para CabeceraConsultaSf complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CabeceraConsultaSf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDVersion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}VersionType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ObligadoEmision" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ObligadoEmisionConsultaType" minOccurs="0"/&gt;
 *           &lt;element name="Destinatario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaESType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IndicadorRepresentante" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IndicadorRepresentanteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraConsultaSf", propOrder = {
    "idVersion",
    "obligadoEmision",
    "destinatario",
    "indicadorRepresentante"
})
public class CabeceraConsultaSf {

    @XmlElement(name = "IDVersion", required = true)
    protected String idVersion;
    @XmlElement(name = "ObligadoEmision")
    protected ObligadoEmisionConsultaType obligadoEmision;
    @XmlElement(name = "Destinatario")
    protected PersonaFisicaJuridicaESType destinatario;
    @XmlElement(name = "IndicadorRepresentante")
    @XmlSchemaType(name = "string")
    protected IndicadorRepresentanteType indicadorRepresentante;

    /**
     * Obtiene el valor de la propiedad idVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDVersion() {
        return idVersion;
    }

    /**
     * Define el valor de la propiedad idVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDVersion(String value) {
        this.idVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad obligadoEmision.
     * 
     * @return
     *     possible object is
     *     {@link ObligadoEmisionConsultaType }
     *     
     */
    public ObligadoEmisionConsultaType getObligadoEmision() {
        return obligadoEmision;
    }

    /**
     * Define el valor de la propiedad obligadoEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligadoEmisionConsultaType }
     *     
     */
    public void setObligadoEmision(ObligadoEmisionConsultaType value) {
        this.obligadoEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public PersonaFisicaJuridicaESType getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public void setDestinatario(PersonaFisicaJuridicaESType value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorRepresentanteType }
     *     
     */
    public IndicadorRepresentanteType getIndicadorRepresentante() {
        return indicadorRepresentante;
    }

    /**
     * Define el valor de la propiedad indicadorRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorRepresentanteType }
     *     
     */
    public void setIndicadorRepresentante(IndicadorRepresentanteType value) {
        this.indicadorRepresentante = value;
    }

}
