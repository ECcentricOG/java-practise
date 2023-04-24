/* Automorphic number 
 * i/p = 5       5x5 = 2(5)  
 * O/P = YES   
 *
 * i/p = 9    9x9 = 8(1)
 * o/p = NO                 */

import java.util.*;
class Solution{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int count = 0;
		int sq = n*n;
		int sq2 = n*n;
		int temp = 0;
		int total = 0;

	/*	for(int i=n;i>0;i/=10){
			count++;
		}

		for(int i=1;i<=count;i++){
			sq = sq/10;
		}
		
		for(int i=1;i<=count;i++){
			sq = sq*10;
		}

		int total = sq2 - sq;     */

		for(int i=n;i>0;i/=10){
			count++;
		}

		for(int i=1;i<=count;i++){
			int rem = sq%10;
			temp = rem + (temp*10);
			sq = sq/10;
		}
	
		for(int i=temp;i>0;i/=10){
			int rem = i%10;
			total = rem + (total*10); 
		}

		
		if(n == total){
			System.out.println(n+"is Automorphic number");
		}else{
			System.out.println(n+" is not a Automorphic number");
		}

	}
}
