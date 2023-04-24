/* Write a program to print a series of prime numbers from entered range
 * i/p = 10
 * i/p = 100
 * o/p = 11 13 17 19......89 97		*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){

			int count = 0;

			for(int j=1;j<=i;j++){

				if(i%j == 0){

					count++;
				}

				if(count == 3){

					break;
				}
				
			}
			if(count == 2){

				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
