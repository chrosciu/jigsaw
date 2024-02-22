package eu.chrost.app;

import eu.chrost.greeting.GreetingService;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) throws Exception {
        ServiceLoader<GreetingService> greetingServices = ServiceLoader.load(GreetingService.class);
        GreetingService greetingService = greetingServices.findFirst()
                .orElseThrow(() -> new RuntimeException("No GreetingService implementation found"));
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
        System.out.println("Camel greeting for input " + input + " is " + greetingService.greetAsCamel(input));
    }
}
