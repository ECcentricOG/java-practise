import java.io.*;
class Solution {

	public static int equalityTime(int [] A) {

		int reqTime = 0;
		int max = Integer.MIN_VALUE;

		for(int i=0;i<A.length;i++){

			if(A[i] > max)
				max = A[i];
		}

		for(int i=0;i<A.length;i++) {
		
			int temp = max - A[i];
			reqTime += temp;
		}
		return reqTime;
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

                System.out.println(equalityTime(A));
        }
}
