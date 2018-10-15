package carlxuan.string;

import java.util.BitSet;

public class StringTest {

	public static void main(String[] args) {
//		testRemoveChar("abcdeabc");
		testRemoveCharBitset("abcdeabc");
	}
	
	private static void testRemoveChar(String str) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)+"") == str.lastIndexOf(str.charAt(i)+"")) {
				result.append(str.charAt(i));
			}else
			{
				if(result.indexOf(str.charAt(i)+"")==-1) {
					result.append(str.charAt(i));
				}
			}
		}
		System.out.println(result);
	}
	
	private static void testRemoveCharBitset(String str) {
		BitSet b = new BitSet();
		for(int i = 0; i < str.length(); i++) {
			b.set(str.charAt(i));
		}
		System.out.println(b);
		StringBuilder s = new StringBuilder();
		int i = 0;
		int re;
		while((re=b.nextSetBit(i)) != -1) {
//			System.out.println(re);
			s.append((char)re);
			i = re + 1;
		}
		System.out.println(s);
	}

}
