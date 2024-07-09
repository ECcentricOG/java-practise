/*
	Given an integer array of size N.
	Build an array leftmax of size N.
	Leftmax of i contain the maximum for the index 0 to the index i.

	Arr [-3,6,2,4,5,2,8,-9,3,1]
	N = 10

	leftmax = [-3,6,6,6,6,6,6,8,8,8,8]
*/

class Solution {

	public static int [] bruteForce(int [] arr) {

		for(int i=0;i<arr.length;i++) {

			int max =Integer.MIN_VALUE;

			for(int j=0;j<=i;j++) {

				if(arr[j] > max)
					max = arr[j];
			}

			arr[i] = max;
		}
		return arr;
	}

	public static int [] optimal(int [] arr) {

		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {

			if(arr[i] > max)
				max = arr[i];

			arr[i] = max;
		}
		return arr;
	}

	public static void main(String [] ecc) {

		int [] arr = new int []{-3,6,2,4,5,2,8,-9,3,1};
		int ans1 [] = bruteForce(arr);
		int ans2 [] = optimal(arr);

		for(int x : ans1)
			System.out.println(x);
		System.out.println();

		for(int x : ans2)
			System.out.println(x);
	}
}
