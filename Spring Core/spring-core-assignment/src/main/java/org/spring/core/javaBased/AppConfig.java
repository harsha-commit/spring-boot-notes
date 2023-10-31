package org.spring.core.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DataSource mySQLDataSource(){
        return new MySQLDataSource();
    }
    @Bean
    public DataSource postgresSQLDataSource(){
        return new PostgresSQLDataSource();
    }
    @Bean
    public EmailService emailService(){
        return new EmailService(postgresSQLDataSource());
    }
}
