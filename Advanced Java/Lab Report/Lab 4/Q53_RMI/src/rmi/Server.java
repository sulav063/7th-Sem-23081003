package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {

        try {
            // ⭐ Start registry
            LocateRegistry.createRegistry(1098);

            // ⭐ Create object
            MyRemoteImpl obj = new MyRemoteImpl();

            // ⭐ Bind object to registry
            Naming.rebind("rmi://localhost/hello", obj);

            System.out.println("RMI Server Started ✔");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}