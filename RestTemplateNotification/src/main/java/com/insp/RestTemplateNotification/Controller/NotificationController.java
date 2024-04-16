package com.insp.RestTemplateNotification.Controller;

import com.insp.RestTemplateNotification.Model.Notification;
import com.insp.RestTemplateNotification.Model.Student;
import com.insp.RestTemplateNotification.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;
@RestController
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/sendNotification")
    public Notification save(@RequestBody Student student){
        Notification notification=new Notification();
        notification.setNid(student.getSid());
        notification.setPayLoad(student);
        notification.setDate(LocalDate.now());
        return notificationService.save(notification);
    }

    @GetMapping("/getAll")
    public List<Notification> getAll(){
        return notificationService.getAll();
    }
}
