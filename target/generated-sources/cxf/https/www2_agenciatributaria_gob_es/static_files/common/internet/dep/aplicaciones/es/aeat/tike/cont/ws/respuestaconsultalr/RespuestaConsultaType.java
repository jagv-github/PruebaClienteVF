
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraConsultaSf;


/**
 * <p>Clase Java para RespuestaConsultaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CabeceraConsultaSf"/&gt;
 *         &lt;element name="PeriodoImputacion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
 *                   &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IndicadorPaginacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}IndicadorPaginacionType"/&gt;
 *         &lt;element name="ResultadoConsulta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}ResultadoConsultaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaType", propOrder = {
    "cabecera",
    "periodoImputacion",
    "indicadorPaginacion",
    "resultadoConsulta"
})
@XmlSeeAlso({
    RespuestaConsultaFactuSistemaFacturacionType.class
})
public class RespuestaConsultaType {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaSf cabecera;
    @XmlElement(name = "PeriodoImputacion", required = true)
    protected RespuestaConsultaType.PeriodoImputacion periodoImputacion;
    @XmlElement(name = "IndicadorPaginacion", required = true)
    @XmlSchemaType(name = "string")
    protected IndicadorPaginacionType indicadorPaginacion;
    @XmlElement(name = "ResultadoConsulta", required = true)
    @XmlSchemaType(name = "string")
    protected ResultadoConsultaType resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraConsultaSf }
     *     
     */
    public CabeceraConsultaSf getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraConsultaSf }
     *     
     */
    public void setCabecera(CabeceraConsultaSf value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoImputacion.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultaType.PeriodoImputacion }
     *     
     */
    public RespuestaConsultaType.PeriodoImputacion getPeriodoImputacion() {
        return periodoImputacion;
    }

    /**
     * Define el valor de la propiedad periodoImputacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaType.PeriodoImputacion }
     *     
     */
    public void setPeriodoImputacion(RespuestaConsultaType.PeriodoImputacion value) {
        this.periodoImputacion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorPaginacion.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorPaginacionType }
     *     
     */
    public IndicadorPaginacionType getIndicadorPaginacion() {
        return indicadorPaginacion;
    }

    /**
     * Define el valor de la propiedad indicadorPaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorPaginacionType }
     *     
     */
    public void setIndicadorPaginacion(IndicadorPaginacionType value) {
        this.indicadorPaginacion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public ResultadoConsultaType getResultadoConsulta() {
        return resultadoConsulta;
    }

    /**
     * Define el valor de la propiedad resultadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public void setResultadoConsulta(ResultadoConsultaType value) {
        this.resultadoConsulta = value;
    }


    /**
     *  Período al que corresponden los apuntes. todos los apuntes deben corresponder al mismo período impositivo 
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
     *         &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ejercicio",
        "periodo"
    })
    public static class PeriodoImputacion {

        @XmlElement(name = "Ejercicio", required = true)
        protected String ejercicio;
        @XmlElement(name = "Periodo", required = true)
        protected String periodo;

        /**
         * Obtiene el valor de la propiedad ejercicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEjercicio() {
            return ejercicio;
        }

        /**
         * Define el valor de la propiedad ejercicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEjercicio(String value) {
            this.ejercicio = value;
        }

        /**
         * Obtiene el valor de la propiedad periodo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodo() {
            return periodo;
        }

        /**
         * Define el valor de la propiedad periodo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodo(String value) {
            this.periodo = value;
        }

    }

}
