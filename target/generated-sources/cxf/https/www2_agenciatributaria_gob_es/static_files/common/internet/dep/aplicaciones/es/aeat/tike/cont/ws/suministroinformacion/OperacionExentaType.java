
package https.www2_agenciatributaria_gob_es.static_files.common.internet.dep.aplicaciones.es.aeat.tike.cont.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OperacionExentaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OperacionExentaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E1"/&gt;
 *     &lt;enumeration value="E2"/&gt;
 *     &lt;enumeration value="E3"/&gt;
 *     &lt;enumeration value="E4"/&gt;
 *     &lt;enumeration value="E5"/&gt;
 *     &lt;enumeration value="E6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperacionExentaType")
@XmlEnum
public enum OperacionExentaType {


    /**
     * EXENTA por Art. 20 
     * 
     */
    @XmlEnumValue("E1")
    E_1("E1"),

    /**
     * EXENTA por Art. 21
     * 
     */
    @XmlEnumValue("E2")
    E_2("E2"),

    /**
     * EXENTA por Art. 22
     * 
     */
    @XmlEnumValue("E3")
    E_3("E3"),

    /**
     * EXENTA por Art. 24
     * 
     */
    @XmlEnumValue("E4")
    E_4("E4"),

    /**
     * EXENTA por Art. 25
     * 
     */
    @XmlEnumValue("E5")
    E_5("E5"),

    /**
     * EXENTA otros
     * 
     */
    @XmlEnumValue("E6")
    E_6("E6");
    private final String value;

    OperacionExentaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperacionExentaType fromValue(String v) {
        for (OperacionExentaType c: OperacionExentaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
