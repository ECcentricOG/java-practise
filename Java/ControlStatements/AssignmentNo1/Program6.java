/* Write a Program take 2 characters if these characters are equal then print them as it is bit if they are unequal then print their difference 
 * i/p = a p
 * o/p = Difference between a and p is 15		*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch1 = (char)br.read();
		br.skip(1);
		char ch2 = (char)br.read();
		br.skip(1);

		if(ch1 == ch2){

			System.out.println(ch1+" is same as "+ch2);
		}else{

			int a = (int)ch1;
			int b = (int)ch2;
			int ans = b - a;
			System.out.println("Difference between "+ch1+" and "+ch2+" is "+ans);
		}
	}
}
