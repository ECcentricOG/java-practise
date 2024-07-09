/* Write a program to calculate factorial of given number 
 * i/p = 6
 * o/p = 720  */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
	       	System.out.print("Enter a No. :- ");
		int no = sc.nextInt();
		int factorial = 1;

		while(no>0){
			
			factorial = factorial*no;
			no--;
		}
		System.out.println(factorial);	
	}
}
