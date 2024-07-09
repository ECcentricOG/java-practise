class Demo {

	static void bubbleSort(int [] arr,int n) {

		if(n == 1)
			return;

		for(int j=0;j<n-1;j++) {

			if(arr[j] > arr[j+1]) {

				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}

		bubbleSort(arr,n-1);
	}

	public static void main(String [] ecc) {

		int [] arr = {7,3,9,4,2,5,6};

		bubbleSort(arr,arr.length);

		for(int x:arr)
			System.out.print(x+" ");
	}
}
