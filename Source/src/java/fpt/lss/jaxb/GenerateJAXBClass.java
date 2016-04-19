/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.jaxb;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import java.io.File;
import java.io.IOException;
import org.xml.sax.InputSource;

/**
 *
 * @author HongLinh
 */
public class GenerateJAXBClass {

    public static void main(String[] args) throws IOException {
//        generate("fpt.lss.jaxb", "src/java/fpt/lss/jaxb/schema.xsd", "src/java/");
        generate("fpt.lss.dto", "src/java/fpt/lss/jaxb/compLapSche.xsd", "src/java/");
    }

    private static void generate(String packageName, String xsdPath, String desPath) throws IOException {
        String output = desPath;
        SchemaCompiler sc = XJC.createSchemaCompiler();
        sc.forcePackageName(packageName);
        File schema = new File(xsdPath);
        InputSource is = new InputSource(schema.toURI().toString());
        sc.parseSchema(is);
        S2JJAXBModel model = sc.bind();
        JCodeModel code = model.generateCode(null, null);
        code.build(new File(output));
        System.out.println("Finished!");
    }

}
