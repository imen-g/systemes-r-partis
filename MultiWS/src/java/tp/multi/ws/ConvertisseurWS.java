/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.multi.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
 

/**
 *
 * @author pc
 */
@WebService(serviceName = "ConvertisseurWS")
 
public class ConvertisseurWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
  
    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "c") double c, @WebParam(name = "in") String in, @WebParam(name = "parameter1") String parameter1) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation_1")
    @RequestWrapper(className = "tp.operation_1")
    @ResponseWrapper(className = "tp.operation_1Response")
    public String operation(@WebParam(name = "inch") double inch, @WebParam(name = "cm") double cm, @WebParam(name = "parameter1") String parameter1) {
        //TODO write your implementation code here:
        return null;
    }
}
