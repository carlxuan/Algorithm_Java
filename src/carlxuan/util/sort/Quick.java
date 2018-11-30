package carlxuan.util.sort;

import java.util.Arrays;

import carlxuan.util.ArrUtil;

public class Quick implements Sorting{

	@Override
	public void sort(int[] arr, Mode sortingMode) {
		sort(arr, 0, arr.length-1, sortingMode);
	}
	
	private void sort(int[] arr, int low, int high, Mode sortingMode) {
		if(low>=high) return;
		int pivot = getPivot(arr, low, high, sortingMode);
		sort(arr, low, pivot-1, sortingMode);
		sort(arr, pivot+1, high, sortingMode);
	}
	
	private int getPivot(int[] arr, int low, int high, Mode sortingMode) {
		int i = low+1;
		int j = high;
		//Here using (true) not (i < j), or else, below needs to check
		// array out of index issue
		while(true){
			while(sortingMode.inOrder(arr, i, low)) {
				i++;
				if(i == high) break;
			}
			while(sortingMode.inOrder(arr, low, j)) {
				j--;
				if(j == low) break;
			}
			if(i >= j) break;
			ArrUtil.exch(arr, i, j);
//			System.out.println(Arrays.toString(arr));
		}
		ArrUtil.exch(arr, low, j);
//		System.out.println(j);
		return j;
	}

}
