/* Write a program to check the number is a pallindrome number or not. */

class Solution{

	public static void main(String [] args){

		int n = 2332;
		int rev = 0;

		for(int i=n;i>0;i/=10){

			int rem = i%10;

			rev = rem+(rev*10);
		}

		if(n == rev)
			System.out.println(n+" is a Pallindrome number");
		else
			System.out.println(n+" is not a Pallindrome number");
	}
}
