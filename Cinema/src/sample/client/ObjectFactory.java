
package sample.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sample.client package. 
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

    private final static QName _CreateStatementResponse_QNAME = new QName("http://local", "createStatementResponse");
    private final static QName _PassResponse_QNAME = new QName("http://local", "PassResponse");
    private final static QName _Pass_QNAME = new QName("http://local", "Pass");
    private final static QName _CreateStatement_QNAME = new QName("http://local", "createStatement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sample.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateStatement }
     * 
     */
    public CreateStatement createCreateStatement() {
        return new CreateStatement();
    }

    /**
     * Create an instance of {@link Pass }
     * 
     */
    public Pass createPass() {
        return new Pass();
    }

    /**
     * Create an instance of {@link PassResponse }
     * 
     */
    public PassResponse createPassResponse() {
        return new PassResponse();
    }

    /**
     * Create an instance of {@link CreateStatementResponse }
     * 
     */
    public CreateStatementResponse createCreateStatementResponse() {
        return new CreateStatementResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link Buyer }
     * 
     */
    public Buyer createBuyer() {
        return new Buyer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local", name = "createStatementResponse")
    public JAXBElement<CreateStatementResponse> createCreateStatementResponse(CreateStatementResponse value) {
        return new JAXBElement<CreateStatementResponse>(_CreateStatementResponse_QNAME, CreateStatementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local", name = "PassResponse")
    public JAXBElement<PassResponse> createPassResponse(PassResponse value) {
        return new JAXBElement<PassResponse>(_PassResponse_QNAME, PassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local", name = "Pass")
    public JAXBElement<Pass> createPass(Pass value) {
        return new JAXBElement<Pass>(_Pass_QNAME, Pass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStatement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local", name = "createStatement")
    public JAXBElement<CreateStatement> createCreateStatement(CreateStatement value) {
        return new JAXBElement<CreateStatement>(_CreateStatement_QNAME, CreateStatement.class, null, value);
    }

}
