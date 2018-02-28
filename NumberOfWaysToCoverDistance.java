package dp;

public class NumberOfWaysToCoverDistance {
	
	public int numberOfWays(int a[], int n) {
		int[] t = new int[n+1];
		
		t[0] = 1;
		t[1] = 1;
		t[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			t[i] = t[i-1] + t[i-2] + t[i-3]; 
		}
		
		return t[n];
	}

	public static void main(String[] args) {
		NumberOfWaysToCoverDistance s = new NumberOfWaysToCoverDistance();
		
		int a[] = {1, 2, 3};
		
		int n = 6;
		
		int count = s.numberOfWays(a, n);
		System.out.println("Total # of ways: " + count);
		
	}

}
