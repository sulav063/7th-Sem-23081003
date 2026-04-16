 package Lab4Network;

import java.io.*;
import java.net.*;

public class Q39_Client {
    public static void main(String[] args) {

        System.out.println("Lab4, Sulav Adhikari, 23081003");

        try {
            Socket s = new Socket("localhost", 5001);

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String msg;

            while (true) {
                System.out.print("You: ");
                msg = userInput.readLine();
                out.println(msg);

                if (msg.equalsIgnoreCase("exit")) break;

                String serverMsg = br.readLine();
                System.out.println("Server: " + serverMsg);
            }

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}