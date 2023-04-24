/* Write a program to print sum of all even numbers and multiplication of odd numbers between 1 to 10      */

class Solution{

	public static void main(String [] args){

		int n = 10;
		int sum = 0;
		int mult = 1;

		for(int i=1;i<=n;i++){

			if(i%2 == 0){

				sum = sum+i;
			}else{

				mult = mult*i;
			}

		}
		System.out.println("Sum : "+sum);
		System.out.println("Multiplication : "+mult);
	}
}
