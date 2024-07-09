/* Write a program to print the square of even digit of given number N
 * i/p = 942111423
 * o/p = 4 16 4 16    */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No :- ");
		int num = sc.nextInt();
		int rem = 0;

		while(num>0){
			rem = num%10;
			if(rem%2 == 0){
				System.out.println(rem*rem);
			}
			num = num/10;
		}
	}
}
