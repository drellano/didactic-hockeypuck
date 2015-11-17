/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtoxslt;
// jdk1.4.1
import javax.xml.transform.*;
import java.net.*;
import java.io.*;
​
public class HowToXSLT {
public static void main(String[] args) {
  try {
​
    TransformerFactory tFactory = TransformerFactory.newInstance();
​
    Transformer transformer =
      tFactory.newTransformer
         (new javax.xml.transform.stream.StreamSource
            ("/Users/carter/NetBeansProjects/HowToXSLT/src/howtoxslt/howto.xsl"));
​
    transformer.transform
      (new javax.xml.transform.stream.StreamSource
            ("/Users/carter/NetBeansProjects/HowToXSLT/src/howtoxslt/howto.xml"),
       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("howto.html")));
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }
}
