package com.crm.crm.model;

import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Validated;
//import javax.validation.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
class ContactsController {    
    private contactRepository contactRepository;

    public ContactsController(contactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/contacts")
    Collection<contact> contacts() {
        return (Collection<contact>) contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<contact> createContact(@Validated @RequestBody contact contact) throws URISyntaxException {
        contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }
}