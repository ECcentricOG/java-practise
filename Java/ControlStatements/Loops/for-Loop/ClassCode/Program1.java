/* Take N as input. Print from 1 to N  */

import java.util.*;
class Demo{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No :- ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}
