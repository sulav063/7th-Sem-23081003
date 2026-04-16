package Lab4Network;

import java.net.*;

public class Q40_UDPServer {
    public static void main(String[] args) {

        System.out.println("Lab4, Sulav Adhikari, 23081003");

        try {
            DatagramSocket ds = new DatagramSocket(5002);

            byte[] receive = new byte[1024];

            DatagramPacket dp = new DatagramPacket(receive, receive.length);

            // Receive message from client
            ds.receive(dp);

            String msg = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Client: " + msg);

            // Send reply back to client
            String reply = "Hello Client";
            byte[] send = reply.getBytes();

            InetAddress clientIP = dp.getAddress();
            int clientPort = dp.getPort();

            DatagramPacket dp2 = new DatagramPacket(
                send, send.length, clientIP, clientPort);

            ds.send(dp2);

            ds.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}