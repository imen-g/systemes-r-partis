/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloClient;

/**
 *
 * @author pc
 */
public class TestClient {
      public static String Responsehello(String nom)
    {
    return("Thanks "+nom);
            }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "INSAT "; 
      String hello="";
      hello=Responsehello( nom);
      System.out.println("Greating"+hello);
        
    
}}
