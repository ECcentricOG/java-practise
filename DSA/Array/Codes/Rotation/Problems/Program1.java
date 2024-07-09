/*
	Problem Description : -
		Given an Integer array A of size N and an Integer B.You have to return the same array after rotating it B times.

	Input :-
		1. A : [1,2,3,4]
		   B = 2

		2. A : [2,5,6]
		   B = 1

	Output :-
		
		1. [3,4,1,2]

		2. [6,2,5]
*/

class Solution {

	public static int [] arrayRotate(int [] A,int B) {

		for(int i=1;i<=B;i++) {

			int temp = A[A.length-1];
			for(int j=A.length-1;j>0;j--)
				A[j] = A[j-1];
			A[0] = temp;
		}
		return A;
	}

	public static void main(String [] ecc) {

		int [] A = new int[]{1,2,3,4};
		int B = 2;
		int [] ans = arrayRotate(A,B);
		for(int x : ans)
			System.out.println(x);		
	}
}
