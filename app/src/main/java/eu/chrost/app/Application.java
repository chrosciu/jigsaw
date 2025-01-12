package eu.chrost.app;

import eu.chrost.greeting.GreetingService;

import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) throws Exception {
        ServiceLoader<GreetingService> greetingServiceLoader = ServiceLoader.load(GreetingService.class);
        GreetingService greetingService = greetingServiceLoader.findFirst()
                .orElseThrow(() -> new RuntimeException("GreetingService not found"));
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
    }
}
