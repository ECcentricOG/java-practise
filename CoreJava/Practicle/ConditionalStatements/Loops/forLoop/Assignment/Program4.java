/* Finf the number is Prime or Composite 
 * i/p = 5 
 * o/p = Prime
 *
 * i/p = 10
 * o/p = Composite       */

import java.util.*;
class Solution{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i=1;i<=n;i++){
			if(n%i == 0){
				count++;
			}
		}
		if(count == 0 || count == 1){
			System.out.println(n+" is neither Prime number nor Composite number");
		}else if(count == 2){
			System.out.println(n+" is a Prime number");
		}else{
			System.out.println(n+" is a Composite number");
		}
	}
}
