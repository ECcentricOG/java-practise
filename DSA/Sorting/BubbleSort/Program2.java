class Demo {

	public static void main(String [] ecc) {

		int arr[] = {3,2,5,4,7,9,6};

		boolean swaped;

		for(int i=0;i<arr.length;i++) {

			swaped = false;

			for(int j=0;j<arr.length-1-i;j++) {

				if(arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swaped = true;
				}
			}

			if(swaped == false)
				break;
		}

		for(int x:arr)
			System.out.print(x+" ");
	}
}
