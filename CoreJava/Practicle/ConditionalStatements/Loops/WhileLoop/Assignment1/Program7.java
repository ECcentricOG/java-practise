/* Write a program which takes number from user if number is even print that number inreverse order or if number is odd print that number is reverse order by gr. of 2 
 *  i/p = 6
 *  o/p = 6 5 4 3 2 1
 *  i/p = 7
 *  o/p = 7 5 3 1  */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No. :- ");
		int num = sc.nextInt();

		if(num%2 == 0){
			while(num>0){
				System.out.println(num);
				num--;
			}
		}else{
			while(num>0){
				System.out.println(num);
				num = num-2;			
			}
		}
		
	}
}
