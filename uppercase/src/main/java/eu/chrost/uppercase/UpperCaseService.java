package eu.chrost.uppercase;

import eu.chrost.uppercase.impl.UpperCaseServiceImpl;

public interface UpperCaseService {
    String toUpperCase(String s);

    static UpperCaseService getInstance() {
        return new UpperCaseServiceImpl();
    }
}
