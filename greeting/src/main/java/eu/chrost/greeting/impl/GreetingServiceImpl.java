package eu.chrost.greeting.impl;

import eu.chrost.greeting.GreetingService;
import eu.chrost.upper.UpperCaseService;
import org.apache.commons.lang3.ObjectUtils;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        if (!ObjectUtils.isEmpty(name)) {
            return "Hello " + name + "!";
        }
        throw new IllegalStateException("Empty name passed as argument!");
    }

    @Override
    public String greetUpperCase(String name) {
        return greet(UpperCaseService.toUpperCase(name));
    }
}
