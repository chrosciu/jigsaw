package eu.chrost.app;

import eu.chrost.greeting.GreetingService;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class ApplicationTest {
    @Test
    public void shouldBeAbleToLoadGreetingService() {
        ServiceLoader<GreetingService> greetingServices = ServiceLoader.load(GreetingService.class);
        GreetingService greetingService = greetingServices.findFirst()
                .orElseThrow(() -> new RuntimeException("No GreetingService implementation found"));
        greetingService.greet("Marcin");
    }
}
