
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpSettingsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_AGE_RANGE"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE"/>
 *     &lt;enumeration value="INVALID_MIN_AGE"/>
 *     &lt;enumeration value="INVALID_MAX_AGE"/>
 *     &lt;enumeration value="CANNOT_DISABLE_GRP_AFTER_ENABLING"/>
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_PROVIDERS"/>
 *     &lt;enumeration value="CANNOT_CHANGE_TARGET_DEMOG_AFTER_ACTIVATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpSettingsError.Reason")
@XmlEnum
public enum GrpSettingsErrorReason {


    /**
     * 
     *                 Target age range is not valid.
     *               
     * 
     */
    INVALID_AGE_RANGE,

    /**
     * 
     *                 GRP settings are not supported for the given line item type.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 Target age range doesn't support the given target gender.
     *               
     * 
     */
    CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE,

    /**
     * 
     *                 Minimum target age is invalid.
     *               
     * 
     */
    INVALID_MIN_AGE,

    /**
     * 
     *                 Maximum target age is invalid.
     *               
     * 
     */
    INVALID_MAX_AGE,

    /**
     * 
     *                 GRP settings cannot be disabled.
     *               
     * 
     */
    CANNOT_DISABLE_GRP_AFTER_ENABLING,

    /**
     * 
     *                 GRP provider cannot be updated.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_PROVIDERS,

    /**
     * 
     *                 GRP settings cannot be updated.
     *               
     * 
     */
    CANNOT_CHANGE_TARGET_DEMOG_AFTER_ACTIVATION,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static GrpSettingsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
