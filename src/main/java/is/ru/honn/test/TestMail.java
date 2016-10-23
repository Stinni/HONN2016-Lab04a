package is.ru.honn.test;

import is.ru.honn.mail.MailFactory;
import is.ru.honn.mail.MailMessage;
import is.ru.honn.mail.MailService;
import is.ru.honn.mail.MailServiceException;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class TestMail {
    public static void main(String args[]) {
        MailFactory factory = new MailFactory();
        MailService service = factory.getMailService();
        MailMessage msg = new MailMessage("krihfre@simnet.is", "rugludallur@gmail.com", "SMTPMailService Test",
                "This is just to test if I can send or use the given code in HONN2016-Lab04a");

        try {
            service.send(msg);
        }
        catch(MailServiceException e)
        {
            System.out.println("A MailServiceException was thrown!");
        }
    }
}
