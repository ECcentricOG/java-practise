/* Write a Program to which take's number from user if number is even print that number in reverse order or if number is odd print the  number in reverse order by difference two              */

import java.util.*;
class Solution{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
	       	int n = sc.nextInt();

		if(n%2 == 0){

			while(n>0){

				System.out.print(n+" ");
				n--;
			}
		}else{

			while(n>0){

				System.out.println(n+" ");
				n-=2;
			}
		}	
	}
}
