/*
 	Given an Integer array of size N.
 	Count the no of elements having aleast one element greater than itself.
*/


class Demo {

	static int bruteForce(int [] arr) {

		int count = 0;

		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {

				if(arr[i] < arr[j]) {

					count++;
					break;
				}
			}
		}
		return count;
	}
	
	static int optimized(int [] arr) {

		int count = 0;
		int max = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++) {

			if(arr[i] > max)
				max = arr[i];
		}

		for(int x : arr) {

			if(x == max)
				count++;
		}

		return arr.length - count;
	}

	public static void main(String [] ecc) {

		int [] arr = new int [] {2,5,1,4,8,0,8,1,3,8};
		System.out.println(bruteForce(arr));
		System.out.println(optimized(arr));
	}
}


