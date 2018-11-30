package carlxuan.util.sort;

import java.util.function.BiFunction;

import carlxuan.util.MathUtil;

public enum Mode {
	ASC {
		//This is expected ASC sequence, first element should be less than 2nd
		BiFunction<Integer, Integer, Boolean> inOrder() {
			return (a, b) -> MathUtil.less(a, b);
		}
		
		BiFunction<Integer, Integer, Boolean> notInOrder() {
			return (a, b) -> MathUtil.greater(a, b);
		}

		boolean notInOrder(int p, int q) {
			return notInOrder().apply(p, q);
		}
		
		boolean inOrder(int p, int q) {
			return inOrder().apply(p, q);
		}
		
		boolean inOrder(int[] arr, int p, int q) {
			return inOrder().apply(arr[p], arr[q]);
		}
	},
	DESC {
		BiFunction<Integer, Integer, Boolean> inOrder() {
			return (a, b) -> MathUtil.greater(a, b);
		}
		
		BiFunction<Integer, Integer, Boolean> notInOrder() {
			return (a, b) -> MathUtil.less(a, b);
		}

		boolean notInOrder(int p, int q) {
			return notInOrder().apply(p, q);
		}
		
		boolean inOrder(int p, int q) {
			return inOrder().apply(p, q);
		}
		
		boolean inOrder(int[] arr, int p, int q) {
			return inOrder().apply(arr[p], arr[q]);
		}
	};

	abstract boolean notInOrder(int p, int q);
	abstract boolean inOrder(int p, int q);
	abstract boolean inOrder(int[] arr, int p, int q);
}
