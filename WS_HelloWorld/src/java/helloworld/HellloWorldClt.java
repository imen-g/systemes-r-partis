/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import helloworld.Hello;
import java.rmi.Naming;

/**
 *
 * @author pc
 */
public class HellloWorldClt {
    public static void main(String args[]){
    try{
    Hello obj=(Hello) Naming.lookup("rmi://localhost:1099/HelloServer");
    String message=obj.sayHello();
    System.out.println(message);
    
    } catch(Exception e ){
    }
    
    }
    
}
