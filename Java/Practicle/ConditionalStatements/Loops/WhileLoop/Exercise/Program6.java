/* Write a program to print the sum of all even numbers and multiplication of all odd numbers between 1 to 10   */

class Solution{

	public static void main(String [] args){

		int n = 1;
		int sum = 0;
		int mult = 1;

		while(n<=10){

			if(n%2 == 0){

				sum = sum+n;
			}else{

				mult = mult*n;
			}
			n++;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Multiplication : "+mult);
	}
}
