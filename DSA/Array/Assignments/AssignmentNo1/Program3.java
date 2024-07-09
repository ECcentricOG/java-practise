import java.io.*;
class Solution {

	public static int [] rangeSum(int [] A,int [][] arr) {

		int [] ans = new int[arr.length];

		for(int i=1;i<A.length;i++)
			A[i] = A[i-1] + A[i];

		for(int i=0;i<arr.length;i++) {

			int sum = 0;

			for(int j=0;j<arr[i].length;j++) {
	
				int L = arr[i][0];
				int R = arr[i][1];

				if(L == 0) 
					sum = A[R];
				else 
					sum = A[R] - A[L-1];
			}
			ans[i] = sum;
		}
		return ans;
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

		System.out.print("Enter No of Queries : ");
		int M = Integer.parseInt(br.readLine());
		int [][] arr = new int[M][2];

		for(int i=0;i<arr.length;i++) {

			System.out.println("Enter L ans R : ");

			for(int j=0;j<arr[i].length;j++) {

				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

                int [] ans = rangeSum(A,arr);
		System.out.print("[ ");
		for(int x : ans)
			System.out.print(x+" ");
		System.out.print("]");
		System.out.println();
        }
}
