/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// jdk1.4.1

import javax.xml.transform.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class TransformEDItoHTML {
public static void main(String[] args) {
  try {
	  
	EDItoXML ediTransform = new EDItoXML();
	String outputXML = ediTransform.runSmooksTransform();
	
	InputStream stream = new ByteArrayInputStream(outputXML.getBytes(StandardCharsets.UTF_8));

    TransformerFactory tFactory = TransformerFactory.newInstance();

    Transformer transformer =
      tFactory.newTransformer
         (new javax.xml.transform.stream.StreamSource
            ("xmlTransform.xsl"));

    transformer.transform
      (new javax.xml.transform.stream.StreamSource
            (stream),
       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("result.html")));
    System.out.println(transformer);
    
	BrowserOpen browser = new BrowserOpen();
	browser.open("result.html");
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }
}
