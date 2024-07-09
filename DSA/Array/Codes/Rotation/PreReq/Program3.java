/* 
	Retrm the count of pairs(i,j) with 
	arr[i] + arr[j] == k
	k = 10
	note = i!=j
*/

class Demo {

	static int fun(int [] arr,int k) {

		int count = 0;

		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {

				if(arr[i]+arr[j]==k && i!=j)
					count++;
			}
		}
		return count;
	}

	public static void main(String [] ecc) {

		int [] arr = new int []{3,5,2,1,-3,7,8,15,6,13};
		int k = 10;
		System.out.println(fun(arr,k));
	}
}
