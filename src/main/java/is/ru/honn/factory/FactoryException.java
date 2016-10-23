package is.ru.honn.factory;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public class FactoryException extends Exception
{
    public FactoryException(String message)
    {
        super(message);
    }

    public FactoryException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
