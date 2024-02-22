module greeting {
    exports eu.chrost.greeting;
    provides eu.chrost.greeting.GreetingService with eu.chrost.greeting.impl.GreetingServiceImpl;

    requires org.apache.commons.lang3;
    requires org.apache.commons.text;
}