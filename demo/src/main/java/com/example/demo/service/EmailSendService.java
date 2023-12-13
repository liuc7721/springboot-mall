package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {

    @Autowired
    JavaMailSender mailSender;

    public void sendEmail(String toEmail,
                          String subject,
                          String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("liuc7721@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
                            
        System.out.println("Mail sent successfully....");
    }
}
