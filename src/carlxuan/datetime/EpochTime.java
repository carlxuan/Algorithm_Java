package carlxuan.datetime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class EpochTime {

	public static void main(String[] args) {
		verify_java_epoch_time_in_millisecond();
	}
	
	
	private static void verify_java_epoch_time_in_millisecond() {
//		LocalDateTime epochStartTime = LocalDateTime.parse("1970-01-01T00:00:00");
//		System.out.println(epochStartTime.toEpochSecond(ZoneOffset.UTC));
		Date d = new Date(0);
		System.out.println(d);
		Date d1 = new Date(1000);
		System.out.println(d1);
	}

}
