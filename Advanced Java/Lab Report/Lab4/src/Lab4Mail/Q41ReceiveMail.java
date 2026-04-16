 package Lab4Mail;

import jakarta.mail.*;
import java.util.Properties;

public class Q41ReceiveMail {

    public static void main(String[] args) {

        String host = "imap.gmail.com";
        String user = "sulavadh124@gmail.com";
        String password = "rezsdesmcobemzun"; // App Password

        try {
            // Properties
            Properties props = new Properties();
            props.put("mail.store.protocol", "imaps");

            // Session
            Session session = Session.getDefaultInstance(props);

            // Connect to mail server
            Store store = session.getStore("imaps");
            store.connect(host, user, password);

            // Open inbox
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Get total messages
            int total = inbox.getMessageCount();
            System.out.println("Total Messages: " + total);

            // Get last 5 messages only
            int start = Math.max(1, total - 4);
            Message[] messages = inbox.getMessages(start, total);

            // Display messages
            for (int i = 0; i < messages.length; i++) {
                System.out.println("Email " + (start + i));
                System.out.println("Subject: " + messages[i].getSubject());
                System.out.println("----------------------------");
            }

            // Close connections
            inbox.close(false);
            store.close();

            // Final line (as required)
            System.out.println("Lab4, Sulav Adhikari, 23081003");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}