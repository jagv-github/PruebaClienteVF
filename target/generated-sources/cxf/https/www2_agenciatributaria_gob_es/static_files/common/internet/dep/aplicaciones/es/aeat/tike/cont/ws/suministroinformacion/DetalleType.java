
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impuesto" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImpuestoType" minOccurs="0"/&gt;
 *         &lt;element name="ClaveRegimen" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CalificacionOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CalificacionOperacionType"/&gt;
 *           &lt;element name="OperacionExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}OperacionExentaType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TipoImpositivo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponibleOimporteNoSujeto" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *         &lt;element name="BaseImponibleACoste" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="CuotaRepercutida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="TipoRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/&gt;
 *         &lt;element name="CuotaRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleType", propOrder = {
    "impuesto",
    "claveRegimen",
    "calificacionOperacion",
    "operacionExenta",
    "tipoImpositivo",
    "baseImponibleOimporteNoSujeto",
    "baseImponibleACoste",
    "cuotaRepercutida",
    "tipoRecargoEquivalencia",
    "cuotaRecargoEquivalencia"
})
public class DetalleType {

    @XmlElement(name = "Impuesto")
    protected String impuesto;
    @XmlElement(name = "ClaveRegimen")
    protected String claveRegimen;
    @XmlElement(name = "CalificacionOperacion")
    @XmlSchemaType(name = "string")
    protected CalificacionOperacionType calificacionOperacion;
    @XmlElement(name = "OperacionExenta")
    @XmlSchemaType(name = "string")
    protected OperacionExentaType operacionExenta;
    @XmlElement(name = "TipoImpositivo")
    protected String tipoImpositivo;
    @XmlElement(name = "BaseImponibleOimporteNoSujeto", required = true)
    protected String baseImponibleOimporteNoSujeto;
    @XmlElement(name = "BaseImponibleACoste")
    protected String baseImponibleACoste;
    @XmlElement(name = "CuotaRepercutida")
    protected String cuotaRepercutida;
    @XmlElement(name = "TipoRecargoEquivalencia")
    protected String tipoRecargoEquivalencia;
    @XmlElement(name = "CuotaRecargoEquivalencia")
    protected String cuotaRecargoEquivalencia;

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimen() {
        return claveRegimen;
    }

    /**
     * Define el valor de la propiedad claveRegimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimen(String value) {
        this.claveRegimen = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionOperacion.
     * 
     * @return
     *     possible object is
     *     {@link CalificacionOperacionType }
     *     
     */
    public CalificacionOperacionType getCalificacionOperacion() {
        return calificacionOperacion;
    }

    /**
     * Define el valor de la propiedad calificacionOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CalificacionOperacionType }
     *     
     */
    public void setCalificacionOperacion(CalificacionOperacionType value) {
        this.calificacionOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionExenta.
     * 
     * @return
     *     possible object is
     *     {@link OperacionExentaType }
     *     
     */
    public OperacionExentaType getOperacionExenta() {
        return operacionExenta;
    }

    /**
     * Define el valor de la propiedad operacionExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionExentaType }
     *     
     */
    public void setOperacionExenta(OperacionExentaType value) {
        this.operacionExenta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpositivo() {
        return tipoImpositivo;
    }

    /**
     * Define el valor de la propiedad tipoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpositivo(String value) {
        this.tipoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleOimporteNoSujeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleOimporteNoSujeto() {
        return baseImponibleOimporteNoSujeto;
    }

    /**
     * Define el valor de la propiedad baseImponibleOimporteNoSujeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleOimporteNoSujeto(String value) {
        this.baseImponibleOimporteNoSujeto = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleACoste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleACoste() {
        return baseImponibleACoste;
    }

    /**
     * Define el valor de la propiedad baseImponibleACoste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleACoste(String value) {
        this.baseImponibleACoste = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRepercutida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRepercutida() {
        return cuotaRepercutida;
    }

    /**
     * Define el valor de la propiedad cuotaRepercutida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRepercutida(String value) {
        this.cuotaRepercutida = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecargoEquivalencia() {
        return tipoRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecargoEquivalencia(String value) {
        this.tipoRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRecargoEquivalencia() {
        return cuotaRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRecargoEquivalencia(String value) {
        this.cuotaRecargoEquivalencia = value;
    }

}
