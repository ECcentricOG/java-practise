import java.io.*;
class Solution {

	public static int maxMin(int [] A) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i=0;i<A.length;i++) {

			if(A[i] > max)
				max = A[i];

			if(A[i] < min)
				min = A[i];
		}
		return max + min;
	}

	public static void main(String [] ecc) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int N = Integer.parseInt(br.readLine());
		int [] A = new int[N];
		System.out.println("Enter Values : - ");

		for(int i=0;i<A.length;i++) {

			A[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(maxMin(A));
	}
}
