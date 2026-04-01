package Lab4Network;

// Name: YOUR NAME
// Roll No: YOUR ROLL NO
// Lab: Lab4

import java.io.*;
import java.net.*;

public class Q39_Server {
    public static void main(String[] args) {

        System.out.println("Lab3, Sulav Adhikari, 23081003");

        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server waiting...");

            Socket s = ss.accept();

            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String msg = br.readLine();
            System.out.println("Client: " + msg);

            out.println("Hello Client");

            s.close();
            ss.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}