package Lab4Network;

// Name: YOUR NAME
// Roll No: YOUR ROLL NO
// Lab: Lab4

import java.net.*;

public class Q40_UDPClient {
    public static void main(String[] args) {

        System.out.println("Lab3, Sulav Adhikari, 23081003");

        try {
            DatagramSocket ds = new DatagramSocket();

            String msg = "Hello Server";

            byte[] send = msg.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket dp = new DatagramPacket(
                send, send.length, ip, 5000);

            ds.send(dp);

            ds.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}