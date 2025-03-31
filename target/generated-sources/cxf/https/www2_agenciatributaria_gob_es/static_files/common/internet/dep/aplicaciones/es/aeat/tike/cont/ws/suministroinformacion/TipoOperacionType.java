
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoOperacionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoOperacionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Alta"/&gt;
 *     &lt;enumeration value="Anulacion"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoOperacionType")
@XmlEnum
public enum TipoOperacionType {


    /**
     * La operación realizada ha sido un alta
     * 
     */
    @XmlEnumValue("Alta")
    ALTA("Alta"),

    /**
     * La operación realizada ha sido una anulación
     * 
     */
    @XmlEnumValue("Anulacion")
    ANULACION("Anulacion");
    private final String value;

    TipoOperacionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoOperacionType fromValue(String v) {
        for (TipoOperacionType c: TipoOperacionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
