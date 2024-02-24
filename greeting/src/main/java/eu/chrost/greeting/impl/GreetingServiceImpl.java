package eu.chrost.greeting.impl;

import eu.chrost.greeting.GreetingService;
import eu.chrost.upper.UpperCaseService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello " + name + "!";
    }

    @Override
    public String greetUpperCase(String name) {
        return greet(UpperCaseService.toUpperCase(name));
    }
}
