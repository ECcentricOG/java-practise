class Demo{

	public static void main(String [] args){

		int [] ary = {10,20,127,200};
		int [] arr = {10,20,127,200};

		System.out.println("2 Arrays with same elements Hash Codes : ");
		System.out.println(System.identityHashCode(ary));
		System.out.println(System.identityHashCode(arr));
		// 2 Arrays always have different Hash Code even if they have same elements.
	
		System.out.println();
			
		System.out.println("2 same elements from array with less than 128 value : ");
		System.out.println(System.identityHashCode(ary[2]));
		System.out.println(System.identityHashCode(arr[2]));

		System.out.println();

		System.out.println("2 same elements from arry with more than 128 value : ");
		System.out.println(System.identityHashCode(ary[3]));
		System.out.println(System.identityHashCode(arr[3]));
	}
}

