
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoRegistroType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EstadoRegistroType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Correcta"/&gt;
 *     &lt;enumeration value="AceptadaConErrores"/&gt;
 *     &lt;enumeration value="Anulada"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoRegistroType")
@XmlEnum
public enum EstadoRegistroType {


    /**
     * El registro se almacenado sin errores
     * 
     */
    @XmlEnumValue("Correcta")
    CORRECTA("Correcta"),

    /**
     * El registro se almacenado tiene algunos errores. Ver detalle del error
     * 
     */
    @XmlEnumValue("AceptadaConErrores")
    ACEPTADA_CON_ERRORES("AceptadaConErrores"),

    /**
     * El registro almacenado ha sido anulado
     * 
     */
    @XmlEnumValue("Anulada")
    ANULADA("Anulada");
    private final String value;

    EstadoRegistroType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoRegistroType fromValue(String v) {
        for (EstadoRegistroType c: EstadoRegistroType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
