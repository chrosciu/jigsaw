package eu.chrost.app;

import eu.chrost.greeting.GreetingService;

public class Application {
    public static void main(String[] args) throws Exception {
        GreetingService greetingService = GreetingService.getInstance();
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
        System.out.println("Greeting for input (upper case) " + input + " is " + greetingService.greetUpperCase(input));
    }
}
