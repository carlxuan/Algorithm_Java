package carlxuan.util.sort;

public class Merge implements Sorting{
	@Override
	public void sort(int[] arr, Mode sortingMode) {
		sort(arr, 0, arr.length-1, sortingMode);
	}
	
	private void sort(int[] arr, int low, int high, Mode mode) {
		if(low >= high) return;
		int i = low;
		int mid = low + (high-low)/2;
		int j = mid + 1;
	    sort(arr, low, mid, mode);
	    sort(arr, mid+1, high, mode);
	    
	    int[] arrCopy = new int[arr.length];
	    System.arraycopy(arr, low, arrCopy, low, high-low+1);
	    int x = low;
	    while(x<=high) {
	    	if(i > mid) {
	    		arr[x++] = arrCopy[j++];
	    	}else if(j > high) {
	    		arr[x++] = arrCopy[i++];
	    	}else if(mode.inOrder(arrCopy[i], arrCopy[j])) {
	    		arr[x++] = arrCopy[i++];
	    	}else
	    	{
	    		arr[x++] = arrCopy[j++]; 
	    	}
	    }
	}

}
