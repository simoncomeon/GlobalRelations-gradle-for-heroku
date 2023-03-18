package com.example.GlobalRelations.services;


import com.example.GlobalRelations.web.model.EmailDetails;
import com.example.GlobalRelations.web.model.Subscriber;

public interface EmailService {
    String sendSimpleEmail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);

    String saveSubscriber(Subscriber subscriber);

}
