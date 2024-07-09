/* Take N as input print its factorial 
 * i/p = 5
 * o/p = 120     */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int fact = 1;

		for(int i=n;i>=1;i--){
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}
