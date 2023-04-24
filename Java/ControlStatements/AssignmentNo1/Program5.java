/*	0
 *	1   1
 *	2   3   5
 *	8   13  21  34		*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int m1 = 0;
		int m2 = 1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				System.out.print(m1+"    ");
				int sum = m1 + m2;
				m1 = m2;
				m2 = sum;

			}
			System.out.println();
		}
	}
}
