package carlxuan.algorithm.fourth;

import java.util.Arrays;

public class QuickUnion {

	public static void main(String[] args) {
		QuickUnion qf = new QuickUnion(10);
		System.out.println(Arrays.toString(qf.arr));
		qf.union(1, 2);
		System.out.println(Arrays.toString(qf.arr));
		qf.union(2, 3);
		System.out.println(Arrays.toString(qf.arr));
		qf.union(3, 4);
		System.out.println(Arrays.toString(qf.arr));
		qf.union(5, 4);
		System.out.println(qf.isConnected(1, 5));
	}
	
	
	int[] arr;
	int counter;
	public QuickUnion(int length) {
		counter = length;
		arr = new int[length];
		for(int i = 0; i < length; i++) {
			arr[i] = i;
		}
	}
	public int find(int index) {
		while(arr[index] != index) index = arr[index];
		return index;
	}

	public boolean isConnected(int p, int q) {
		return find(p) == find(q);
	}
	public void union(int p, int q) {
		int pv = find(p);
		int qv = find(q);
		if(pv == qv) return;
		// [0,1,2,3]  
		// [1,1,2,3]  -- 0->1
		// [1,2,2,3]  -- 1->2
		// [1,2,3,3]  -- 2->3
		arr[pv] = qv;
		counter--;
	}
}
