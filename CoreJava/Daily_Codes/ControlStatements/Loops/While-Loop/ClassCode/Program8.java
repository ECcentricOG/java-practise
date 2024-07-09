/* Take an integer N as input
 * print perfect squares till N.
 * perfect square :- An integer whose square root is a integer
 *
 * 25 ---> 5 : yes
 * 81 ---> 9 : yes
 * 10 ---> 3.13 : no
 *
 * i/p = 30 
 * o/p = 1
 * 	 4
 * 	 9
 * 	 16
 * 	 25  */

import java.util.*;
class Demo{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer :- ");
		int n = sc.nextInt();
		int i = 1;
	/*	while(i*i <= n){
			System.out.println(i*i);
			i++;
		}  */
		

		while(i<=n){
			if(i*i <= n){
				System.out.println(i*i);
			}
			i++;
		}
	}
}
