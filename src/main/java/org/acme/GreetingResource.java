package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {
    // Gretting API

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    // hi
    @GET
    @Path("/greets")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetAPI() {
        return "Hello from Quarkus REST";
    }

}
