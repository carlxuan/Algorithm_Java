package carlxuan.algorithm.fourth;

public class WeightedQuickUnion {

	public static void main(String[] args) {
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);
		wqu.union(1, 2);
		wqu.union(2, 3);
		wqu.union(3, 4);
		System.out.println(wqu.isConnected(1, 4));
		System.out.println(wqu.isConnected(2, 4));
	}
	
	int[] arr;
	int N;
	int[] high;
	public WeightedQuickUnion(int N) {
		this.N = N;
		arr = new int[N];
		high = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i;
			high[i] = 1;
		}
	}
	
	public int find(int p) {
		int pv = arr[p];
		while(pv != arr[p]) {
			pv = arr[pv];
		}
		return pv;
	}
	
	public boolean isConnected(int p, int q) {
		return find(p) == find(q);
	}
	
	public void union(int p, int q) {
		int pv = find(p);
		int qv = find(q);
		if(pv == qv) return;
		
		// add the smaller tree to bigger tree, it's not depth
		// it's the number of elements in the tree
		if(high[pv] > high[qv]) {
			arr[qv] = pv;
			high[pv] += high[qv];
		}else
		{
			arr[pv] = qv;
			high[qv] += high[pv];
		}
	}
}
