/* Write a program to count digits of the given no.  */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No. :- ");
		int num = sc.nextInt();
		int count = 0;
		int rem = 0;

		while(num>0){

			rem = num%10;
			count = count + 1;
			num = num/10;
		}
		System.out.println(count);
	}
}
