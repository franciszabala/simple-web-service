package com.franciszabala.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.franciszabala.model.Person;


@Path("person")
public class PersonResource {
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Person getPerson() {
		 	Person person = new Person(0L, "Amber", "Solus");
	        return person;
	    }
}
