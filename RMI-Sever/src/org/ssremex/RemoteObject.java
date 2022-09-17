package org.ssremex;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class RemoteObject extends UnicastRemoteObject implements RemoteObjectImpl {

    public RemoteObject() throws RemoteException{

    }

    @Override
    public String say_hello(String str) throws RemoteException {
        String upKeywords = "hello " + str.toUpperCase();
        System.out.println(upKeywords);
        return upKeywords;
    }
}
