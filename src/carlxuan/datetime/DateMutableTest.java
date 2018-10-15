package carlxuan.datetime;

import java.util.Calendar;
import java.util.Date;

public class DateMutableTest {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		d.setHours(12);
		System.out.println(d);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.set(2017,10,20,10,20);
		System.out.println(c.getTime());
		
		
		
		java.sql.Date dd = new java.sql.Date(2018, 9, 20);
		System.out.println(dd);
		dd.setTime(0);
		System.out.println(dd);
		
		java.sql.Time tt = new java.sql.Time(18, 20, 22);
		System.out.println(tt);
		tt.setHours(11);
		System.out.println(tt);
	}

}
