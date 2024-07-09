class Demo {

	static void insertionSort(int [] arr,int start) {

		if(start >= arr.length)
			return;

		int temp = arr[start];
		int j;
		for(j=start-1;j>=0;j--) {

			if(arr[j] > temp)
				arr[j+1] = arr[j];
			else
				break;
		}
		arr[j+1] = temp;

		insertionSort(arr,start+1);
	}

	public static void main(String [] ecc) {

		int [] arr = {9,3,5,1,2,6,7};
		insertionSort(arr,1);

		for(int x:arr)
			System.out.print(x+" ");
	}
}
