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

			int count = 0;

			for(int j=i+1;j<arr.length;j++) {

				if(arr[i] == -1)
					break;

				if(arr[i] == arr[j]) {

					arr[j] = -1;
					count++;
				}
			}
			if(count % 2 == 0)
				System.out.println(arr[i]);
		}
	}
}
