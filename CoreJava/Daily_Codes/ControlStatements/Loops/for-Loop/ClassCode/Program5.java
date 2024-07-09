/* Take N as input .Count all its factors and print count  
 * i/p = 6
 * o/p = 4         */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i=n;i>=1;i--){
			if(n%i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}
