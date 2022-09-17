package org.ssremex;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteObjectImpl extends Remote {
    // say_hello 是客户端需要调用的方法，需要抛出异常
    public String say_hello(String str) throws RemoteException;
}
