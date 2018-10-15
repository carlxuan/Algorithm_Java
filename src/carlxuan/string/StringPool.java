package carlxuan.string;

public class StringPool {


	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = new String("abc");
		c = c.intern();
		String d = new String("abc").intern();
		String e = "abc";
		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a == d);
//		System.out.println(a == e);
//		System.out.println(b == c);
//		System.out.println(c == d);
		
		System.out.println(a == c);

	}

}
