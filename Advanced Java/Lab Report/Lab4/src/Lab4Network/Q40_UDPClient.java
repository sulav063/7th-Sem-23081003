package Lab4Network;

import java.net.*;

public class Q40_UDPClient {
    public static void main(String[] args) {

        System.out.println("Lab4, Sulav Adhikari, 23081003");

        try {
            DatagramSocket ds = new DatagramSocket();

            String msg = "Hello Server";
            byte[] send = msg.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            // Send to server (port 5001)
            DatagramPacket dp = new DatagramPacket(send, send.length, ip, 5002);
            ds.send(dp);

            // Receive reply from server
            byte[] receive = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(receive, receive.length);

            ds.receive(dp2);

            String serverMsg = new String(dp2.getData(), 0, dp2.getLength());
            System.out.println("Server: " + serverMsg);

            ds.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}