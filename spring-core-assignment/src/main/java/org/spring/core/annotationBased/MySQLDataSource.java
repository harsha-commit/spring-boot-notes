package org.spring.core.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String[] emails = new String[]{"Loree.Ralfston@yopmail.com",
                "Netty.Miru@yopmail.com",
                "Madelle.Durware@yopmail.com",
                "Agnese.Toffic@yopmail.com",
                "Leontine.Ailyn@yopmail.com"};
        return emails;
    }
}
