package carlxuan.bitset;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
//		sort();
//		checkDuplicate();
		checkNotSet();

	}

	private static void sort() {
		// Ideally, it should be read from somewhere, not from an array, or else it's too big(usually, BitSet deals with big array)
		int[] arr = {1,5,6,2,10,9,7,3,4,8};
		BitSet b = new BitSet();
		for (int i : arr) {
			b.set(i);
		}
		int[] newArr = b.stream().filter($->$!=0).toArray();
		System.out.println(Arrays.toString(newArr));
	}
	
	private static void checkDuplicate() {
		int[] arr = {1,3,5,6,7,8,3,1};
		BitSet b = new BitSet();
		for (int i : arr) {
			System.out.println(b.get(i));
			if(b.get(i)) {
				System.out.println(i+" is duplicated");
			}
			b.set(i);
		}
	}
	
	private static void checkNotSet() {
		int[] arr = {1,3,5,6,7,8,3,1};
		BitSet b = new BitSet(128);
		for (int i : arr) {
			b.set(i);
		}
		System.out.println(b.size());
//		for(int i = 0; i < b.size(); i++) {
//			System.out.println(b.get(i));
//		}
		
		System.out.println(b.cardinality());
		
		int i = 0;
		int re;
		while((re=b.nextSetBit(i)) != -1) {
			System.out.print(re);
			i = re + 1;
		}

		
		System.out.println(Arrays.toString(b.stream().toArray()));
//		b.clear(1);
//		b.clear(3);
//		b.set(1);
		System.out.println(Arrays.toString(b.stream().toArray()));
		//if return value nextClearBit(i) not same as i means set value
		System.out.println(b.nextClearBit(5));
		System.out.println(b.nextClearBit(6));
		System.out.println(b.nextClearBit(9));
		
		b.clear();
		System.out.println(Arrays.toString(b.stream().toArray()));
	}
}
