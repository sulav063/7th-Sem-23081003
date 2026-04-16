package Lab4Network;

import java.io.*;
import java.net.*;

public class Q39_Server {
    public static void main(String[] args) {

        System.out.println("Lab4, Sulav Adhikari, 23081003");

        try {
            ServerSocket ss = new ServerSocket(5002);
            System.out.println("Server waiting...");

            Socket s = ss.accept();

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String msg;

            while (true) {
                msg = br.readLine();
                System.out.println("Client: " + msg);

                if (msg.equalsIgnoreCase("exit")) break;

                System.out.print("You: ");
                String reply = userInput.readLine();
                out.println(reply);
            }

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}