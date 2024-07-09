/* 

   Given an array of size N.
   Print all the elements.
   Arr : [5,6,2,3,1,9]
   N : 6

*/
class Demo {

	static void showArray(int [] arr) {

		System.out.print("[ ");
		for(int x : arr)
			System.out.print(x+" ");
		System.out.println(" ]");
	}

	public static void main(String [] ecc) {

		int [] arr = new int[]{5,6,2,3,1,9};
		showArray(arr);
	}
}
