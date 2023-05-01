/* WAP to print all even numbers in reverse order and odd numbers in std way
 * i/p = 2
 * i/p = 9
 * o/p = 8 6 4 2
 * 	 3 5 7 9		*/

import java.io.*;
class Solution{

	public static void main(String [] a)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		System.out.println("Even : ");
		for(int i=end;i>=start;i--){

			if(i%2 == 0){

				System.out.print(i+" ");
			}
		}

		System.out.println("Odd : ");
		for(int i=start;i<=end;i++){

			if(i%2 == 1){

				System.out.print(i+" ");
			}
		}
	}
}
