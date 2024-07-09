/*
	Arr [-3,6,2,4,5,2,8,-9,3,1]
	N = 10
	RigttMax = [8,8,8,8,8,8,8,8,3,3,1]
*/

class Solution {

	public static int [] rightMax(int [] arr) {

		int max = Integer.MIN_VALUE;

		for(int i=arr.length-1;i>=0;i--) {

			if(max < arr[i])
				max = arr[i];
			arr[i] = max;
		}
		return arr;
	}

	public static void main(String [] ecc) {

		int [] arr = new int [] {-3,6,2,4,5,2,8,-9,3,1};
		int [] ans = rightMax(arr);

		for(int x : ans)
			System.out.println(x);
	}
}
