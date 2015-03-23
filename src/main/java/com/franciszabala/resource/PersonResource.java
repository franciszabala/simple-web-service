package com.franciszabala.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.franciszabala.model.Person;


@Path("person")
public class PersonResource {
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Person getPerson() {
		 	Person person = new Person(0L, "Amber", "Solus");
	        return person;
	    }
	 
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces("application/json") 
	 public Response savePerson(Person person) {
		 Person tempPerson = person;
		 return Response.status(200).entity(tempPerson).build();
	 }
}
