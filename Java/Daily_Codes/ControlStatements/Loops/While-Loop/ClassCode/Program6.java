/* Give an integer N >= 0
 * print sum of it's digits
 * i/p = 6531
 * o/p = 6+5+3+1= 15  */

import java.util.*;
class Demo{

	public static void main(String [] s){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer :- ");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0){
			sum = sum + (n%10);
			n /= 10;
		}
		System.out.println(sum);
	}
}
