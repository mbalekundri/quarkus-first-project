package quarkus.rest.api.service;

import quarkus.rest.api.jpa.dto.User;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        String val = "hello " + name;
        System.out.println("val --> "+val);
        return val;
    }

    public User user(String name) {
        return new User(name,"Balekundri","rbalekundri","secret_Pwd");
    }
}
