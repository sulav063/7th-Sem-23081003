package corba;

import HelloApp.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class Server {

    public static void main(String[] args) {

        try {
            ORB orb = ORB.init(args, null);

            POA rootpoa = POAHelper.narrow(
                orb.resolve_initial_references("RootPOA")
            );

            rootpoa.the_POAManager().activate();

            HelloImpl obj = new HelloImpl();

            System.out.println("CORBA Server Started ✔");

            orb.run();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}