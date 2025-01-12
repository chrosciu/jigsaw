package eu.chrost.app;

import eu.chrost.greeting.GreetingService;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    public void shouldBeAbleToLoadGreetingService() {
        GreetingService greetingService = GreetingService.getInstance();
        greetingService.greet("Marcin");
    }
}
