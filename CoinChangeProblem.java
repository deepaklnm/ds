package dp;

public class CoinChangeProblem {
	
	public int getWaysToCalculateSum(int[] a, int numberOfCoins, int n) {
		
		int[] t = new int[n+1];
		t[0] = 1;
		int j = 1;
		
		if(n == 0)
			return 1;
		
		for(int i = 0; i < numberOfCoins; i++) {
			for(j = a[i]; j <= n; j++) {
				t[j] = t[j] + t[j - a[i]];
			}
		}
		
		return t[j-1];
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3};
		int numberOfCoins = a.length;
		
		int n = 6;
		
		CoinChangeProblem c = new CoinChangeProblem();
		int totalWays = c.getWaysToCalculateSum(a, numberOfCoins, n);
		System.out.println(totalWays);
		
	}

}
