package is.ru.honn.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public abstract class AbstractFactory
{
    private Properties properties = new Properties();
    private Logger logger =
            Logger.getLogger(AbstractFactory.class.getName());

    protected Properties loadProperties(String filename) throws FactoryException
    {
        try
        {
            properties.load(new FileInputStream(new File(filename)));
        }
        catch (FileNotFoundException fnfex)
        {
            String msg = "Factory: File '" + filename + "' not found.";
            logger.severe(msg);
            throw new FactoryException(msg, fnfex);
        }
        catch (IOException ioex)
        {
            String msg = "Factory: Unable to read file '" + filename + "'.";
            logger.severe(msg);
            throw new FactoryException(msg, ioex);
        }
        return properties;
    }

    public Properties getProperties()
    {
        return properties;
    }

    protected Object loadClass(String name) throws FactoryException
    {
        Class instanceClass;
        try
        {
            instanceClass = Class.forName(name);
            return instanceClass.newInstance();
        }
        catch (ClassNotFoundException cnfex)
        {
            String msg = "Factory: Class '" + name + "' not found.";
            logger.severe(msg);
            throw new FactoryException(msg, cnfex);
        }
        catch (InstantiationException iex)
        {
            String msg = "Factory: Instancing class '" + name + "' failed.";
            logger.severe(msg);
            throw new FactoryException(msg, iex);
        }
        catch (IllegalAccessException iaex)
        {
            String msg = "Factory: Illegal access instanciating class '" +
                    name + "'.";
            logger.severe(msg);
            throw new FactoryException(msg, iaex);
        }
    }
}
