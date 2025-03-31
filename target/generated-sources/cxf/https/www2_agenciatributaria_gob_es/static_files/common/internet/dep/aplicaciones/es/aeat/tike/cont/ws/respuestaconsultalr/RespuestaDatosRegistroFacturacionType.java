
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ClaveTipoFacturaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.ClaveTipoRectificativaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CompletaSinDestinatarioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CuponType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DesgloseRectificacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.DesgloseType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.EncadenamientoFacturaAnteriorType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.GeneradoPorType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IDFacturaARType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.IncidenciaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.MacrodatoType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PersonaFisicaJuridicaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.PrimerRegistroCadenaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.RechazoPrevioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SimplificadaCualificadaType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SinRegistroPrevioType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SistemaInformaticoType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.SubsanacionType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.TercerosODestinatarioType;


/**
 *  Apunte correspondiente al libro de facturas expedidas. 
 * 
 * <p>Clase Java para RespuestaDatosRegistroFacturacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaDatosRegistroFacturacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreRazonEmisor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax120Type" minOccurs="0"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="Subsanacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SubsanacionType" minOccurs="0"/&gt;
 *         &lt;element name="RechazoPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RechazoPrevioType" minOccurs="0"/&gt;
 *         &lt;element name="SinRegistroPrevio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SinRegistroPrevioType" minOccurs="0"/&gt;
 *         &lt;element name="GeneradoPor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}GeneradoPorType" minOccurs="0"/&gt;
 *         &lt;element name="Generador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClaveTipoFacturaType" minOccurs="0"/&gt;
 *         &lt;element name="TipoRectificativa" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClaveTipoRectificativaType" minOccurs="0"/&gt;
 *         &lt;element name="FacturasRectificadas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="1000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FacturasSustituidas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaSustituida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="1000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImporteRectificacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DesgloseRectificacionType" minOccurs="0"/&gt;
 *         &lt;element name="FechaOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax500Type" minOccurs="0"/&gt;
 *         &lt;element name="FacturaSimplificadaArt7273" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SimplificadaCualificadaType" minOccurs="0"/&gt;
 *         &lt;element name="FacturaSinIdentifDestinatarioArt61d" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CompletaSinDestinatarioType" minOccurs="0"/&gt;
 *         &lt;element name="Macrodato" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}MacrodatoType" minOccurs="0"/&gt;
 *         &lt;element name="EmitidaPorTerceroODestinatario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TercerosODestinatarioType" minOccurs="0"/&gt;
 *         &lt;element name="Tercero" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/&gt;
 *         &lt;element name="Destinatarios" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDDestinatario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" maxOccurs="1000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cupon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CuponType" minOccurs="0"/&gt;
 *         &lt;element name="Desglose" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DesgloseType" minOccurs="0"/&gt;
 *         &lt;element name="CuotaTotal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="Encadenamiento" minOccurs="0"&gt;
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
 *         &lt;element name="SistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SistemaInformaticoType" minOccurs="0"/&gt;
 *         &lt;element name="FechaHoraHusoGenRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NumRegistroAcuerdoFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="IdAcuerdoSistemaInformatico" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax16Type" minOccurs="0"/&gt;
 *         &lt;element name="TipoHuella" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoHuellaType" minOccurs="0"/&gt;
 *         &lt;element name="Huella" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax64Type" minOccurs="0"/&gt;
 *         &lt;element name="NifRepresentante" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType" minOccurs="0"/&gt;
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
@XmlType(name = "RespuestaDatosRegistroFacturacionType", propOrder = {
    "nombreRazonEmisor",
    "refExterna",
    "subsanacion",
    "rechazoPrevio",
    "sinRegistroPrevio",
    "generadoPor",
    "generador",
    "tipoFactura",
    "tipoRectificativa",
    "facturasRectificadas",
    "facturasSustituidas",
    "importeRectificacion",
    "fechaOperacion",
    "descripcionOperacion",
    "facturaSimplificadaArt7273",
    "facturaSinIdentifDestinatarioArt61D",
    "macrodato",
    "emitidaPorTerceroODestinatario",
    "tercero",
    "destinatarios",
    "cupon",
    "desglose",
    "cuotaTotal",
    "importeTotal",
    "encadenamiento",
    "sistemaInformatico",
    "fechaHoraHusoGenRegistro",
    "numRegistroAcuerdoFacturacion",
    "idAcuerdoSistemaInformatico",
    "tipoHuella",
    "huella",
    "nifRepresentante",
    "fechaFinVeriFactu",
    "incidencia"
})
public class RespuestaDatosRegistroFacturacionType {

    @XmlElement(name = "NombreRazonEmisor")
    protected String nombreRazonEmisor;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "Subsanacion")
    @XmlSchemaType(name = "string")
    protected SubsanacionType subsanacion;
    @XmlElement(name = "RechazoPrevio")
    @XmlSchemaType(name = "string")
    protected RechazoPrevioType rechazoPrevio;
    @XmlElement(name = "SinRegistroPrevio")
    @XmlSchemaType(name = "string")
    protected SinRegistroPrevioType sinRegistroPrevio;
    @XmlElement(name = "GeneradoPor")
    @XmlSchemaType(name = "string")
    protected GeneradoPorType generadoPor;
    @XmlElement(name = "Generador")
    protected PersonaFisicaJuridicaType generador;
    @XmlElement(name = "TipoFactura")
    @XmlSchemaType(name = "string")
    protected ClaveTipoFacturaType tipoFactura;
    @XmlElement(name = "TipoRectificativa")
    @XmlSchemaType(name = "string")
    protected ClaveTipoRectificativaType tipoRectificativa;
    @XmlElement(name = "FacturasRectificadas")
    protected RespuestaDatosRegistroFacturacionType.FacturasRectificadas facturasRectificadas;
    @XmlElement(name = "FacturasSustituidas")
    protected RespuestaDatosRegistroFacturacionType.FacturasSustituidas facturasSustituidas;
    @XmlElement(name = "ImporteRectificacion")
    protected DesgloseRectificacionType importeRectificacion;
    @XmlElement(name = "FechaOperacion")
    protected String fechaOperacion;
    @XmlElement(name = "DescripcionOperacion")
    protected String descripcionOperacion;
    @XmlElement(name = "FacturaSimplificadaArt7273")
    @XmlSchemaType(name = "string")
    protected SimplificadaCualificadaType facturaSimplificadaArt7273;
    @XmlElement(name = "FacturaSinIdentifDestinatarioArt61d")
    @XmlSchemaType(name = "string")
    protected CompletaSinDestinatarioType facturaSinIdentifDestinatarioArt61D;
    @XmlElement(name = "Macrodato")
    @XmlSchemaType(name = "string")
    protected MacrodatoType macrodato;
    @XmlElement(name = "EmitidaPorTerceroODestinatario")
    @XmlSchemaType(name = "string")
    protected TercerosODestinatarioType emitidaPorTerceroODestinatario;
    @XmlElement(name = "Tercero")
    protected PersonaFisicaJuridicaType tercero;
    @XmlElement(name = "Destinatarios")
    protected RespuestaDatosRegistroFacturacionType.Destinatarios destinatarios;
    @XmlElement(name = "Cupon")
    @XmlSchemaType(name = "string")
    protected CuponType cupon;
    @XmlElement(name = "Desglose")
    protected DesgloseType desglose;
    @XmlElement(name = "CuotaTotal")
    protected String cuotaTotal;
    @XmlElement(name = "ImporteTotal")
    protected String importeTotal;
    @XmlElement(name = "Encadenamiento")
    protected RespuestaDatosRegistroFacturacionType.Encadenamiento encadenamiento;
    @XmlElement(name = "SistemaInformatico")
    protected SistemaInformaticoType sistemaInformatico;
    @XmlElement(name = "FechaHoraHusoGenRegistro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraHusoGenRegistro;
    @XmlElement(name = "NumRegistroAcuerdoFacturacion")
    protected String numRegistroAcuerdoFacturacion;
    @XmlElement(name = "IdAcuerdoSistemaInformatico")
    protected String idAcuerdoSistemaInformatico;
    @XmlElement(name = "TipoHuella")
    protected String tipoHuella;
    @XmlElement(name = "Huella")
    protected String huella;
    @XmlElement(name = "NifRepresentante")
    protected String nifRepresentante;
    @XmlElement(name = "FechaFinVeriFactu")
    protected String fechaFinVeriFactu;
    @XmlElement(name = "Incidencia")
    @XmlSchemaType(name = "string")
    protected IncidenciaType incidencia;

    /**
     * Obtiene el valor de la propiedad nombreRazonEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazonEmisor() {
        return nombreRazonEmisor;
    }

    /**
     * Define el valor de la propiedad nombreRazonEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazonEmisor(String value) {
        this.nombreRazonEmisor = value;
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
     * Obtiene el valor de la propiedad subsanacion.
     * 
     * @return
     *     possible object is
     *     {@link SubsanacionType }
     *     
     */
    public SubsanacionType getSubsanacion() {
        return subsanacion;
    }

    /**
     * Define el valor de la propiedad subsanacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsanacionType }
     *     
     */
    public void setSubsanacion(SubsanacionType value) {
        this.subsanacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rechazoPrevio.
     * 
     * @return
     *     possible object is
     *     {@link RechazoPrevioType }
     *     
     */
    public RechazoPrevioType getRechazoPrevio() {
        return rechazoPrevio;
    }

    /**
     * Define el valor de la propiedad rechazoPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link RechazoPrevioType }
     *     
     */
    public void setRechazoPrevio(RechazoPrevioType value) {
        this.rechazoPrevio = value;
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
     * Obtiene el valor de la propiedad tipoFactura.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public ClaveTipoFacturaType getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Define el valor de la propiedad tipoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public void setTipoFactura(ClaveTipoFacturaType value) {
        this.tipoFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRectificativa.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoRectificativaType }
     *     
     */
    public ClaveTipoRectificativaType getTipoRectificativa() {
        return tipoRectificativa;
    }

    /**
     * Define el valor de la propiedad tipoRectificativa.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoRectificativaType }
     *     
     */
    public void setTipoRectificativa(ClaveTipoRectificativaType value) {
        this.tipoRectificativa = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasRectificadas.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDatosRegistroFacturacionType.FacturasRectificadas }
     *     
     */
    public RespuestaDatosRegistroFacturacionType.FacturasRectificadas getFacturasRectificadas() {
        return facturasRectificadas;
    }

    /**
     * Define el valor de la propiedad facturasRectificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDatosRegistroFacturacionType.FacturasRectificadas }
     *     
     */
    public void setFacturasRectificadas(RespuestaDatosRegistroFacturacionType.FacturasRectificadas value) {
        this.facturasRectificadas = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasSustituidas.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDatosRegistroFacturacionType.FacturasSustituidas }
     *     
     */
    public RespuestaDatosRegistroFacturacionType.FacturasSustituidas getFacturasSustituidas() {
        return facturasSustituidas;
    }

    /**
     * Define el valor de la propiedad facturasSustituidas.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDatosRegistroFacturacionType.FacturasSustituidas }
     *     
     */
    public void setFacturasSustituidas(RespuestaDatosRegistroFacturacionType.FacturasSustituidas value) {
        this.facturasSustituidas = value;
    }

    /**
     * Obtiene el valor de la propiedad importeRectificacion.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public DesgloseRectificacionType getImporteRectificacion() {
        return importeRectificacion;
    }

    /**
     * Define el valor de la propiedad importeRectificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public void setImporteRectificacion(DesgloseRectificacionType value) {
        this.importeRectificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOperacion(String value) {
        this.descripcionOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaSimplificadaArt7273.
     * 
     * @return
     *     possible object is
     *     {@link SimplificadaCualificadaType }
     *     
     */
    public SimplificadaCualificadaType getFacturaSimplificadaArt7273() {
        return facturaSimplificadaArt7273;
    }

    /**
     * Define el valor de la propiedad facturaSimplificadaArt7273.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplificadaCualificadaType }
     *     
     */
    public void setFacturaSimplificadaArt7273(SimplificadaCualificadaType value) {
        this.facturaSimplificadaArt7273 = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaSinIdentifDestinatarioArt61D.
     * 
     * @return
     *     possible object is
     *     {@link CompletaSinDestinatarioType }
     *     
     */
    public CompletaSinDestinatarioType getFacturaSinIdentifDestinatarioArt61D() {
        return facturaSinIdentifDestinatarioArt61D;
    }

    /**
     * Define el valor de la propiedad facturaSinIdentifDestinatarioArt61D.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletaSinDestinatarioType }
     *     
     */
    public void setFacturaSinIdentifDestinatarioArt61D(CompletaSinDestinatarioType value) {
        this.facturaSinIdentifDestinatarioArt61D = value;
    }

    /**
     * Obtiene el valor de la propiedad macrodato.
     * 
     * @return
     *     possible object is
     *     {@link MacrodatoType }
     *     
     */
    public MacrodatoType getMacrodato() {
        return macrodato;
    }

    /**
     * Define el valor de la propiedad macrodato.
     * 
     * @param value
     *     allowed object is
     *     {@link MacrodatoType }
     *     
     */
    public void setMacrodato(MacrodatoType value) {
        this.macrodato = value;
    }

    /**
     * Obtiene el valor de la propiedad emitidaPorTerceroODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link TercerosODestinatarioType }
     *     
     */
    public TercerosODestinatarioType getEmitidaPorTerceroODestinatario() {
        return emitidaPorTerceroODestinatario;
    }

    /**
     * Define el valor de la propiedad emitidaPorTerceroODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link TercerosODestinatarioType }
     *     
     */
    public void setEmitidaPorTerceroODestinatario(TercerosODestinatarioType value) {
        this.emitidaPorTerceroODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad tercero.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getTercero() {
        return tercero;
    }

    /**
     * Define el valor de la propiedad tercero.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setTercero(PersonaFisicaJuridicaType value) {
        this.tercero = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarios.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDatosRegistroFacturacionType.Destinatarios }
     *     
     */
    public RespuestaDatosRegistroFacturacionType.Destinatarios getDestinatarios() {
        return destinatarios;
    }

    /**
     * Define el valor de la propiedad destinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDatosRegistroFacturacionType.Destinatarios }
     *     
     */
    public void setDestinatarios(RespuestaDatosRegistroFacturacionType.Destinatarios value) {
        this.destinatarios = value;
    }

    /**
     * Obtiene el valor de la propiedad cupon.
     * 
     * @return
     *     possible object is
     *     {@link CuponType }
     *     
     */
    public CuponType getCupon() {
        return cupon;
    }

    /**
     * Define el valor de la propiedad cupon.
     * 
     * @param value
     *     allowed object is
     *     {@link CuponType }
     *     
     */
    public void setCupon(CuponType value) {
        this.cupon = value;
    }

    /**
     * Obtiene el valor de la propiedad desglose.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseType }
     *     
     */
    public DesgloseType getDesglose() {
        return desglose;
    }

    /**
     * Define el valor de la propiedad desglose.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseType }
     *     
     */
    public void setDesglose(DesgloseType value) {
        this.desglose = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaTotal() {
        return cuotaTotal;
    }

    /**
     * Define el valor de la propiedad cuotaTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaTotal(String value) {
        this.cuotaTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad encadenamiento.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDatosRegistroFacturacionType.Encadenamiento }
     *     
     */
    public RespuestaDatosRegistroFacturacionType.Encadenamiento getEncadenamiento() {
        return encadenamiento;
    }

    /**
     * Define el valor de la propiedad encadenamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDatosRegistroFacturacionType.Encadenamiento }
     *     
     */
    public void setEncadenamiento(RespuestaDatosRegistroFacturacionType.Encadenamiento value) {
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
     * Obtiene el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }

    /**
     * Define el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroAcuerdoFacturacion(String value) {
        this.numRegistroAcuerdoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idAcuerdoSistemaInformatico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAcuerdoSistemaInformatico() {
        return idAcuerdoSistemaInformatico;
    }

    /**
     * Define el valor de la propiedad idAcuerdoSistemaInformatico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAcuerdoSistemaInformatico(String value) {
        this.idAcuerdoSistemaInformatico = value;
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
     * Obtiene el valor de la propiedad nifRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNifRepresentante() {
        return nifRepresentante;
    }

    /**
     * Define el valor de la propiedad nifRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNifRepresentante(String value) {
        this.nifRepresentante = value;
    }

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


    /**
     * Contraparte de la operación. Cliente
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
     *         &lt;element name="IDDestinatario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" maxOccurs="1000"/&gt;
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
        "idDestinatario"
    })
    public static class Destinatarios {

        @XmlElement(name = "IDDestinatario", required = true)
        protected List<PersonaFisicaJuridicaType> idDestinatario;

        /**
         * Gets the value of the idDestinatario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idDestinatario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDDestinatario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonaFisicaJuridicaType }
         * 
         * 
         */
        public List<PersonaFisicaJuridicaType> getIDDestinatario() {
            if (idDestinatario == null) {
                idDestinatario = new ArrayList<PersonaFisicaJuridicaType>();
            }
            return this.idDestinatario;
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


    /**
     * El ID de las facturas rectificadas, únicamente se rellena en el caso de rectificación de facturas
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
     *         &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="1000"/&gt;
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
        "idFacturaRectificada"
    })
    public static class FacturasRectificadas {

        @XmlElement(name = "IDFacturaRectificada", required = true)
        protected List<IDFacturaARType> idFacturaRectificada;

        /**
         * Gets the value of the idFacturaRectificada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaRectificada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaRectificada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaRectificada() {
            if (idFacturaRectificada == null) {
                idFacturaRectificada = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaRectificada;
        }

    }


    /**
     * El ID de las facturas sustituidas, únicamente se rellena en el caso de facturas sustituidas
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
     *         &lt;element name="IDFacturaSustituida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="1000"/&gt;
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
        "idFacturaSustituida"
    })
    public static class FacturasSustituidas {

        @XmlElement(name = "IDFacturaSustituida", required = true)
        protected List<IDFacturaARType> idFacturaSustituida;

        /**
         * Gets the value of the idFacturaSustituida property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaSustituida property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaSustituida().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaSustituida() {
            if (idFacturaSustituida == null) {
                idFacturaSustituida = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaSustituida;
        }

    }

}
