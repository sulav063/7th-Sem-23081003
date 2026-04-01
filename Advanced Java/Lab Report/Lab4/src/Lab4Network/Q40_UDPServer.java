package Lab4Network;

// Name: YOUR NAME
// Roll No: YOUR ROLL NO
// Lab: Lab4

import java.net.*;

public class Q40_UDPServer {
    public static void main(String[] args) {

        System.out.println("Lab3, Sulav Adhikari, 23081003");

        try {
            DatagramSocket ds = new DatagramSocket(5000);

            byte[] receive = new byte[1024];

            DatagramPacket dp = new DatagramPacket(receive, receive.length);

            ds.receive(dp);

            String msg = new String(dp.getData(), 0, dp.getLength());

            System.out.println("Client: " + msg);

            ds.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}