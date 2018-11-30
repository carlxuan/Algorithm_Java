package carlxuan.util.sort;

import carlxuan.util.ArrUtil;

public class Insertion implements Sorting {
	@Override
	public void sort(int[] arr, Mode sortingMode) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j > 0 && 
					sortingMode.notInOrder(arr[j-1], arr[j]); j--) {
				ArrUtil.exch(arr,  j-1, j);
			}
		}
	}

}
