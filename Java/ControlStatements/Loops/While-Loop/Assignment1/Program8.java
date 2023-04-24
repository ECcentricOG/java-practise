/* Write a program to print the countdown of days to submit a assignment 
 * i/p = 3
 * o/p = 3 days remaining
 * 	 2 days remaining
 * 	 1 days remaining 
 * 	 0 days assignment is overdue */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No.:- ");
		int day = sc.nextInt();

		while(day>=0){
			if(day>0){
				System.out.println(day+" days remaining");
			}else{
				System.out.println("0 days assignment is overdue");
			}
			day--;
		}
	}
}
