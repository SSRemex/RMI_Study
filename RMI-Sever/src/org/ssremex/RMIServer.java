package org.ssremex;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        RemoteObject remoteObject = new RemoteObject();
        // 创建注册中心 固定端口
        Registry r = LocateRegistry.createRegistry(1099);
        r.bind("remoteObject", remoteObject);
    }

}
