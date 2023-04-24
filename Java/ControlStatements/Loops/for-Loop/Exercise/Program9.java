/* Write a program to reverse the given number  */

class Solution{

	public static void main(String [] args){

	int n = 942111423;
	int rev = 0;

	for(int i=n;i>0;i=i/10){

		int rem = i%10;

		rev = rem+(rev*10);
	}
	System.out.println(rev);
	}
}
