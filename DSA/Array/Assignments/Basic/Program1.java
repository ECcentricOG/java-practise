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
		System.out.print("Enter Element to Search : ");
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++) {

			if(arr[i] == num)
				System.out.println(i);
		}
	}
}
