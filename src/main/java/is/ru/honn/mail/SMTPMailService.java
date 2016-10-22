package is.ru.honn.mail;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message;
import java.util.Date;
import java.util.Properties;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class SMTPMailService implements MailService
{
    public void send(String from, String to, String subject, String body)
    {
        //String smtpServer = "smtp.ru.is";
        String smtpServer = "postur.simnet.is";
        try
        {
            Properties props = System.getProperties();
            props.put("mail.smtp.host", smtpServer);
            Session session = Session.getDefaultInstance(props, null);
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to, false));
            msg.setSubject(subject);
            msg.setText(body);
            msg.setSentDate(new Date());
            Transport.send(msg);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

