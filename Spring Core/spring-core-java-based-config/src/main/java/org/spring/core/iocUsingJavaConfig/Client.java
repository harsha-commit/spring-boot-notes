package org.spring.core.iocUsingJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        // Create IOC Container
        // Read Configuration file
        // Create and Manage Spring Beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Car car = applicationContext.getBean(Car.class);
        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();
    }
}
