
class Solution {

	public static int [] bruteForce(int [] arr,int target) {

		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {

				if(arr[i] + arr[j] == target)
					return new int []{i,j};
			}
		}
		return new int[]{-1,-1};
	}

	/*public static int [] optimal(int [] arr,int target) {

		for(int i=1;i<arr.length;i++) {

			arr[i] = arr[i-1] + arr[i];
			if(arr[i] == target)
				return new int[]{arr[i-1],arr[i]};
		}

		for(int i=0;i<arr.length;i++) {

			if(i)
		}
	}*/

	public static void main(String [] ecc) {

		int [] arr = new int[]{2,7,11,15};
		int target = 9;

		int [] ans1 = bruteForce(arr,target);
		//int [] ans2 = optimal(arr,target);
		
		for(int x : ans1)
			System.out.print(x+" ");
		System.out.println();

		/*for(int x : ans2)
			System.out.print(x+" ");
		System.out.println();*/
	}
}
