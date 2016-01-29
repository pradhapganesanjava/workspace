
package com.pg.ws.client.binding.rpc.literal;

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
@WebServiceClient(name = "RPCLiteralServiceSEI", targetNamespace = "http://literal.rpc.binding.ws.pg.com/", wsdlLocation = "file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/RPCLiteralServiceSEI.wsdl")
public class RPCLiteralServiceSEI
    extends Service
{

    private final static URL RPCLITERALSERVICESEI_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.pg.ws.client.binding.rpc.literal.RPCLiteralServiceSEI.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.pg.ws.client.binding.rpc.literal.RPCLiteralServiceSEI.class.getResource(".");
            url = new URL(baseUrl, "file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/RPCLiteralServiceSEI.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/A:/projects/pgworkspace/X_WS_SOAP_Java/wsdl/wsimport/RPCLiteralServiceSEI.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RPCLITERALSERVICESEI_WSDL_LOCATION = url;
    }

    public RPCLiteralServiceSEI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RPCLiteralServiceSEI() {
        super(RPCLITERALSERVICESEI_WSDL_LOCATION, new QName("http://literal.rpc.binding.ws.pg.com/", "RPCLiteralServiceSEI"));
    }

    /**
     * 
     * @return
     *     returns RPCLiteralService
     */
    @WebEndpoint(name = "RPCLiteralServiceImplPort")
    public RPCLiteralService getRPCLiteralServiceImplPort() {
        return super.getPort(new QName("http://literal.rpc.binding.ws.pg.com/", "RPCLiteralServiceImplPort"), RPCLiteralService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RPCLiteralService
     */
    @WebEndpoint(name = "RPCLiteralServiceImplPort")
    public RPCLiteralService getRPCLiteralServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://literal.rpc.binding.ws.pg.com/", "RPCLiteralServiceImplPort"), RPCLiteralService.class, features);
    }

}
