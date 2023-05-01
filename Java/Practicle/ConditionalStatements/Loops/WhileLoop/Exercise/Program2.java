/* Write a program to calculate the factorial of the given number  */

class Solution{

	public static void main(String [] args){

		int n = 6;
		int i = n;
		int fact = 1;
		while(i>0){

			fact = fact*i;
			i--;
		}
		System.out.println(fact);
	}
}
