package org.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    // Field Injection
    @Autowired
    @Qualifier("emailService")
    MessageService emailService;

    @Autowired
    MessageService smsService;

    // Constructor Based DI
//    @Autowired
//    MessageSender(@Qualifier("emailService") MessageService emailService, MessageService smsService){
//        System.out.println("Constructor based Dependency Injection");
//        this.emailService = emailService;
//        this.smsService = smsService;
//    }

    // Setter Based DI
//    @Autowired
//    public void setMessageService(@Qualifier("smsService") MessageService emailService, MessageService smsService) {
//        System.out.println("Setter based Dependency Injection");
//        this.emailService = emailService;
//        this.smsService = smsService;
//    }

    public void sendMessage(String message){
        this.emailService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
