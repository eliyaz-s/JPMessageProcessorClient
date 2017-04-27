
package com.eliyaz.jpm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eliyaz.jpm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdjustSalesResponse_QNAME = new QName("http://jpm.eliyaz.com/", "adjustSalesResponse");
    private final static QName _AddSingleSale_QNAME = new QName("http://jpm.eliyaz.com/", "addSingleSale");
    private final static QName _AddMultipleSales_QNAME = new QName("http://jpm.eliyaz.com/", "addMultipleSales");
    private final static QName _AdjustSales_QNAME = new QName("http://jpm.eliyaz.com/", "adjustSales");
    private final static QName _AddSingleSaleResponse_QNAME = new QName("http://jpm.eliyaz.com/", "addSingleSaleResponse");
    private final static QName _AddMultipleSalesResponse_QNAME = new QName("http://jpm.eliyaz.com/", "addMultipleSalesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eliyaz.jpm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMultipleSales }
     * 
     */
    public AddMultipleSales createAddMultipleSales() {
        return new AddMultipleSales();
    }

    /**
     * Create an instance of {@link AdjustSalesResponse }
     * 
     */
    public AdjustSalesResponse createAdjustSalesResponse() {
        return new AdjustSalesResponse();
    }

    /**
     * Create an instance of {@link AddSingleSale }
     * 
     */
    public AddSingleSale createAddSingleSale() {
        return new AddSingleSale();
    }

    /**
     * Create an instance of {@link AdjustSales }
     * 
     */
    public AdjustSales createAdjustSales() {
        return new AdjustSales();
    }

    /**
     * Create an instance of {@link AddSingleSaleResponse }
     * 
     */
    public AddSingleSaleResponse createAddSingleSaleResponse() {
        return new AddSingleSaleResponse();
    }

    /**
     * Create an instance of {@link AddMultipleSalesResponse }
     * 
     */
    public AddMultipleSalesResponse createAddMultipleSalesResponse() {
        return new AddMultipleSalesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustSalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "adjustSalesResponse")
    public JAXBElement<AdjustSalesResponse> createAdjustSalesResponse(AdjustSalesResponse value) {
        return new JAXBElement<AdjustSalesResponse>(_AdjustSalesResponse_QNAME, AdjustSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSingleSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "addSingleSale")
    public JAXBElement<AddSingleSale> createAddSingleSale(AddSingleSale value) {
        return new JAXBElement<AddSingleSale>(_AddSingleSale_QNAME, AddSingleSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMultipleSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "addMultipleSales")
    public JAXBElement<AddMultipleSales> createAddMultipleSales(AddMultipleSales value) {
        return new JAXBElement<AddMultipleSales>(_AddMultipleSales_QNAME, AddMultipleSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "adjustSales")
    public JAXBElement<AdjustSales> createAdjustSales(AdjustSales value) {
        return new JAXBElement<AdjustSales>(_AdjustSales_QNAME, AdjustSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSingleSaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "addSingleSaleResponse")
    public JAXBElement<AddSingleSaleResponse> createAddSingleSaleResponse(AddSingleSaleResponse value) {
        return new JAXBElement<AddSingleSaleResponse>(_AddSingleSaleResponse_QNAME, AddSingleSaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMultipleSalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpm.eliyaz.com/", name = "addMultipleSalesResponse")
    public JAXBElement<AddMultipleSalesResponse> createAddMultipleSalesResponse(AddMultipleSalesResponse value) {
        return new JAXBElement<AddMultipleSalesResponse>(_AddMultipleSalesResponse_QNAME, AddMultipleSalesResponse.class, null, value);
    }

}
