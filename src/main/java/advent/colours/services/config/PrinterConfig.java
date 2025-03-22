package advent.colours.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import advent.colours.services.BluePrinter;
import advent.colours.services.ColourPrinter;
import advent.colours.services.GreenPrinter;
import advent.colours.services.RedPrinter;
import advent.colours.services.impl.ColourPrinterImpl;
import advent.colours.services.impl.SpanishBluePrinter;
import advent.colours.services.impl.SpanishGreenPrinter;
import advent.colours.services.impl.SpanishRedPrinter;

@Configuration
public class PrinterConfig {
    
    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    
    }
    
    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColourPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }

}
