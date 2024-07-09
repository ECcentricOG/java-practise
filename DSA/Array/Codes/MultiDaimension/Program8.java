class Demo {

	public static void main(String [] ecc) {

		int arr[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};

		int temp = arr[0].length - 1;
	
		for(int k = 0;k<arr[0].length;k++) {
		
			for(int i=0;i<arr.length;i++) {
	
				for(int j=arr[0].length-1-k;j>=0;j--) {
				
					if(i + j == temp)
						System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();		
			temp --;
		}

		
	}
}
