package carlxuan.util;

public interface MathUtil {
	static boolean less(int less, int greater) {
		return less < greater;
	}
	
	static boolean greater(int greater, int less) {
		return !less(greater, less);
	}
	
	static boolean less(double less, double greater) {
		return less < greater;
	}
	
	static boolean greater(double greater, double less) {
		return !less(greater, less);
	}
	
	static boolean less(long less, long greater) {
		return less < greater;
	}
	
	static boolean greater(long greater, long less) {
		return !less(greater, less);
	}
	
	static boolean less(char less, char greater) {
		return less < greater;
	}
	
	static boolean greater(char greater, char less) {
		return !less(greater, less);
	}
	
	static boolean less(float less, float greater) {
		return less < greater;
	}
	
	static boolean greater(float greater, float less) {
		return !less(greater, less);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static boolean less(Comparable less, Comparable greater) {
		return less.compareTo(greater) < 0;
	}
	
	@SuppressWarnings("rawtypes")
	static boolean greater(Comparable greater, Comparable less) {
		return !less(greater, less);
	}
}
