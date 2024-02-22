module greeting {
    exports eu.chrost.greeting;
    exports eu.chrost.greeting.impl;

    requires org.apache.commons.lang3;
    requires org.apache.commons.text;
}