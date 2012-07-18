
package org.jboss.jbossts.xts.servicetests.generated;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "XTSServiceTestService", targetNamespace = "http://jbossts.jboss.org/xts/servicetests/generated", wsdlLocation = "wsdl/xtsservicetests.wsdl")
public class XTSServiceTestService
    extends Service
{

    private final static URL XTSSERVICETESTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.jboss.jbossts.xts.servicetests.generated.XTSServiceTestService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.jboss.jbossts.xts.servicetests.generated.XTSServiceTestService.class.getResource(".");
            url = new URL(baseUrl, "wsdl/xtsservicetests.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'wsdl/xtsservicetests.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        XTSSERVICETESTSERVICE_WSDL_LOCATION = url;
    }

    public XTSServiceTestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public XTSServiceTestService() {
        super(XTSSERVICETESTSERVICE_WSDL_LOCATION, new QName("http://jbossts.jboss.org/xts/servicetests/generated", "XTSServiceTestService"));
    }

    /**
     * 
     * @return
     *     returns XTSServiceTestPortType
     */
    @WebEndpoint(name = "XTSServiceTestPortType")
    public XTSServiceTestPortType getXTSServiceTestPortType() {
        return super.getPort(new QName("http://jbossts.jboss.org/xts/servicetests/generated", "XTSServiceTestPortType"), XTSServiceTestPortType.class);
    }

}