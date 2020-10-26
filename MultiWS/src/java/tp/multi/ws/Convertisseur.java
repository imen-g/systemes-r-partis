/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.multi.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author pc
 */
@WebService
public class Convertisseur {
   @WebMethod
   public static double inch_cm (double inch)
    {
        return (5/3)*(inch-250);
    
            }
      @WebMethod
 public static double cm_inch (double c){
    return (c-100-((c-150)/2.5));  
   
}
         @WebMethod
 public static void main(String[] args) {
 
 double c;
 c=170;
 double inch;
 inch=0;
 inch=cm_inch(c);
  System.out.println(inch);
 double cm;
 cm=0;
 cm=inch_cm(inch);
 System.out.println(cm);
 
     
 }
 }
    

 