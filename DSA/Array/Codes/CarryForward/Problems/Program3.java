/*
	Given an character array (lower case)
	Return the count of pair such that :

	a) i < j
	b) arr[i] = 'a'
	   arr[j] = 'g'
   	
	Arr [a,b,e,g,a,g]

	Output : 3	
*/

class Solution {

	public static int bruteForce(char [] arr) {

		int count = 0;

		for(int i=0;i<arr.length;i++) {

			if(arr[i] == 'a') {

				for(int j=i+1;j<arr.length;j++) {

					if(arr[j] == 'g')
						count++;
				}
			}
		}
		return count;
	}

	public static int optimal(char [] arr) {

		int inc = 0;
		int count = 0;

		for(int i=0;i<arr.length;i++) {

			if(arr[i] == 'a')
				inc++;
			if(arr[i] == 'g')
				count += inc;
		}
		return count;
	}

	public static void main(String [] ecc) {

		char [] arr = new char[]{'a','b','e','g','a','g'};
		
		System.out.println(bruteForce(arr));
		System.out.println(optimal(arr));
	}
}
