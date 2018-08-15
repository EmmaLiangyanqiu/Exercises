
package webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServer", targetNamespace = "http://webservice.java.main/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getString", targetNamespace = "http://webservice.java.main/", className = "webservice.client.GetString")
    @ResponseWrapper(localName = "getStringResponse", targetNamespace = "http://webservice.java.main/", className = "webservice.client.GetStringResponse")
    @Action(input = "http://webservice.java.main/WebServer/getStringRequest", output = "http://webservice.java.main/WebServer/getStringResponse")
    public String getString();

}