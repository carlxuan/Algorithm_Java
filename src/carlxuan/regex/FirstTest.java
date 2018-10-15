package carlxuan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTest {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		String a = "2018-07-12 09:12:13 This is a 2017-10-12 0 test";
		Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{2} ");
		Matcher m = p.matcher(a);
		System.out.println(m.find());
//		System.out.println(m.matches().02);
		System.out.println(m.group(0));
		System.out.println(m.group(1));
		
		System.out.println(a.replaceAll("\\d{4}-\\d{2}-\\d{2} ", "My replacementz"));
	}

}
