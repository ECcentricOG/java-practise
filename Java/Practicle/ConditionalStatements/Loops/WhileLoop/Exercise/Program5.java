/* Write a program to print the square of even digits of the given number    */

class Solution{

	public static void main(String [] args){

		int n = 942111423;
		
		while(n>0){

			int rem = n%10;

			if(rem%2 == 0){

				System.out.println(rem*rem);
			}

			n/=10;
		}
	}
}
