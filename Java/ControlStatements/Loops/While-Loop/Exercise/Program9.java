/* Write a program to reverse the given number.        */

class Solution{

	public static void main(String [] args){

		int n = 943111423;
		int rev = 0;
	
		while(n>0){
			int rem = n%10;
			rev = rem+(rev*10);
			n/=10;
		}
		System.out.println(rev);
	}
}
