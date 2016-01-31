
package com.pg.ws.binding.doc.literal.wrap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getExchangeRateResponse", namespace = "http://wrap.literal.doc.binding.ws.pg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchangeRateResponse", namespace = "http://wrap.literal.doc.binding.ws.pg.com/")
public class GetExchangeRateResponse {

    @XmlElement(name = "return", namespace = "")
    private com.pg.ws.binding.bo.ExchangeRateBO _return;

    /**
     * 
     * @return
     *     returns ExchangeRateBO
     */
    public com.pg.ws.binding.bo.ExchangeRateBO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.pg.ws.binding.bo.ExchangeRateBO _return) {
        this._return = _return;
    }

}
