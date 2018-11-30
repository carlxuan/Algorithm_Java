package carlxuan.util;

public interface ArrUtil {
	static boolean less(int[] arr, int less, int greater) {
		return MathUtil.less(arr[less], arr[greater]);
	}
	
	static boolean greater(int[] arr, int greater, int less) {
		return !less(arr, greater, less);
	}
	
	static boolean less(Comparable[] arr, int less, int greater) {
		return MathUtil.less(arr[less], arr[greater]);
	}
	
	static boolean greater(Comparable[] arr, int greater, int less) {
		return !less(arr, greater, less);
	}
	
	static void exch(int[] arr, int p, int q) {
		int tmp = arr[p];
		arr[p] = arr[q];
		arr[q] = tmp;
	}
}