package eu.chrost.greeting.impl;

import eu.chrost.greeting.GreetingService;
import org.apache.commons.lang3.StringUtils;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello " + StringUtils.capitalize(name) + "!";
    }
}
