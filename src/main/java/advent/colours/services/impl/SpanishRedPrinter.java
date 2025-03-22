package advent.colours.services.impl;

import org.springframework.stereotype.Service;

import advent.colours.services.RedPrinter;

@Service
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "rojo";
    }
    
}
