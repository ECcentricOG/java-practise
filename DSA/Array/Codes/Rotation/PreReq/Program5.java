class Demo {

	static int secondLargest(int [] arr) {

		int max = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++) {

			if(sec < arr[i])
				sec = arr[i];

			if(arr[i] > max) {

				sec = max;
				max = arr[i];
			}
		}
		return sec;
	}

	public static void main(String [] ecc) {

		int [] arr = new int [] {8,4,1,3,9,2,6,7};
		System.out.println(secondLargest(arr));
	}
}
