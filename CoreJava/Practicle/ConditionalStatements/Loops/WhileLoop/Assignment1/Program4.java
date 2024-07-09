/* Write a program to count the odd digits in the given number 
 * i/p = 12345  
 * o/p = 3    */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No. :- ");
		int num = sc.nextInt();
		int rem = 0;
		int count = 0;

		while(num>0){

			rem = num%10;
			if(rem%2 == 1){
				count = count +1;
			}
			num = num/10;
		}
		System.out.println(count);
	}
}
