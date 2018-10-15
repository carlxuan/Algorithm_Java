package carlxuan.string;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
//		per("", "abc");
//		System.out.println(permutation);
//		bruteLoop("abc");
		recursive("", "abcde",3);
	}
	
	static List<String> permutation = new ArrayList<>();
	public static void per(String prefix, String rest) {
		if(rest.length() == 1) {
			permutation.add(prefix+rest);
		}
		for(int i = 0; i < rest.length(); i++) {
			per(prefix + rest.charAt(i), rest.substring(0, i)+rest.substring(i+1, rest.length()));
		}
	}

	
	private static void bruteLoop(String str) {
		for(int i = 0; i < str.length()-1; i++) {
			for(int j = i + 1; j < str.length(); j++) {
				System.out.println(str.charAt(i)+""+str.charAt(j));
			}
		}
	}
	
	private static void recursive(String prefix, String str, int expectNumber) {
		if(prefix.length() == expectNumber) {
			System.out.println(prefix);
		}else
		{
			//str.length()-number+1, e.g length is 5, get 2 out of them, then we should stop at last but one, so +1
			for(int i = 0; i < str.length(); i++) {
//				recursive(prefix+str.charAt(i), str.substring(i+1), expectNumber);
				recursive(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1), expectNumber);
			}
		}
	}

} 