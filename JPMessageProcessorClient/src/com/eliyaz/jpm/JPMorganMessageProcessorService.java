
package com.eliyaz.jpm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JPMorganMessageProcessorService", targetNamespace = "http://jpm.eliyaz.com/", wsdlLocation = "http://gladius:8080/JPMessageProcessorWS/JPMorganMessageProcessorService?WSDL")
public class JPMorganMessageProcessorService
    extends Service
{

    private final static URL JPMORGANMESSAGEPROCESSORSERVICE_WSDL_LOCATION;
    private final static WebServiceException JPMORGANMESSAGEPROCESSORSERVICE_EXCEPTION;
    private final static QName JPMORGANMESSAGEPROCESSORSERVICE_QNAME = new QName("http://jpm.eliyaz.com/", "JPMorganMessageProcessorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://gladius:8080/JPMessageProcessorWS/JPMorganMessageProcessorService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JPMORGANMESSAGEPROCESSORSERVICE_WSDL_LOCATION = url;
        JPMORGANMESSAGEPROCESSORSERVICE_EXCEPTION = e;
    }

    public JPMorganMessageProcessorService() {
        super(__getWsdlLocation(), JPMORGANMESSAGEPROCESSORSERVICE_QNAME);
    }

    public JPMorganMessageProcessorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JPMORGANMESSAGEPROCESSORSERVICE_QNAME, features);
    }

    public JPMorganMessageProcessorService(URL wsdlLocation) {
        super(wsdlLocation, JPMORGANMESSAGEPROCESSORSERVICE_QNAME);
    }

    public JPMorganMessageProcessorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JPMORGANMESSAGEPROCESSORSERVICE_QNAME, features);
    }

    public JPMorganMessageProcessorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JPMorganMessageProcessorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JPMorganMessageProcessor
     */
    @WebEndpoint(name = "JPMorganMessageProcessorPort")
    public JPMorganMessageProcessor getJPMorganMessageProcessorPort() {
        return super.getPort(new QName("http://jpm.eliyaz.com/", "JPMorganMessageProcessorPort"), JPMorganMessageProcessor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JPMorganMessageProcessor
     */
    @WebEndpoint(name = "JPMorganMessageProcessorPort")
    public JPMorganMessageProcessor getJPMorganMessageProcessorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jpm.eliyaz.com/", "JPMorganMessageProcessorPort"), JPMorganMessageProcessor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JPMORGANMESSAGEPROCESSORSERVICE_EXCEPTION!= null) {
            throw JPMORGANMESSAGEPROCESSORSERVICE_EXCEPTION;
        }
        return JPMORGANMESSAGEPROCESSORSERVICE_WSDL_LOCATION;
    }

}
