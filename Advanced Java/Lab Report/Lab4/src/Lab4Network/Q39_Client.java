package Lab4Network;

// Name: YOUR NAME
// Roll No: YOUR ROLL NO
// Lab: Lab4

import java.io.*;
import java.net.*;

public class Q39_Client {
    public static void main(String[] args) {

        System.out.println("Lab3, Sulav Adhikari, 23081003");

        try {
            Socket s = new Socket("localhost",5000);

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            out.println("Hello Server");

            System.out.println("Server: " + br.readLine());

            s.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}