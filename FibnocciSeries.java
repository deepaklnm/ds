package dp;

public class FibnocciSeries {
	
	int MAX = 10;
	int[] a = new int[MAX];
	
	public int fibnocci(int n) {
		if(n <= 1) {
			return n;
		}
		
		return fibnocci(n-1) + fibnocci(n-2); 
	}
	
	public void intializeToNIL() {
		for(int i = 0; i < MAX; i++) {
			a[i] = Integer.MIN_VALUE;
		}
	}
	
	public int fibnocciUsingMemoization(int n) {
		if(a[n] == Integer.MIN_VALUE) {
			if(n <= 1) {
				a[n] = n;
			} else {
				a[n] = fibnocciUsingMemoization(n - 1) + fibnocciUsingMemoization(n - 2);
			}
		}
		
		return a[n];
	}
	
	
	public int fibnocciUsingTabulation(int n) {
		int a[] = new int[n+1];
		
		a[0] = 0;
		a[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		return a[n];
		
	}

	public static void main(String[] args) {
		
		FibnocciSeries a = new FibnocciSeries();
		System.out.println(a.fibnocci(1));
		
		a.intializeToNIL();
		System.out.println(a.fibnocciUsingTabulation(5));
		
	}

}
