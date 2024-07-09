import java.util.*;
class Solution {

	static int [] prefixSum(int [] arr) {

		for(int i=1;i<arr.length;i++)
			arr[i] += arr[i-1];
		return arr;
	}

	public static void main(String [] ecc) {

		int [] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int [] A = prefixSum(arr);
		int ans = 0;
		for(int i=1;i<=Q;i++) {

			int s = sc.nextInt();
			int e = sc.nextInt();

			if(s == 0)
				ans = A[e];
			else
				ans = A[e] - A[s-1];
			System.out.println(ans);
		}
	}
}
