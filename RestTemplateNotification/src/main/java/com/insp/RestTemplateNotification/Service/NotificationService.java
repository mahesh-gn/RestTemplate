package com.insp.RestTemplateNotification.Service;

import com.insp.RestTemplateNotification.Model.Notification;
import com.insp.RestTemplateNotification.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public List<Notification> getAll(){
        return notificationRepository.findAll();
    }

    public Notification save(Notification notification){
        return notificationRepository.save(notification);
    }
}
