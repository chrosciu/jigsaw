package eu.chrost.app;

import eu.chrost.greeting.GreetingService;
import eu.chrost.greeting.impl.GreetingServiceImpl;

public class Application {
    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingServiceImpl();
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
    }
}
