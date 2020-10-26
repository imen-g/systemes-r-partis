/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import helloworld.HelloWorldInt;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author pc
 */
public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorldInt{
    private final String hello;
    public HelloWorldImpl(String s) throws RemoteException
    {
        
        super();
        hello=s;
    }
    public String sayHello() throws RemoteException {
       return "Hello World";
    }
    
    public static void main(String args[]){
    
        try{
       HelloWorldImpl obj=new HelloWorldImpl("HelloServer");
            String HelloServer = null;
       Naming.rebind("rmi://localhost:1099/HelloServer", obj);
        }catch(MalformedURLException | RemoteException e){}
    }
    }
