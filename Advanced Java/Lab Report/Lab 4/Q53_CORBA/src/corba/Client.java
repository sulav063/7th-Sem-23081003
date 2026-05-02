package corba;

import HelloApp.*;
import org.omg.CORBA.*;

public class Client {

    public static void main(String[] args) {

        try {
            ORB orb = ORB.init(args, null);

            // NOTE: Simplified (real uses Naming Service)
            System.out.println("CORBA Client Ready ✔");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}