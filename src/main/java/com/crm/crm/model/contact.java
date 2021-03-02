package com.crm.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
//import lombox.*;

@Data
@Entity

public class contact {
    public @Id @GeneratedValue Long id;
    public String firstName;
    public String lastName;
    public String email;

    public contact() {}

    public contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}