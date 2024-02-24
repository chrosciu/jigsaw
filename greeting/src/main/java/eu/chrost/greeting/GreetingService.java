package eu.chrost.greeting;

import eu.chrost.greeting.impl.GreetingServiceImpl;

public interface GreetingService {
    String greet(String name);

    String greetUpperCase(String name);

    static GreetingService getInstance() {
        return new GreetingServiceImpl();
    }
}
