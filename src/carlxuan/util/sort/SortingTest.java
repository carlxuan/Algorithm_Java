package carlxuan.util.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTest {


	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		int[] arr = {1,5,2,8,3,4,9,6,7};
		int[] arr = {3,5,9,8,2,4,1,6,7};
		new Quick().sort(arr, Mode.ASC);
		System.out.println(Arrays.toString(arr));
	}

}
