
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TercerosODestinatarioType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TercerosODestinatarioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TercerosODestinatarioType")
@XmlEnum
public enum TercerosODestinatarioType {


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

    public static TercerosODestinatarioType fromValue(String v) {
        return valueOf(v);
    }

}
