package com.example.GlobalRelations.web.controller;


import com.example.GlobalRelations.services.EmailService;
import com.example.GlobalRelations.web.model.EmailDetails;
import com.example.GlobalRelations.web.model.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/sendMail")
    public String
    sendMail(EmailDetails details)
    {
        details.setRecipient("simoncomeone@gmail.com");
        details.setSubject("Meddelande genom nya Global Relations Hemsida");
        System.out.println("-----Email details:  -> " + details);
        String status = emailService.sendSimpleEmail(details);

        return status;
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
            @RequestBody EmailDetails details)
    {
        String status
                = emailService.sendMailWithAttachment(details);

        return status;
    }


    @PostMapping("/subscribe")
    public String subscribe(@RequestBody String details)
    {
        System.out.println("Hello there:   -> " + details);
        Subscriber sub = new Subscriber();
        sub.setEmail(details);
        String status
                = emailService.saveSubscriber(sub);

        return status;
    }


}
