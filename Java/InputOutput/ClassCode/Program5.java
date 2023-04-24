/* Take a Input from user on same line about Player Analysis 
 * Player Name,Grade of Player,Total No of Goals,Match Rating out of 10  */

import java.io.*;
import java.util.*;
class Demo{

	public static void main(String [] u)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Analysis : ");
		String analysis = br.readLine();
		
		StringTokenizer stz = new StringTokenizer(analysis,",");
		String token1 = stz.nextToken();
		char token2 = stz.nextToken().charAt(0);
		int token3 = Integer.parseInt(stz.nextToken());
		float token4 = Float.parseFloat(stz.nextToken());

		System.out.println();
		System.out.println("Name : "+token1);
		System.out.println("Grade : "+token2);
		System.out.println("Goal : "+token3);
		System.out.println("Rating : "+token4);
	}
}
