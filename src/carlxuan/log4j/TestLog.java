package carlxuan.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TestLog {

	public static void main(String[] args) {
		Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		log.error("Hello this is an error message");
		log.warn("Hello this is an warn message");
		
		System.out.println("What?");
	}

}
