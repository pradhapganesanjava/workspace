
package com.pg.ws.binding.doc.literal.wrap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getExchangeRate", namespace = "http://wrap.literal.doc.binding.ws.pg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeRate", namespace = "http://wrap.literal.doc.binding.ws.pg.com/")
public class GetExchangeRate {

    @XmlElement(name = "arg0", namespace = "")
    private com.pg.ws.binding.bo.ExchangeRateRequestBO arg0;

    /**
     * 
     * @return
     *     returns ExchangeRateRequestBO
     */
    public com.pg.ws.binding.bo.ExchangeRateRequestBO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.pg.ws.binding.bo.ExchangeRateRequestBO arg0) {
        this.arg0 = arg0;
    }

}
