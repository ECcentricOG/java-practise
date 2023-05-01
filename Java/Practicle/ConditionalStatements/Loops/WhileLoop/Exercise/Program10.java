/* Write a program to check whether the number is a pallindrome number or not.         */

class Solution{

	public static void main(String [] arhs){

	int n = 2332;
	int rev = 0;
	int temp = n;

	while(n!=0){

		int rem = n%10;
		rev = rem+(rev*10);
		n/=10;
	}
	if(temp == rev)
		System.out.println(temp+" is a Pallindrome number");
	else
		System.out.println(temp+" isa not a Pallindrome number");
	}
}
