package is.ru.honn.mail;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public abstract class AbstractMailService implements MailService
{
    protected String mailServer;
    // this is used by the factory to inject

    public abstract void send(MailMessage msg);

    public void setMailServer(String mailServer)
    {
        this.mailServer = mailServer;
    }

    public String getMailServer()
    {
        return mailServer;
    }
}
