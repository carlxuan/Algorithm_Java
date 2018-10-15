package carlxuan.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortTest {

	public static void main(String[] args) {
		Integer[] a = { 1, 5, 2, 4, 3, 9, 8, 7, 6 };
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		List<Integer> updatedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(a);
		System.out.println(list);
		System.out.println(updatedList);

		List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
		list1.add(123);
		System.out.println(list1);
		
		//add is not allowed here, but set allowed
		List<Integer> list2 = Arrays.asList(a);
		list2.set(1,123);
//		list2.add(123);
		list2.sort((x1,x2)->x1-x2);
		System.out.println(list2);
	}

}
