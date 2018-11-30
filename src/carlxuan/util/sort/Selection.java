package carlxuan.util.sort;

import carlxuan.util.ArrUtil;

public class Selection implements Sorting{
	
	@Override
	public void sort(int[] arr, Mode sortingMode) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				//First element is min or max
				if(sortingMode.notInOrder(arr[j], arr[i])) {
					ArrUtil.exch(arr, i, j);
				}
			}
		}
	}
}