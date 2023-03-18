package com.example.GlobalRelations.web.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private String recipient;

    private String senderFirstName;

    private String senderSecondName;
    private String senderMail;
    private String msgBody;
    private String subject;
    private String attachment;

}
