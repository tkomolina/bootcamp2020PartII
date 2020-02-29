package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailSpam")
public class EmailSpam implements NotificationChannel{

    @Value("${notification.email.from}")
    private String emailSender;


    @Override
    public void notifyUser(User user) {

        System.out.println(user.getFullname() + " is notified by email on email address " + user.getEmail() + " from email address " + emailSender);

    }
}
