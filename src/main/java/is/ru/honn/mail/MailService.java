package is.ru.honn.mail;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public interface MailService
{
    void send(String from, String to, String subject, String body);
}
