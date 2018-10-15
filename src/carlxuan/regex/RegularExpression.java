package carlxuan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		test1();
//		testGroup();
//		testMatchesAndFind_Difference();
//		testStartAndEnd();
//		testMultiMatch();
	}
	
	private static void testGroup() {
		Pattern p=Pattern.compile("([a-z]+)(\\d+)"); 
		Matcher m=p.matcher("aaa2223bb"); 
		m.find();   //匹配aaa2223 
		m.groupCount();   //返回2,因为有2组 
		m.start(1);   //返回0 返回第一组匹配到的子字符串在字符串中的索引号 
		m.start(2);   //返回3 
		m.end(1);   //返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置. 
		m.end(2);   //返回7 
		System.out.println(m.group(0));
		System.out.println(m.group(1));   //返回aaa,返回第一组匹配到的子字符串 
		System.out.println(m.group(2));   //返回2223,返回第二组匹配到的子字符串 
	}
	
	private static void test1() {
	      // String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(.*)(\\d+)(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         //Totally 3 groups above  (.*) will make max match, greedy match
	         System.out.println("Found value: " + m.group(1) );
	       //Totally 3 groups above  (\\d+) will make max match, greedy match
	         System.out.println("Found value: " + m.group(2) );
	         // Totally 3 groups above  (.*) will make max match, greedy match
	         System.out.println("Found value: " + m.group(3) );
	      }else {
	         System.out.println("NO MATCH");
	      }
	}
	
	private static void testMatchesAndFind_Difference() {
		   Pattern p = Pattern.compile("\\d\\d\\d");
		    Matcher m = p.matcher("a123b");
		    //matches tries to match the expression against the entire string 
		    //and implicitly add a ^ at the start and $ at the end of your pattern, 
		    //meaning it will not look for a substring
		    System.out.println(m.find());
		    System.out.println(m.matches());

		    p = Pattern.compile("^\\d\\d\\d$");
		    m = p.matcher("123");
		    System.out.println(m.find());
		    System.out.println(m.matches());
	}
	
	private static void testMultiMatch() {
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
		     System.out.println(m.group()); 
		} 
	}
	
	private static void testStartAndEnd() {
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("aaa2223bb"); 
		System.out.println(m.find());//匹配2223 
		m.start();//返回3 
		m.end();//返回7,返回的是2223后的索引号 
		m.group();//返回2223 

		Matcher m2=p.matcher("2223bb"); 
		System.out.println(m2.lookingAt());   //匹配2223 
		m2.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0 
		m2.end();   //返回4 
		m2.group();   //返回2223 

		Matcher m3=p.matcher("2223bb"); 
		System.out.println(m3.matches());   //匹配整个字符串 
		m3.start();   //返回0,原因相信大家也清楚了 
		m3.end();   //返回6,原因相信大家也清楚了,因为matches()需要匹配所有字符串 
		m3.group();   //返回2223bb 
	}

}
