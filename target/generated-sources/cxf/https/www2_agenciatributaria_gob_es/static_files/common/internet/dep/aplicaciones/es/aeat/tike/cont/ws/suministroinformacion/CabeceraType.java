
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Datos de cabecera 
 * 
 * <p>Clase Java para CabeceraType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CabeceraType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObligadoEmision" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaESType"/&gt;
 *         &lt;element name="Representante" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaESType" minOccurs="0"/&gt;
 *         &lt;element name="RemisionVoluntaria" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FechaFinVeriFactu" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *                   &lt;element name="Incidencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IncidenciaType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RemisionRequerimiento" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RefRequerimiento" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax18Type"/&gt;
 *                   &lt;element name="FinRequerimiento" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}FinRequerimientoType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraType", propOrder = {
    "obligadoEmision",
    "representante",
    "remisionVoluntaria",
    "remisionRequerimiento"
})
public class CabeceraType {

    @XmlElement(name = "ObligadoEmision", required = true)
    protected PersonaFisicaJuridicaESType obligadoEmision;
    @XmlElement(name = "Representante")
    protected PersonaFisicaJuridicaESType representante;
    @XmlElement(name = "RemisionVoluntaria")
    protected CabeceraType.RemisionVoluntaria remisionVoluntaria;
    @XmlElement(name = "RemisionRequerimiento")
    protected CabeceraType.RemisionRequerimiento remisionRequerimiento;

    /**
     * Obtiene el valor de la propiedad obligadoEmision.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public PersonaFisicaJuridicaESType getObligadoEmision() {
        return obligadoEmision;
    }

    /**
     * Define el valor de la propiedad obligadoEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public void setObligadoEmision(PersonaFisicaJuridicaESType value) {
        this.obligadoEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad representante.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public PersonaFisicaJuridicaESType getRepresentante() {
        return representante;
    }

    /**
     * Define el valor de la propiedad representante.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public void setRepresentante(PersonaFisicaJuridicaESType value) {
        this.representante = value;
    }

    /**
     * Obtiene el valor de la propiedad remisionVoluntaria.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraType.RemisionVoluntaria }
     *     
     */
    public CabeceraType.RemisionVoluntaria getRemisionVoluntaria() {
        return remisionVoluntaria;
    }

    /**
     * Define el valor de la propiedad remisionVoluntaria.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraType.RemisionVoluntaria }
     *     
     */
    public void setRemisionVoluntaria(CabeceraType.RemisionVoluntaria value) {
        this.remisionVoluntaria = value;
    }

    /**
     * Obtiene el valor de la propiedad remisionRequerimiento.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraType.RemisionRequerimiento }
     *     
     */
    public CabeceraType.RemisionRequerimiento getRemisionRequerimiento() {
        return remisionRequerimiento;
    }

    /**
     * Define el valor de la propiedad remisionRequerimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraType.RemisionRequerimiento }
     *     
     */
    public void setRemisionRequerimiento(CabeceraType.RemisionRequerimiento value) {
        this.remisionRequerimiento = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RefRequerimiento" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax18Type"/&gt;
     *         &lt;element name="FinRequerimiento" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}FinRequerimientoType" minOccurs="0"/&gt;
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
        "refRequerimiento",
        "finRequerimiento"
    })
    public static class RemisionRequerimiento {

        @XmlElement(name = "RefRequerimiento", required = true)
        protected String refRequerimiento;
        @XmlElement(name = "FinRequerimiento")
        @XmlSchemaType(name = "string")
        protected FinRequerimientoType finRequerimiento;

        /**
         * Obtiene el valor de la propiedad refRequerimiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefRequerimiento() {
            return refRequerimiento;
        }

        /**
         * Define el valor de la propiedad refRequerimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefRequerimiento(String value) {
            this.refRequerimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad finRequerimiento.
         * 
         * @return
         *     possible object is
         *     {@link FinRequerimientoType }
         *     
         */
        public FinRequerimientoType getFinRequerimiento() {
            return finRequerimiento;
        }

        /**
         * Define el valor de la propiedad finRequerimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link FinRequerimientoType }
         *     
         */
        public void setFinRequerimiento(FinRequerimientoType value) {
            this.finRequerimiento = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FechaFinVeriFactu" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
     *         &lt;element name="Incidencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IncidenciaType" minOccurs="0"/&gt;
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
        "fechaFinVeriFactu",
        "incidencia"
    })
    public static class RemisionVoluntaria {

        @XmlElement(name = "FechaFinVeriFactu")
        protected String fechaFinVeriFactu;
        @XmlElement(name = "Incidencia")
        @XmlSchemaType(name = "string")
        protected IncidenciaType incidencia;

        /**
         * Obtiene el valor de la propiedad fechaFinVeriFactu.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaFinVeriFactu() {
            return fechaFinVeriFactu;
        }

        /**
         * Define el valor de la propiedad fechaFinVeriFactu.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaFinVeriFactu(String value) {
            this.fechaFinVeriFactu = value;
        }

        /**
         * Obtiene el valor de la propiedad incidencia.
         * 
         * @return
         *     possible object is
         *     {@link IncidenciaType }
         *     
         */
        public IncidenciaType getIncidencia() {
            return incidencia;
        }

        /**
         * Define el valor de la propiedad incidencia.
         * 
         * @param value
         *     allowed object is
         *     {@link IncidenciaType }
         *     
         */
        public void setIncidencia(IncidenciaType value) {
            this.incidencia = value;
        }

    }

}
