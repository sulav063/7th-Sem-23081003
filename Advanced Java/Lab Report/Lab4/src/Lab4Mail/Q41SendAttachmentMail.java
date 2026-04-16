package Lab4Mail;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.activation.*;
import java.util.Properties;

public class Q41SendAttachmentMail {

    public static void main(String[] args) {

        String from = "sulavadh124@gmail.com";
        String password = "rezsdesmcobemzun";
        String to = "cadet4481@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            message.setSubject("Mail with Attachment");

            // Text part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This mail contains attachment.");

            // Attachment part
            MimeBodyPart attachmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource("C:\\Users\\Acer\\Downloads\\Lab1.txt");
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName("file.txt");

            // Combine
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail with attachment sent!");
            System.out.println("Lab4, Sulav Adhikari, 23081003");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}