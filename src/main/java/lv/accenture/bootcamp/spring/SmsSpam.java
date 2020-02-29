package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("smsSpam")
public class SmsSpam implements NotificationChannel{

    @Value("${notification.sms.operator}") //${..} saucas par Placeholder . Atslegas raksta application.properties faila.
    private String operator;


    @Override
    public void notifyUser(User user) {
        System.out.println(user.getFullname() + " is notified by sms by operator " + operator+ " on phone number " + user.getNumber());

    }
}
