package is.ru.honn.mail;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public class MailServiceException extends RuntimeException
{
    public MailServiceException(String message)
    {
        super(message);
    }

    public MailServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
