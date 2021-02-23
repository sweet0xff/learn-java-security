package com.sweet.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author sweet
 * @description
 * @date 2021/2/20 11:20
 */
public class RemoteHelloWorld extends UnicastRemoteObject implements IRemoteHelloWorld {
    protected RemoteHelloWorld() throws RemoteException {
        super();
    }

    @Override
    public String hello() {
        System.out.println("call from");
        return "Hello world";
    }

    private void start() throws Exception {
        RemoteHelloWorld h = new RemoteHelloWorld();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://127.0.0.1:1099/Hello", h);
    }

    public static void main(String[] args) throws Exception {
        new RemoteHelloWorld().start();
    }
}
