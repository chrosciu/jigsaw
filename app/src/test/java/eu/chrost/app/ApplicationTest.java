package eu.chrost.app;

import eu.chrost.greeting.GreetingService;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

public class ApplicationTest {
    @Test
    public void shouldBeAbleToLoadGreetingService() {
        ServiceLoader<GreetingService> greetingServiceLoader = ServiceLoader.load(GreetingService.class);
        GreetingService greetingService = greetingServiceLoader.findFirst()
                .orElseThrow(() -> new RuntimeException("GreetingService not found"));
        greetingService.greet("Marcin");
    }
}
