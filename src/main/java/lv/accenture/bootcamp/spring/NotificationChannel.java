package lv.accenture.bootcamp.spring;

import org.springframework.stereotype.Component;

@Component
public interface NotificationChannel {

    public void notifyUser(User user);
}
