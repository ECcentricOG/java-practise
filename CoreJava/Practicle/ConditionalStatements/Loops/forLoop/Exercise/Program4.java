/* Write a program to print the square of even digits of the given number        */

class Solution{

	public static void main(String [] args){

		int n = 942111423;


		for(int i=n;i>0;i/=10){

			int rem = i%10;

			if(rem%2 == 0){

				System.out.println(rem*rem);
			}
		}
	}
}
