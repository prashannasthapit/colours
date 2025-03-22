package advent.colours;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import advent.colours.services.ColourPrinter;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColoursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}

}
