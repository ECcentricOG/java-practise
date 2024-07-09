/*
	find the max element until i th position
*/

class Demo {

	public static int solution(int [] arr,int B) {

		int max = Integer.MIN_VALUE;

		for(int i=0;i<=B;i++) {

			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String [] ecc) {

		int [] arr = new int[]{3,4,5,1,2,7,9,8};
		int B = 3;
		System.out.println(solution(arr,B));
	}
}
