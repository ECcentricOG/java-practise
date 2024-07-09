import java.io.*;

class Solution {

	public int [] removeEle(int arr,int index) {

		size = arr.length - 1;
		int [] ans = new int[size];

		for(int i=0;i<index;i++)
			ans[i] = arr[i];

		int num = 0;
		for(int i=index+1;i<arr.length;i++){

			ans[index+num] = arr[i];
			num++;
		}
		return ans;
	}

        public static void main(String [] ecc) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.println("Enter Values : ");
                for(int i=0;i<arr.length;i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }
	}
}
