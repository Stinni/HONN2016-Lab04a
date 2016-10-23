package is.ru.honn.mail;

import java.util.logging.Logger;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class MailServiceStub extends AbstractMailService
{
    private Logger logger = Logger.getLogger(MailServiceStub.class.getName());

    public void send(MailMessage message)
    {
        logger.info("Mail Server: " + this.getMailServer());
        logger.info("Sending mail from '" + message.getFrom() + "' to '" + message.getTo() + "'\n" +
                "with subject: '" + message.getSubject() + "' and body: \n" + message.getBody());
        /*System.out.println("Mail from: " + message.getFrom());
        System.out.println("To: " + message.getTo());
        System.out.println("Subject: " + message.getSubject());
        System.out.println("Body: " + message.getBody());*/
    }
}
