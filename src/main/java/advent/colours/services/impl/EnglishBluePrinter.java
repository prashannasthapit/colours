package advent.colours.services.impl;

import org.springframework.stereotype.Component;

import advent.colours.services.BluePrinter;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
    
}
