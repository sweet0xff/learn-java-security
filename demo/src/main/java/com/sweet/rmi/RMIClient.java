package com.sweet.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author sweet
 * @description
 * @date 2021/2/20 11:32
 */
public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IRemoteHelloWorld hello = (IRemoteHelloWorld) Naming.lookup("rmi://127.0.0.1:1099/Hello");
        String ret = hello.hello();
        System.out.println(ret);
    }
}
