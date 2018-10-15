package carlxuan.string;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String re = new ReverseString1().reverse("abcde");
//		System.out.println(re);
//		System.out.println(reverseByLoop("abcde"));
		System.out.println(reverseByRecursive("","abcde"));
	}
	
	private static String reverseByRecursive(String reversed, String remaining) {
		if(remaining.length() == 1) {
			return remaining + reversed;
		}
		return reverseByRecursive(remaining.charAt(0)+reversed, remaining.substring(1));
	}
	
	
	private static String reverseByLoop(String str) {
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length/2; i++) {
			char tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
		return String.valueOf(arr);
	}
	
	String reverse(String str)
	{
		if(str == null) return null;
		if(str.length() <=1) 
		{
			return str;
		}
		return reverse(str.substring(1))+str.substring(0, 1);
	}

}
