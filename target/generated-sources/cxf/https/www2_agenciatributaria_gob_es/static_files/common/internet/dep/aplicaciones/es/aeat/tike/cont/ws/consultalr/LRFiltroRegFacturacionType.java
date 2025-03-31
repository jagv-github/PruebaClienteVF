
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ContraparteConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.FechaExpedicionConsultaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaExpedidaBCType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PeriodoImputacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SistemaInformaticoType;


/**
 * <p>Clase Java para LRFiltroRegFacturacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRFiltroRegFacturacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeriodoImputacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PeriodoImputacionType"/&gt;
 *         &lt;element name="NumSerieFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextoIDFacturaType" minOccurs="0"/&gt;
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ContraparteConsultaType" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpedicionFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}FechaExpedicionConsultaType" minOccurs="0"/&gt;
 *         &lt;element name="SistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SistemaInformaticoType" minOccurs="0"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax70Type" minOccurs="0"/&gt;
 *         &lt;element name="ClavePaginacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaBCType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRFiltroRegFacturacionType", propOrder = {
    "periodoImputacion",
    "numSerieFactura",
    "contraparte",
    "fechaExpedicionFactura",
    "sistemaInformatico",
    "refExterna",
    "clavePaginacion"
})
public class LRFiltroRegFacturacionType {

    @XmlElement(name = "PeriodoImputacion", required = true)
    protected PeriodoImputacionType periodoImputacion;
    @XmlElement(name = "NumSerieFactura")
    protected String numSerieFactura;
    @XmlElement(name = "Contraparte")
    protected ContraparteConsultaType contraparte;
    @XmlElement(name = "FechaExpedicionFactura")
    protected FechaExpedicionConsultaType fechaExpedicionFactura;
    @XmlElement(name = "SistemaInformatico")
    protected SistemaInformaticoType sistemaInformatico;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "ClavePaginacion")
    protected IDFacturaExpedidaBCType clavePaginacion;

    /**
     * Obtiene el valor de la propiedad periodoImputacion.
     * 
     * @return
     *     possible object is
     *     {@link PeriodoImputacionType }
     *     
     */
    public PeriodoImputacionType getPeriodoImputacion() {
        return periodoImputacion;
    }

    /**
     * Define el valor de la propiedad periodoImputacion.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodoImputacionType }
     *     
     */
    public void setPeriodoImputacion(PeriodoImputacionType value) {
        this.periodoImputacion = value;
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
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link ContraparteConsultaType }
     *     
     */
    public ContraparteConsultaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraparteConsultaType }
     *     
     */
    public void setContraparte(ContraparteConsultaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFactura.
     * 
     * @return
     *     possible object is
     *     {@link FechaExpedicionConsultaType }
     *     
     */
    public FechaExpedicionConsultaType getFechaExpedicionFactura() {
        return fechaExpedicionFactura;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaExpedicionConsultaType }
     *     
     */
    public void setFechaExpedicionFactura(FechaExpedicionConsultaType value) {
        this.fechaExpedicionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaInformatico.
     * 
     * @return
     *     possible object is
     *     {@link SistemaInformaticoType }
     *     
     */
    public SistemaInformaticoType getSistemaInformatico() {
        return sistemaInformatico;
    }

    /**
     * Define el valor de la propiedad sistemaInformatico.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaInformaticoType }
     *     
     */
    public void setSistemaInformatico(SistemaInformaticoType value) {
        this.sistemaInformatico = value;
    }

    /**
     * Obtiene el valor de la propiedad refExterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefExterna() {
        return refExterna;
    }

    /**
     * Define el valor de la propiedad refExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefExterna(String value) {
        this.refExterna = value;
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
