package is.ru.honn.mail;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public interface MailService
{
    public void setMailServer(String mailServer);
    void send(MailMessage message);
}
