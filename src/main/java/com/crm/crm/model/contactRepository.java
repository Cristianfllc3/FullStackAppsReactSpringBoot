package com.crm.crm.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface contactRepository extends CrudRepository<contact, Long>{

    //This class made the conection with the DB and the jpa model "contact"
}