package carlxuan.util.sort;

public interface Sorting {
	//Default sorting mode is desc
	default void sort(int[] arr) {
		sort(arr, Mode.DESC);
	}
	
	public void sort(int[] arr, Mode sortingMode);
}
