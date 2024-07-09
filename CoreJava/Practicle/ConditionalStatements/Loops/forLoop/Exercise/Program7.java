/* Write a program which take's number from user if number is even print that number in reverse order or if number is odd print that number in reverse order by difference two                 */

import java.util.*;
class Solution{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n%2 == 0){

			for(int i=n;i>0;i--){

				System.out.println(i);
			}

		}else{

			for(int i=n;i>0;i-=2){

				System.out.println(i);
			}
		}
	}
}
