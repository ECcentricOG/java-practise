/* Take integer N as imput Print whether N is perfect number or not
 * i/p = 4  factors = 1 2 (4)   1+2 = 3   3!=4 hence not 
 * o/p = Not a Perfect number 
 *
 * i/p = 6 factors = 1 2 3 (6)  1+2+3 = 6   6=6 hence Perfect 
 * o/p = Perfect number             */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int sum = 0;

		for(int i=n-1;i>0;i--){
			if(n%i == 0){
				sum = sum+i;
			}
		}
		if(sum == n){
			System.out.println(n+" is a Perfect number");
		}else{
			System.out.println(n+" is not a Perfect number");
		}

	}
}
