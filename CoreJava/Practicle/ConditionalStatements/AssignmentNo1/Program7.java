/*	i/p = 5				i/p = 4
 *
 *	O				10
 *	14   13				I    H
 *	L    K    J			7    6    5
 *	9    8    7    6		D    C    B    A
 *	E    D    C    B    A
 *
 *			*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=1;i<=n;i++){

			sum = sum+i;
		}

		int num = sum;
		int add = sum  + 64;
		char ch = (char)add;

		if(n%2 == 1){

			for(int i=1;i<=n;i++){

				for(int j=1;j<=i;j++){

					if(i%2 == 1){

						System.out.print(ch+"    ");
					}else{

						System.out.print((num)+"    ");
					}
					ch--;
					num--;
				}
				System.out.println();
			}
		}else{

			for(int i=1;i<=n;i++){

				for(int j=1;j<=i;j++){

					if(i%2 == 1){

						System.out.print((num)+"    ");
					}else{

						System.out.print(ch+"    ");
					}
					ch--;
					num--;
				}
				System.out.println();
			}
		}
	}
}
