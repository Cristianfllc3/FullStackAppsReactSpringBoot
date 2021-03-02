package com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class demoLoader implements CommandLineRunner {

    private final contactRepository repository;

    @Autowired
    public demoLoader(contactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new contact("Cristian", "Fernandez", "me@me.ca"));
    }
}