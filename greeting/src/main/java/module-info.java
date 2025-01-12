module eu.chrost.greeting {
    exports eu.chrost.greeting;

    provides eu.chrost.greeting.GreetingService with eu.chrost.greeting.impl.GreetingServiceImpl;
}