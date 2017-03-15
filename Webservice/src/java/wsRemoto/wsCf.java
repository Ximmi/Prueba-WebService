/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsRemoto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author CECyT9
 */
@WebService(serviceName = "wsCf")
public class wsCf {

    /**
     * This is a sample web service operation
     */
    //publico para que se pueda acceder
    @WebMethod(operationName="cletoFar")
 public String celtoFar(@WebParam(name="cel") double cel){
     String res="";
     res=(32+(1.8*cel)) + "";
     return res;
 }
 
 @WebMethod(operationName="cletoFar")
 public String fartoCel(@WebParam(name="far") double far){
     String res="";
     res=((far-32)/1.8) + "";
     return res;
 }
}