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
public class PoidsIdeal {
     @WebMethod
    public static double PoidsIdeal_DFormule (double taille) {
    boolean EstFemme;
    EstFemme = false;
     
        if(EstFemme)
        { return(45.5+2.3*(taille-60));}
        if(!EstFemme)
        { return(50+2.3*(taille-60));}
        return 0;
    
      
    }
     @WebMethod
     public static double PoidsIdeal_MFormule (double taille) {
    boolean EstFemme;
    EstFemme = false;
    
        if(EstFemme)
        { return(45.5+2.3*(taille-60));}
        if(!EstFemme)
        { return(53.1+1.36*(taille-60));}
        return 0;
    
      
    }
  @WebMethod
    public static void main(String[] args) {
    double taille;
    taille=150;
    double poids=0;
     double taille1;
     taille1=180;
    double poids1=0;
    poids=PoidsIdeal_DFormule(taille);
    poids1=PoidsIdeal_MFormule(taille1); 
    System.out.println(poids);
     System.out.println(poids1);
    }
}
