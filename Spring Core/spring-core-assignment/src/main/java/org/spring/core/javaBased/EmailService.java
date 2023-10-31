package org.spring.core.javaBased;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailService {

    DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void sendEmail(){
        String[] emails = dataSource.getEmails();
        for(String email: emails){
            System.out.println("Email Sent to: " + email);
        }
    }

}
