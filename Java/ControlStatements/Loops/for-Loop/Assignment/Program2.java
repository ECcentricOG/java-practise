/* Strong Number : Sum of each digit facors are same of that number
 *
 * i/p = 145    1 + 4x3x2x1 + 5x4x3x2x1 = 145 == 145
 * o/p = Strong number
 *
 * i/p = 12    1 + 2x1 = 3 != 12
 * o/p = Not a Strong number           */

import java.util.*;
class Solution{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int sum = 0;

		for(int i=n;i>0;i/=10){
			int rem = i%10;
			int mult = 1;

			for(int j=1;j<=rem;j++){
				mult = mult*j;
			}
			sum = sum + mult;
		}
		if(n == sum){
			System.out.println(n+" is a Strong number");
		}else{
			System.out.println(n+" is not a Strong number");
		}
	}
}
