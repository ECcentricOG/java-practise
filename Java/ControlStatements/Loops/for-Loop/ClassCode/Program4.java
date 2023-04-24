/* Take N as input print all its factors 
 * i/p = 6
 * o/p = 1 2 3 6    */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			if(n%i == 0){
				System.out.println(i);
			}
		}
	}
}
