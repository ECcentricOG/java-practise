import java.io.*;
class Solution {

	public static int [] productPuzzle(int [] A) {

		int [] productArray = new int [A.length];
		int product = 1;

		for(int i=0;i<A.length;i++)
			product *= A[i];

		for(int i=0;i<productArray.length;i++)
			productArray[i] = product/A[i];
		return productArray;
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

                int [] ans = productPuzzle(A);
		System.out.print("[");
		for(int i=0;i<ans.length;i++) {

			if(i<ans.length-1)
				System.out.print(ans[i]+",");
			else
				System.out.println(ans[i]+"]");
		}
        }
}
