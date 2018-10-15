package carlxuan.java8;

import java.util.BitSet;
import java.util.function.IntPredicate;

public class Test1 {

	public static void main(String[] args) {
		String a  = "This is a test";
		BitSet b = new BitSet();
		for(int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i));
			b.set(a.charAt(i));
		}
		System.out.println(b);
//		System.out.println(b.get(32));
		
//		System.out.println(b.nextSetBit(85));
		int fromIndex = 0;
		int setValue;
		while((setValue = b.nextSetBit(fromIndex)) != -1) {
			System.out.println((char)setValue);
			fromIndex = setValue + 1;
		}
//		System.out.println((char)97);
		
//		b.stream().forEach(x->System.out.println((char)x));
	}

}
