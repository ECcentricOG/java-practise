import java.io.*;
class Solution {

	public static int [] leaders(int [] A) {

		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=A.length-1;i>=0;i--) {

			if(max < A[i]) {
			
				count++;
				max = A[i];
			}
		}
		int [] leadersArray = new int[count];
		int ip = 0;	
		int temp = Integer.MIN_VALUE;
		for(int i=A.length-1;i>=0;i--) {

			if(A[i] > temp){

				temp = A[i];
				leadersArray[ip] = A[i];
				ip++;
			}
		}
		return leadersArray;
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

                int [] ans = leaders(A);
		System.out.print("[");
		for(int i=0;i<ans.length;i++) {

			if(i<ans.length-1)
				System.out.print(ans[i]+",");
			else
				System.out.println(ans[i]+"]");
		}
        }
}
