
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeneradoPorType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="GeneradoPorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneradoPorType")
@XmlEnum
public enum GeneradoPorType {


    /**
     * Expedidor (obligado a Expedir la factura anulada).
     * 
     */
    E,

    /**
     * Destinatario
     * 
     */
    D,

    /**
     * Tercero
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static GeneradoPorType fromValue(String v) {
        return valueOf(v);
    }

}
