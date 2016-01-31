
package com.pg.ws.client.handler.universaltime;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UniversalTimeServiceSEI", targetNamespace = "http://universaltime.handler.ws.pg.com/", wsdlLocation = "file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/UniversalTimeHandler/UniversalTimeServiceSEI.wsdl")
public class UniversalTimeServiceSEI
    extends Service
{

    private final static URL UNIVERSALTIMESERVICESEI_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.pg.ws.client.handler.universaltime.UniversalTimeServiceSEI.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.pg.ws.client.handler.universaltime.UniversalTimeServiceSEI.class.getResource(".");
            url = new URL(baseUrl, "file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/UniversalTimeHandler/UniversalTimeServiceSEI.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/UniversalTimeHandler/UniversalTimeServiceSEI.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UNIVERSALTIMESERVICESEI_WSDL_LOCATION = url;
    }

    public UniversalTimeServiceSEI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UniversalTimeServiceSEI() {
        super(UNIVERSALTIMESERVICESEI_WSDL_LOCATION, new QName("http://universaltime.handler.ws.pg.com/", "UniversalTimeServiceSEI"));
    }

    /**
     * 
     * @return
     *     returns UniversalTimeService
     */
    @WebEndpoint(name = "UniversalTimeServiceImplPort")
    public UniversalTimeService getUniversalTimeServiceImplPort() {
        return super.getPort(new QName("http://universaltime.handler.ws.pg.com/", "UniversalTimeServiceImplPort"), UniversalTimeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UniversalTimeService
     */
    @WebEndpoint(name = "UniversalTimeServiceImplPort")
    public UniversalTimeService getUniversalTimeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://universaltime.handler.ws.pg.com/", "UniversalTimeServiceImplPort"), UniversalTimeService.class, features);
    }

}
