package eu.chrost.greeting.impl;


import eu.chrost.greeting.GreetingService;
import eu.chrost.uppercase.UpperCaseService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        UpperCaseService upperCaseService = UpperCaseService.getInstance();
        return "Hello " + upperCaseService.toUpperCase(name) + "!";
    }
}
