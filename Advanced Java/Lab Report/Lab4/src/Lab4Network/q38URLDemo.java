package Lab4Network;


import java.net.*;
import java.io.*;

public class q38URLDemo{

    public static void main(String[] args) {
        System.out.println("Lab4, Sulav Adhikari, 23081003");
        try {

            // -------------------------
            // (a) URL Creation & Parsing
            // -------------------------
            System.out.println("\n--- URL Creation & Parsing ---");

            URL url = new URL("https://www.google.com");

            System.out.println("URL: " + url);
            System.out.println("Host: " + url.getHost());
            System.out.println("Protocol: " + url.getProtocol());


            // -------------------------
            // (b) Reading from URL
            // -------------------------
            System.out.println("\n--- Reading Directly from URL ---");

            BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream()));

            String line;
            int count = 0;

            while((line = br.readLine()) != null && count < 5){
                System.out.println(line);
                count++; // limit output (for simple view)
            }

            br.close();


            // -------------------------
            // (c) URLConnection
            // -------------------------
            System.out.println("\n--- URLConnection ---");

            URLConnection conn = url.openConnection();

            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());


            // -------------------------
            // (d) InetAddress
            // -------------------------
            System.out.println("\n--- InetAddress ---");

            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        } catch(Exception e){
            System.out.println(e);
            
        }
    }
}