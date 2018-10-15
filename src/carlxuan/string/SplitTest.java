package carlxuan.string;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "This is a  test";
		String[] arr = a.split("\\s+");
		System.out.println(Arrays.toString(arr));
	}

}
