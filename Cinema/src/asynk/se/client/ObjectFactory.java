
package asynk.se.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.client package. 
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

    private final static QName _GetBuyerList_QNAME = new QName("http://local:8085/Buyers", "getBuyerList");
    private final static QName _GetBuyerListResponse_QNAME = new QName("http://local:8085/Buyers", "getBuyerListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBuyerList }
     * 
     */
    public GetBuyerList createGetBuyerList() {
        return new GetBuyerList();
    }

    /**
     * Create an instance of {@link GetBuyerListResponse }
     * 
     */
    public GetBuyerListResponse createGetBuyerListResponse() {
        return new GetBuyerListResponse();
    }

    /**
     * Create an instance of {@link Buyer }
     * 
     */
    public Buyer createBuyer() {
        return new Buyer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local:8085/Buyers", name = "getBuyerList")
    public JAXBElement<GetBuyerList> createGetBuyerList(GetBuyerList value) {
        return new JAXBElement<GetBuyerList>(_GetBuyerList_QNAME, GetBuyerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local:8085/Buyers", name = "getBuyerListResponse")
    public JAXBElement<GetBuyerListResponse> createGetBuyerListResponse(GetBuyerListResponse value) {
        return new JAXBElement<GetBuyerListResponse>(_GetBuyerListResponse_QNAME, GetBuyerListResponse.class, null, value);
    }

}
