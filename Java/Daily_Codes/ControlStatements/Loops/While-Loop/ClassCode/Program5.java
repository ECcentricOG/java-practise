/* Give an integer N
 * Print all it's digit
 * i/p = 2341
 * o/p = 1
 * 	 4
 * 	 3
 * 	 2  */

import java.util.*;
class Demo{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer :- ");
		int n = sc.nextInt();

		while(n != 0){
			System.out.println(n%10);
			n = n/10;
		}
	}
}
