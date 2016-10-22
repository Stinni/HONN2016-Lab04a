package is.ru.honn.mail;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class MailServiceStub implements MailService
{
    public void send(String from, String to, String subject, String body)
    {
        System.out.println("Mail from: " + from +
                "to: " + to +
                " Subject: " + subject);
        System.out.println(body);
    }

    public static void main(String args[]) {
        MailServiceStub service = new MailServiceStub();
        service.send("kristinnf13@ru.is", "rugludallur@gmail.com", "SMTPMailService Test",
                "This is just to test if I can send or use the given code in HONN2016-Lab04a");
    }
}
