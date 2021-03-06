package com.lida.dream_webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-18T12:07:59.824+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://server.dream_webservice.lida.com/", name = "MyWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface MyWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://server.dream_webservice.lida.com/", className = "com.lida.dream_webservice.server.Add")
    @WebMethod
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://server.dream_webservice.lida.com/", className = "com.lida.dream_webservice.server.AddResponse")
    public int add(
        @WebParam(name = "firstA", targetNamespace = "")
        int firstA,
        @WebParam(name = "firstB", targetNamespace = "")
        int firstB
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://server.dream_webservice.lida.com/", className = "com.lida.dream_webservice.server.Minus")
    @WebMethod
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://server.dream_webservice.lida.com/", className = "com.lida.dream_webservice.server.MinusResponse")
    public int minus(
        @WebParam(name = "secondA", targetNamespace = "")
        int secondA,
        @WebParam(name = "secondB", targetNamespace = "")
        int secondB
    );
}
