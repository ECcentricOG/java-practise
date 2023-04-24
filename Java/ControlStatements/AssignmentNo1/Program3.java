/*	5  4  3  2  1
 *	8  6  4  2
 *	9  6  3
 *	8  4
 *	5				*/

import java.io.*;
class Solution{

	public static void main(String [] a)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int num = n+1;

		for(int i=1;i<=n;i++){

			int num1 = num*i;

			for(int j=1;j<=n-i+1;j++){

				System.out.print(num1-=i);
				System.out.print("  ");
			}
			num--;
			System.out.println();
		}
	}
}
