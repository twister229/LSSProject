/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.utils;

import fpt.lss.crawler.ValidationHandler;
import fpt.lss.jaxb.LaptopJAXB;
import java.io.File;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

/**
 *
 * @author HongLinh
 */
public class XMLUtils {

    public static <T> boolean validateJAXBObject(T entity, String xsdPath) {
        try {
            JAXBContext jc = JAXBContext.newInstance(entity.getClass());
            JAXBSource source = new JAXBSource(jc, entity);

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File(xsdPath));

            Validator validator = schema.newValidator();
            validator.setErrorHandler(new ValidationHandler());
            validator.validate(source);
        } catch (Exception ex) {
            if (entity instanceof LaptopJAXB) {
                System.out.println("Link: " + ((LaptopJAXB) entity).getSourceLink());
            }
            return false;
        }
        return true;
    }

    public static <T> String marshallToString(T entity) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(entity.getClass());
        Marshaller mar = ctx.createMarshaller();
        mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        mar.marshal(entity, sw);

        return sw.toString();
    }
}
