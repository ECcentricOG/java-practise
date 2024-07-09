/*
	In Place Prefix Sum

	Problem Description :- 
		Given an array A of N Integers.
		Construct prefix sum of all the array in the given array itself.
		Return an array of Integers denoating the prefix sum of the given array.

	Constrains :

		1 <= N <= 10^5
		1 <= A[i] <= 10^3

	Input :
		
		1. A = [1,2,3,4,5]
		2. A = [4,3,2]

	Output :
		
		[1,3,6,10,15]
		[4,7,9]
*/

class Solution {

	static int [] prefixSum(int [] A) {

		for(int i=1;i<A.length;i++)
			A[i] += A[i-1];
		return A;
	}

	public static void main(String [] ecc) {

		int [] A = new int[] {1,2,3,4,5};
		int [] ans = prefixSum(A);
		for(int x : ans)
			System.out.println(x);
	}
}
