package corba;

import HelloApp.*;

public class HelloImpl extends HelloPOA {

    public String sayHello() {
        return "Hello from CORBA Server!";
    }
}