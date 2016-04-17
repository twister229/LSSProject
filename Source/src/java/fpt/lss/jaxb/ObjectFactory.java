
package fpt.lss.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fpt.lss.jaxb package. 
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

    private final static QName _Cpu_QNAME = new QName("http://xml.netbeans.org/schema/lss_cpu", "cpu");
    private final static QName _VideoCard_QNAME = new QName("http://xml.netbeans.org/schema/lss_cpu", "videoCard");
    private final static QName _LaptopJAXB_QNAME = new QName("http://xml.netbeans.org/schema/lss_cpu", "laptopJAXB");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fpt.lss.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LaptopJAXB }
     * 
     */
    public LaptopJAXB createLaptopJAXB() {
        return new LaptopJAXB();
    }

    /**
     * Create an instance of {@link VideoCardJAXB }
     * 
     */
    public VideoCardJAXB createVideoCardJAXB() {
        return new VideoCardJAXB();
    }

    /**
     * Create an instance of {@link CPUJAXB }
     * 
     */
    public CPUJAXB createCPUJAXB() {
        return new CPUJAXB();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPUJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/lss_cpu", name = "cpu")
    public JAXBElement<CPUJAXB> createCpu(CPUJAXB value) {
        return new JAXBElement<CPUJAXB>(_Cpu_QNAME, CPUJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoCardJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/lss_cpu", name = "videoCard")
    public JAXBElement<VideoCardJAXB> createVideoCard(VideoCardJAXB value) {
        return new JAXBElement<VideoCardJAXB>(_VideoCard_QNAME, VideoCardJAXB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaptopJAXB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/lss_cpu", name = "laptopJAXB")
    public JAXBElement<LaptopJAXB> createLaptopJAXB(LaptopJAXB value) {
        return new JAXBElement<LaptopJAXB>(_LaptopJAXB_QNAME, LaptopJAXB.class, null, value);
    }

}
