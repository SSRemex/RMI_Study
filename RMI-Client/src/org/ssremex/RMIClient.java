package org.ssremex;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        // 接口包名需与服务端接口包名一致
        RemoteObjectImpl remoteObject = (RemoteObjectImpl) registry.lookup("remoteObject");
        String str = remoteObject.say_hello("ssremex");

        System.out.println(str);

    }
}
