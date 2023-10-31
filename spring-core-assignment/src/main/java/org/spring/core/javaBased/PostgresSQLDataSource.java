package org.spring.core.javaBased;

public class PostgresSQLDataSource implements DataSource {
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
