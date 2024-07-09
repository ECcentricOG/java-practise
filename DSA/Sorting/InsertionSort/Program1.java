class Demo {

	public static void main(String [] ecc) {

		int [] arr = {8,3,9,2,4,7,6,1};

		for(int i=1;i<arr.length;i++) {

			int temp = arr[i];
			int j;

			for(j=i-1;j>=0;j--) {

				if(arr[j] > temp)
					arr[j+1] = arr[j];
				else
					break;
			}

			arr[j+1] = temp;
		}

		for(int x:arr) 
			System.out.print(x+" ");
	}
}
