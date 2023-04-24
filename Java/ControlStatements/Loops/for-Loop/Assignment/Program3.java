/* Fibonacci Series : Starts from 0 and 1 then 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8  */

import java.util.*;
class Solution{

	public static void main(String [] Umesh){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int num = sc.nextInt();
		int n = 0;
		int m = 1;
		int total = 0;
		
		System.out.println(n);
		for(int i=1;i<=num;i++){
			
			System.out.println(m);
			total = n + m;
			n = m;
			m = total;
		}
	}
}
