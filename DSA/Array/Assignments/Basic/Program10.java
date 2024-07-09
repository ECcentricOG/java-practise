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
		int sum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {

			int temp = Integer.MIN_VALUE;

			for(int j=i+1;j<arr.length;j++) {

				if(temp < arr[i]+ arr[j])
					temp = arr[i]+arr[j];
			}
			if(sum < temp)
				sum = temp;
		}
		System.out.println(sum);
	}
}

