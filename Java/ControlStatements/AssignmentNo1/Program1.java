/*	D4 C3 B2 A1
 *	A1 B2 C3 D4
 *	D4 C3 B2 A1
 *	A1 B2 C3 D4		*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++){

			char ch1 = 'D';
			int num1 = 4;
			char ch2 = 'A';
			int num2 = 1;

			for(int j=1;j<=n;j++){

				if(i%2 == 1){

					System.out.print(ch1--);
					System.out.print(num1--);
					System.out.print("  ");
				}else{
				
					System.out.print(ch2++);
					System.out.print(num2++);
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
