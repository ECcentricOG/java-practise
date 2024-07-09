class Demo {

	public static void main(String [] ecc) {

		int [] arr = {2,9,3,5,4,6,1};

		for(int i=0;i<arr.length;i++) {

			int minIdx = i;

			for(int j=i+1;j<arr.length;j++) {

				if(arr[j] < arr[minIdx])
					minIdx = j;
			}

			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}

		for(int x : arr)
			System.out.print(x+" ");
	}
}
