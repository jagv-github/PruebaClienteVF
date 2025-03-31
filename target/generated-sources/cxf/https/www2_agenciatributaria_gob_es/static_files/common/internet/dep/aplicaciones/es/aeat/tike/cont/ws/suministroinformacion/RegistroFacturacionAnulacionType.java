
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * Datos correspondientes al registro de facturacion de anulacion 
 * 
 * <p>Clase Java para RegistroFacturacionAnulacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroFacturacionAnulacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDVersion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}VersionType"/&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaBajaType"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="SinRegistroPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SinRegistroPrevioType" minOccurs="0"/&gt;
 *         &lt;element name="RechazoPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RechazoPrevioAnulacionType" minOccurs="0"/&gt;
 *         &lt;element name="GeneradoPor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}GeneradoPorType" minOccurs="0"/&gt;
 *         &lt;element name="Generador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/&gt;
 *         &lt;element name="Encadenamiento"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="PrimerRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PrimerRegistroCadenaType"/&gt;
 *                   &lt;element name="RegistroAnterior" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EncadenamientoFacturaAnteriorType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SistemaInformaticoType"/&gt;
 *         &lt;element name="FechaHoraHusoGenRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TipoHuella" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoHuellaType"/&gt;
 *         &lt;element name="Huella" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax64Type"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroFacturacionAnulacionType", propOrder = {
    "idVersion",
    "idFactura",
    "refExterna",
    "sinRegistroPrevio",
    "rechazoPrevio",
    "generadoPor",
    "generador",
    "encadenamiento",
    "sistemaInformatico",
    "fechaHoraHusoGenRegistro",
    "tipoHuella",
    "huella",
    "signature"
})
public class RegistroFacturacionAnulacionType {

