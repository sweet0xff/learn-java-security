package com.sweet.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author sweet
 * @description
 * @date 2021/2/20 11:19
 */
public interface IRemoteHelloWorld extends Remote {
    String hello() throws RemoteException;
}
