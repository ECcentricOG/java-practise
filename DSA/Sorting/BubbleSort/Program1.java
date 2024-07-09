class Demo {

	public static void main(String [] ecc) {

		int [] arr = {7,4,9,2,5,3,1};
		
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length-i-1;j++) {

				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int x : arr) {

			System.out.print(x+" ");
		}
	}
}
