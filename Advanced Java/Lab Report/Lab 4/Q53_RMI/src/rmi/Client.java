package rmi;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {

        try {
            MyRemote obj =
                (MyRemote) Naming.lookup("rmi://localhost/hello");

            System.out.println("Response: " + obj.sayHello());

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}