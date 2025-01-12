package eu.chrost.app;

import eu.chrost.greeting.GreetingService;

import java.util.Optional;
import java.util.ServiceLoader;

public class Application {
    public static void main(String[] args) {
        ServiceLoader<GreetingService> greetingServiceLoader = ServiceLoader.load(GreetingService.class);
        Optional<GreetingService> maybeGreetingService = greetingServiceLoader.findFirst();
        maybeGreetingService.ifPresentOrElse(greetingService -> {
            String input = "marcin";
            System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
        }, () -> System.out.println("Greeting service not found!"));
    }
}
