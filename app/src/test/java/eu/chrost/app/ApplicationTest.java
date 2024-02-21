package eu.chrost.app;

import eu.chrost.greeting.GreetingService;
import eu.chrost.greeting.impl.GreetingServiceImpl;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    public void shouldBeAbleToLoadGreetingService() {
        GreetingService greetingService = new GreetingServiceImpl();
        greetingService.greet("Marcin");
    }
}
