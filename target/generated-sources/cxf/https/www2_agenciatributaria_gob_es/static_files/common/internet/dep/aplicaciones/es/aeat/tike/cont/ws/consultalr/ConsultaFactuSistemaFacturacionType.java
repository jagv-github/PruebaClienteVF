
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion.CabeceraConsultaSf;


/**
 * <p>Clase Java para ConsultaFactuSistemaFacturacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFactuSistemaFacturacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CabeceraConsultaSf"/&gt;
 *         &lt;element name="FiltroConsulta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd}LRFiltroRegFacturacionType"/&gt;
 *         &lt;element name="DatosAdicionalesRespuesta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd}DatosAdicionalesRespuestaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFactuSistemaFacturacionType", propOrder = {
    "cabecera",
    "filtroConsulta",
    "datosAdicionalesRespuesta"
})
public class ConsultaFactuSistemaFacturacionType {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaSf cabecera;
    @XmlElement(name = "FiltroConsulta", required = true)
    protected LRFiltroRegFacturacionType filtroConsulta;
    @XmlElement(name = "DatosAdicionalesRespuesta")
    protected DatosAdicionalesRespuestaType datosAdicionalesRespuesta;

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
     * Obtiene el valor de la propiedad filtroConsulta.
     * 
     * @return
     *     possible object is
     *     {@link LRFiltroRegFacturacionType }
     *     
     */
    public LRFiltroRegFacturacionType getFiltroConsulta() {
        return filtroConsulta;
    }

    /**
     * Define el valor de la propiedad filtroConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link LRFiltroRegFacturacionType }
     *     
     */
    public void setFiltroConsulta(LRFiltroRegFacturacionType value) {
        this.filtroConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionalesRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link DatosAdicionalesRespuestaType }
     *     
     */
    public DatosAdicionalesRespuestaType getDatosAdicionalesRespuesta() {
        return datosAdicionalesRespuesta;
    }

    /**
     * Define el valor de la propiedad datosAdicionalesRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAdicionalesRespuestaType }
     *     
     */
    public void setDatosAdicionalesRespuesta(DatosAdicionalesRespuestaType value) {
        this.datosAdicionalesRespuesta = value;
    }

}
