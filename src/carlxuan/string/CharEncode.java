package carlxuan.string;

import java.nio.charset.Charset;
import java.util.Arrays;

public class CharEncode {

	public static void main(String[] args) {
		testEncode();
		byte[] b = {78,58,87,99,100};
		System.out.println(new String(b));
	}
	
	private static void testEncode() {
		String a = new String("This is a test 中文");
		byte[] decode = a.getBytes(Charset.forName("utf-8"));
		System.out.println(Arrays.toString(decode));
		String b = new String(decode);
		System.out.println(b);
		
	}

}
