
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechazoPrevioType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RechazoPrevioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RechazoPrevioType")
@XmlEnum
public enum RechazoPrevioType {


    /**
     * No ha habido rechazo previo por la AEAT.
     * 
     */
    N,

    /**
     * Ha habido rechazo previo por la AEAT.
     * 
     */
    S,

    /**
     * Independientemente de si ha habido o no algún rechazo previo por la AEAT, el registro de facturación no existe en la AEAT (registro existente en ese SIF o en algún SIF del obligado tributario y que no se remitió a la AEAT, por ejemplo, al acogerse a Veri*factu desde no Veri*factu). No deberían existir operaciones de alta (N,X), por lo que no se admiten. 
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static RechazoPrevioType fromValue(String v) {
        return valueOf(v);
    }

}
