package advent.colours.services.impl;

import org.springframework.stereotype.Component;

import advent.colours.services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
    
}
