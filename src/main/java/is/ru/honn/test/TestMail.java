package is.ru.honn.test;

import is.ru.honn.mail.SMTPMailService;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class TestMail {
    public static void main(String args[]) {
        SMTPMailService service = new SMTPMailService();
        /*service.send("kristinnf13@ru.is", "rugludallur@gmail.com", "SMTPMailService Test",
                "This is just to test if I can send or use the given code in HONN2016-Lab04a");*/
        service.send("krihfre@simnet.is", "rugludallur@gmail.com", "SMTPMailService Test",
                "This is just to test if I can send or use the given code in HONN2016-Lab04a");
    }
}
