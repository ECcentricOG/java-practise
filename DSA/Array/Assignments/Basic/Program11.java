import java.io.*;

class Solution {

        public static void main(String [] ecc) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());
                int [] arr1 = new int[size];
                System.out.println("Enter Values : -");
		int max = Integer.MIN_VALUE;
                for(int i=0;i<arr1.length;i++) {

                        arr1[i] = Integer.parseInt(br.readLine());
			if(arr1[i] > max)
				max = arr1[i];
                }
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] arr2 = new int [n];
		System.out.println("Enter Array Size : -");
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr2.length;i++) {

			arr2[i] = Integer.parseInt(br.readLine());
			if(arr2[i]< min)
				min = arr2[i];
		}
		System.out.println("ANS : "+(min*max));
	}
}
