package eu.chrost.app;

import eu.chrost.greeting.GreetingService;

public class Application {
    public static void main(String[] args) {
        GreetingService greetingService = GreetingService.getInstance();
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
    }
}
