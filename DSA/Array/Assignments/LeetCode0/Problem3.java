class Solution {

	public static int search(int [] arr,int target) {

		int start = 0;
		int end = arr.length - 1;

		while(start <= end) {

			int mid = start + end / 2;

			if(arr[mid] == target)
				return mid;

			if(arr[mid] < target)
				start = mid + 1;
			if(arr[mid] > target)
				end = mid - 1;
		}

		return start;
	}

	public static void main(String [] ecc) {

		int [] arr = new int[]{1,3,5,6};
		int target = 2;

		System.out.println(search(arr,target));
	}
}
