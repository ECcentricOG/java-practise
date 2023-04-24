/* Write a program to reverse the number */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No :- ");
		int num = sc.nextInt();
		int rem = 0;
		int rev = 0;

		while(num>0){
			rem = num%10;
			rev = rem + (rev*10);
			num = num/10;
		}
		System.out.println(rev);
	}
}
