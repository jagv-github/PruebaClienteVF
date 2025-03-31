
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SistemaInformaticoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SistemaInformaticoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="NombreRazon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax120Type"/&gt;
 *           &lt;choice&gt;
 *             &lt;element name="NIF" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *             &lt;element name="IDOtro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDOtroType"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="NombreSistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax30Type"/&gt;
 *         &lt;element name="IdSistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax2Type"/&gt;
 *         &lt;element name="Version" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax50Type"/&gt;
 *         &lt;element name="NumeroInstalacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax100Type"/&gt;
 *         &lt;element name="TipoUsoPosibleSoloVerifactu" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SiNoType"/&gt;
 *         &lt;element name="TipoUsoPosibleMultiOT" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SiNoType"/&gt;
 *         &lt;element name="IndicadorMultiplesOT" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SiNoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SistemaInformaticoType", propOrder = {
    "nombreRazon",
    "nif",
    "idOtro",
    "nombreSistemaInformatico",
    "idSistemaInformatico",
    "version",
    "numeroInstalacion",
    "tipoUsoPosibleSoloVerifactu",
    "tipoUsoPosibleMultiOT",
    "indicadorMultiplesOT"
})
public class SistemaInformaticoType {

    @XmlElement(name = "NombreRazon", required = true)
    protected String nombreRazon;
    @XmlElement(name = "NIF")
    protected String nif;
    @XmlElement(name = "IDOtro")
    protected IDOtroType idOtro;
    @XmlElement(name = "NombreSistemaInformatico", required = true)
    protected String nombreSistemaInformatico;
    @XmlElement(name = "IdSistemaInformatico", required = true)
    protected String idSistemaInformatico;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "NumeroInstalacion", required = true)
    protected String numeroInstalacion;
    @XmlElement(name = "TipoUsoPosibleSoloVerifactu", required = true)
    @XmlSchemaType(name = "string")
    protected SiNoType tipoUsoPosibleSoloVerifactu;
    @XmlElement(name = "TipoUsoPosibleMultiOT", required = true)
    @XmlSchemaType(name = "string")
    protected SiNoType tipoUsoPosibleMultiOT;
    @XmlElement(name = "IndicadorMultiplesOT", required = true)
    @XmlSchemaType(name = "string")
    protected SiNoType indicadorMultiplesOT;

    /**
     * Obtiene el valor de la propiedad nombreRazon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazon() {
        return nombreRazon;
    }

    /**
     * Define el valor de la propiedad nombreRazon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazon(String value) {
        this.nombreRazon = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad idOtro.
     * 
     * @return
     *     possible object is
     *     {@link IDOtroType }
     *     
     */
    public IDOtroType getIDOtro() {
        return idOtro;
    }

    /**
     * Define el valor de la propiedad idOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOtroType }
     *     
     */
    public void setIDOtro(IDOtroType value) {
        this.idOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSistemaInformatico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSistemaInformatico() {
        return nombreSistemaInformatico;
    }

    /**
     * Define el valor de la propiedad nombreSistemaInformatico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSistemaInformatico(String value) {
        this.nombreSistemaInformatico = value;
    }

    /**
     * Obtiene el valor de la propiedad idSistemaInformatico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSistemaInformatico() {
        return idSistemaInformatico;
    }

    /**
     * Define el valor de la propiedad idSistemaInformatico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSistemaInformatico(String value) {
        this.idSistemaInformatico = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInstalacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInstalacion() {
        return numeroInstalacion;
    }

    /**
     * Define el valor de la propiedad numeroInstalacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInstalacion(String value) {
        this.numeroInstalacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsoPosibleSoloVerifactu.
     * 
     * @return
     *     possible object is
     *     {@link SiNoType }
     *     
     */
    public SiNoType getTipoUsoPosibleSoloVerifactu() {
        return tipoUsoPosibleSoloVerifactu;
    }

    /**
     * Define el valor de la propiedad tipoUsoPosibleSoloVerifactu.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoType }
     *     
     */
    public void setTipoUsoPosibleSoloVerifactu(SiNoType value) {
        this.tipoUsoPosibleSoloVerifactu = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsoPosibleMultiOT.
     * 
     * @return
     *     possible object is
     *     {@link SiNoType }
     *     
     */
    public SiNoType getTipoUsoPosibleMultiOT() {
        return tipoUsoPosibleMultiOT;
    }

    /**
     * Define el valor de la propiedad tipoUsoPosibleMultiOT.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoType }
     *     
     */
    public void setTipoUsoPosibleMultiOT(SiNoType value) {
        this.tipoUsoPosibleMultiOT = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorMultiplesOT.
     * 
     * @return
     *     possible object is
     *     {@link SiNoType }
     *     
     */
    public SiNoType getIndicadorMultiplesOT() {
        return indicadorMultiplesOT;
    }

    /**
     * Define el valor de la propiedad indicadorMultiplesOT.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNoType }
     *     
     */
    public void setIndicadorMultiplesOT(SiNoType value) {
        this.indicadorMultiplesOT = value;
    }

}
