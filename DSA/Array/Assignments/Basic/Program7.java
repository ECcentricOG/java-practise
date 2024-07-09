import java.io.*;

class Solution {

        public static void main(String [] ecc) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());
                int [] arr = new int[size];
                System.out.println("Enter Values : ");
                for(int i=0;i<arr.length;i++) {

                        arr[i] = Integer.parseInt(br.readLine());
         	}
		
		for(int i=0;i<arr.length;i++) {

			int temp = 0;

			for(int j=i+1;j<arr.length;j++) {

				if(arr[i]<arr[j]) {

					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int ans = arr[0];
		
		for(int i=1;i<arr.length;i++) {

			ans = ans * 10 + arr[i];
		}
		
		System.out.println(ans);
	}
}
