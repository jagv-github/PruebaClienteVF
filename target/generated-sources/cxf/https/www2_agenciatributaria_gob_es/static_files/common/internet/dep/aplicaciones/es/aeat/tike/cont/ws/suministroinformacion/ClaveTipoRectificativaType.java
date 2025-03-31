
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaveTipoRectificativaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ClaveTipoRectificativaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaveTipoRectificativaType")
@XmlEnum
public enum ClaveTipoRectificativaType {


    /**
     * SUSTITUTIVA
     * 
     */
    S,

    /**
     * INCREMENTAL
     * 
     */
    I;

    public String value() {
        return name();
    }

    public static ClaveTipoRectificativaType fromValue(String v) {
        return valueOf(v);
    }

}
