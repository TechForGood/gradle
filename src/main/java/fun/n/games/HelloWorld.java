package fun.n.games;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.HelloWorld");

	public static void main(String[] args) {

		logger.debug("Hello world from gradle.");

	}
}