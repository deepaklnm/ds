package dp;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int a[] = {5, 11, 8, 37, 23, 50, 41, 80};
		int l[] = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			l[i] = 1;
		}
		
		for(int i = 1; i< a.length; i++) {
			for(int j = 0; j < i; j++) {
				if(a[i] > a[j] && l[i] < l[j] + 1) {
					l[i]++;
				}
			}
		}
		
		int max = 0;
		for(int i=0; i < a.length; i++) {
			if(l[i] > max) {
				max = l[i];
			}
		}
		
		System.out.println(max);
	}

}
 