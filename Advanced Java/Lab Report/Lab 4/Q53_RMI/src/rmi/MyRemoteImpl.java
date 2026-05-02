package rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from RMI Server Lab4, Sulav Adhikari, 23081003" ;
    }
}