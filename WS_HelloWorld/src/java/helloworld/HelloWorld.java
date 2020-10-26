/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author pc
 */
@WebService
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
  @WebMethod
    public static String Sayhello(String nom)
    {
    return("Hello "+nom);
            }
    @WebMethod
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "INSAT "; 
      String hello="";
      hello=Sayhello(nom);
      System.out.println("Greating"+hello);
        
    }
    
}
