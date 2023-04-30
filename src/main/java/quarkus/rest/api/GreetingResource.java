package quarkus.rest.api;

import quarkus.rest.api.jpa.dto.User;
import quarkus.rest.api.service.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String hello(@PathParam("name") String name) {
        return greetingService.greeting(name);
    }

    @GET
    @Path("/user/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public User user(String name) {
        return greetingService.user(name);
    }
}