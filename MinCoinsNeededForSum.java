package dp;

public class MinCoinsNeededForSum {

	public int minCoinsForSum(int[] a, int numberOfCoins, int n) {
		
		int[] t = new int[n + 1];
		
		t[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			t[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < numberOfCoins; j++) {
				if(a[j] <= i) {
					int min = t[i - a[j]];
					if(min != Integer.MAX_VALUE && min + 1 < t[i]) {
						t[i] = min + 1;
					}
				}
			}
		}
		
		return t[n];
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3};
		int numberOfCoins = a.length;
		
		int n = 10;
		
		MinCoinsNeededForSum c = new MinCoinsNeededForSum();
		int minCoins = c.minCoinsForSum(a, numberOfCoins, n);
		System.out.println("Minimum Coins required: " + minCoins);

	}

}
