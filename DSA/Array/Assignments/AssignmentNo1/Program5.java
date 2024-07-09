import java.io.*;
class Solution {

	public static int [] prefixSum(int [] A) {

		for(int i=1;i<A.length;i++)
			A[i] = A[i-1]+A[i];
		return A;
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

                int [] ans = prefixSum(A);

		System.out.print("[");
		for(int i=0;i<ans.length;i++) {

			if(i< ans.length-1)
				System.out.print(ans[i]+",");
			else
				System.out.println(ans[i]+"]");
		}
        }
}
