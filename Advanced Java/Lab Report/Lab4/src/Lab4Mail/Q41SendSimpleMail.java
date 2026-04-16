package Lab4Mail;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class Q41SendSimpleMail {

    public static void main(String[] args) {

        String from = "sulavadh124@gmail.com"; 
        String password = "rezsdesmcobemzun";
        String to = "cadet4481@gmail.com";

        // SMTP configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
 
        // Session
        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        try {
            // Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject("Simple Mail");
            message.setText("Hello, this is a simple email from Java!");

            // Send
            Transport.send(message);

            System.out.println("Email Sent Successfully!");
                    System.out.println("Lab4, Sulav Adhikari, 23081003");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}