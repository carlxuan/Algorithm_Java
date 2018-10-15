package carlxuan.integer;

public class IntegerOperation {

	public static void main(String[] args) {
		System.out.println(reverseInteger(12345));
	}
	
	private static int reverseInteger(int x) {
		int reversed = 0;
		int tmp = x;
		while(tmp != 0) {
			reversed = reversed*10+tmp%10;
			tmp = tmp/10;
		}
		return reversed;
	}

}
