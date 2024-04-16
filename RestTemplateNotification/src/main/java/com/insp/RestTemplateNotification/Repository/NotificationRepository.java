package com.insp.RestTemplateNotification.Repository;

import com.insp.RestTemplateNotification.Model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification,Integer> {

}
