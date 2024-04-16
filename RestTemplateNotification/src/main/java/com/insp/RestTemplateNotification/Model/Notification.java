package com.insp.RestTemplateNotification.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("restTemplateNotification")
public class Notification {
    private int nid;
    private Student payLoad;
    private LocalDate date;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public Student getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Student payLoad) {
        this.payLoad = payLoad;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