    @XmlElement(name = "IDVersion", required = true)
    protected String idVersion;
    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaBajaType idFactura;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "SinRegistroPrevio")
    @XmlSchemaType(name = "string")
    protected SinRegistroPrevioType sinRegistroPrevio;
    @XmlElement(name = "RechazoPrevio")
    @XmlSchemaType(name = "string")
    protected RechazoPrevioAnulacionType rechazoPrevio;
    @XmlElement(name = "GeneradoPor")
    @XmlSchemaType(name = "string")
    protected GeneradoPorType generadoPor;
    @XmlElement(name = "Generador")
    protected PersonaFisicaJuridicaType generador;
    @XmlElement(name = "Encadenamiento", required = true)
    protected RegistroFacturacionAnulacionType.Encadenamiento encadenamiento;
    @XmlElement(name = "SistemaInformatico", required = true)
    protected SistemaInformaticoType sistemaInformatico;
    @XmlElement(name = "FechaHoraHusoGenRegistro", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraHusoGenRegistro;
    @XmlElement(name = "TipoHuella", required = true)
    protected String tipoHuella;
    @XmlElement(name = "Huella", required = true)
    protected String huella;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

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
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaBajaType }
     *     
     */
    public IDFacturaExpedidaBajaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaBajaType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaBajaType value) {
        this.idFactura = value;
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
     * Obtiene el valor de la propiedad sinRegistroPrevio.
     * 
     * @return
     *     possible object is
     *     {@link SinRegistroPrevioType }
     *     
     */
    public SinRegistroPrevioType getSinRegistroPrevio() {
        return sinRegistroPrevio;
    }

    /**
     * Define el valor de la propiedad sinRegistroPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link SinRegistroPrevioType }
     *     
     */
    public void setSinRegistroPrevio(SinRegistroPrevioType value) {
        this.sinRegistroPrevio = value;
    }

    /**
     * Obtiene el valor de la propiedad rechazoPrevio.
     * 
     * @return
     *     possible object is
     *     {@link RechazoPrevioAnulacionType }
     *     
     */
    public RechazoPrevioAnulacionType getRechazoPrevio() {
        return rechazoPrevio;
    }

    /**
     * Define el valor de la propiedad rechazoPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link RechazoPrevioAnulacionType }
     *     
     */
    public void setRechazoPrevio(RechazoPrevioAnulacionType value) {
        this.rechazoPrevio = value;
    }

    /**
     * Obtiene el valor de la propiedad generadoPor.
     * 
     * @return
     *     possible object is
     *     {@link GeneradoPorType }
     *     
     */
    public GeneradoPorType getGeneradoPor() {
        return generadoPor;
    }

    /**
     * Define el valor de la propiedad generadoPor.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneradoPorType }
     *     
     */
    public void setGeneradoPor(GeneradoPorType value) {
        this.generadoPor = value;
    }

    /**
     * Obtiene el valor de la propiedad generador.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getGenerador() {
        return generador;
    }

    /**
     * Define el valor de la propiedad generador.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setGenerador(PersonaFisicaJuridicaType value) {
        this.generador = value;
    }

    /**
     * Obtiene el valor de la propiedad encadenamiento.
     * 
     * @return
     *     possible object is
     *     {@link RegistroFacturacionAnulacionType.Encadenamiento }
     *     
     */
    public RegistroFacturacionAnulacionType.Encadenamiento getEncadenamiento() {
        return encadenamiento;
    }

    /**
     * Define el valor de la propiedad encadenamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroFacturacionAnulacionType.Encadenamiento }
     *     
     */
    public void setEncadenamiento(RegistroFacturacionAnulacionType.Encadenamiento value) {
        this.encadenamiento = value;
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
     * Obtiene el valor de la propiedad fechaHoraHusoGenRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraHusoGenRegistro() {
        return fechaHoraHusoGenRegistro;
    }

    /**
     * Define el valor de la propiedad fechaHoraHusoGenRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraHusoGenRegistro(XMLGregorianCalendar value) {
        this.fechaHoraHusoGenRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHuella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHuella() {
        return tipoHuella;
    }

    /**
     * Define el valor de la propiedad tipoHuella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHuella(String value) {
        this.tipoHuella = value;
    }

    /**
     * Obtiene el valor de la propiedad huella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuella() {
        return huella;
    }

    /**
     * Define el valor de la propiedad huella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuella(String value) {
        this.huella = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="PrimerRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PrimerRegistroCadenaType"/&gt;
     *         &lt;element name="RegistroAnterior" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EncadenamientoFacturaAnteriorType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primerRegistro",
        "registroAnterior"
    })
    public static class Encadenamiento {

        @XmlElement(name = "PrimerRegistro")
        @XmlSchemaType(name = "string")
        protected PrimerRegistroCadenaType primerRegistro;
        @XmlElement(name = "RegistroAnterior")
        protected EncadenamientoFacturaAnteriorType registroAnterior;

        /**
         * Obtiene el valor de la propiedad primerRegistro.
         * 
         * @return
         *     possible object is
         *     {@link PrimerRegistroCadenaType }
         *     
         */
        public PrimerRegistroCadenaType getPrimerRegistro() {
            return primerRegistro;
        }

        /**
         * Define el valor de la propiedad primerRegistro.
         * 
         * @param value
         *     allowed object is
         *     {@link PrimerRegistroCadenaType }
         *     
         */
        public void setPrimerRegistro(PrimerRegistroCadenaType value) {
            this.primerRegistro = value;
        }

        /**
         * Obtiene el valor de la propiedad registroAnterior.
         * 
         * @return
         *     possible object is
         *     {@link EncadenamientoFacturaAnteriorType }
         *     
         */
        public EncadenamientoFacturaAnteriorType getRegistroAnterior() {
            return registroAnterior;
        }

        /**
         * Define el valor de la propiedad registroAnterior.
         * 
         * @param value
         *     allowed object is
         *     {@link EncadenamientoFacturaAnteriorType }
         *     
         */
        public void setRegistroAnterior(EncadenamientoFacturaAnteriorType value) {
            this.registroAnterior = value;
        }

    }

}
