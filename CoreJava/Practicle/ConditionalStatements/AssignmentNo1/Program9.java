/* Write a program to take a number as input and print addition of factorials of each digit from that number
 * i/p = 1234
 * o/p = addition of factorials of each digit from 1234 is 33			*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=n;i>0;i/=10){
		
			int rem = i%10;
			int fact = 1;

			for(int j=1;j<=rem;j++){

				fact = fact*j;
			}

			sum = sum + fact;
		}

		System.out.println("Addition od factorial of each digit from "+n+" is "+sum);
	}
}
