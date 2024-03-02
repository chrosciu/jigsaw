package eu.chrost.uppercase.impl;

import eu.chrost.uppercase.UpperCaseService;

public class UpperCaseServiceImpl implements UpperCaseService {
    @Override
    public String toUpperCase(String s) {
        return s != null ? s.toUpperCase() : null;
    }

}
