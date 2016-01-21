
package com.pg.ws.simpleserver.math.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getSquare", namespace = "http://math.simpleserver.ws.pg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSquare", namespace = "http://math.simpleserver.ws.pg.com/")
public class GetSquare {

    @XmlElement(name = "arg0", namespace = "")
    private Integer arg0;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Integer arg0) {
        this.arg0 = arg0;
    }

}
