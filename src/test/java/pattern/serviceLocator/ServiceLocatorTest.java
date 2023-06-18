package pattern.serviceLocator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceLocatorTest {
    @Test
    void serviceLocator(){
        MessagingService service = ServiceLocator.getService("EmailService");
        String email = service.getMessageBody();
        MessagingService smsService = ServiceLocator.getService("SMSService");
        String sms = service.getMessageBody();
        MessagingService emailService = ServiceLocator.getService("EmailService");
        String newEmail = service.getMessageBody();

    }

}