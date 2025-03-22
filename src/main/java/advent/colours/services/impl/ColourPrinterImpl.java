package advent.colours.services.impl;

import advent.colours.services.BluePrinter;
import advent.colours.services.ColourPrinter;
import advent.colours.services.GreenPrinter;
import advent.colours.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl(
            RedPrinter redPrinter,
            GreenPrinter greenPrinter,
            BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }

}
