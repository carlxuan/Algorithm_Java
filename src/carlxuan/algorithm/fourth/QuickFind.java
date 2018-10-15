package carlxuan.algorithm.fourth;

import java.util.Arrays;

public class QuickFind {

	public static void main(String[] args) {
		QuickFind qf = new QuickFind(10);
		qf.union(1, 2);
		qf.union(2, 3);
		qf.union(3, 4);
		System.out.println(Arrays.toString(qf.id));
		System.out.println(qf.isConnected(1, 2));
	}
	
	int[] id;
	int count;
	
	public QuickFind(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
		count = N;
	}
	
	public int find(int index) {
		return id[index];
	}
	
	public boolean isConnected(int p, int q) { 
		return (find(p) == find(q));
	}

	public void union(int p, int q) {
		int pValue = id[p];
		int qValue = id[q];
		
		if(pValue == qValue) return;
		
		for(int i = 0; i < id.length; i++) {
			if(id[i]==pValue) id[i] = q;
		}
		count--;
	}
}
