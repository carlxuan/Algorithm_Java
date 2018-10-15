package carlxuan.string;

public class ReverseString {

	public static void main(String[] args) {
//		String ori = "This is a test string";
		String ori = "1234567890";
		String reversed = new StringBuffer(ori).reverse().toString();
		String reversed1 = new StringBuilder(ori).reverse().toString();
		System.out.println(ori);
		System.out.println(reversed);
		System.out.println(reversed1);
		System.out.println(new ReverseString().reverse(ori));
	}
	
	String reverse(String ori){
		char[] c = ori.toCharArray();
		for(int i = 0; i < c.length/2; i++)
		{
			 char tmp = c[i];
			 c[i] = c[c.length - i -1];
			 c[c.length - i -1] = tmp;
		}
		return String.valueOf(c);
	}

}
