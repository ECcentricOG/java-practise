/* Write a program to count the digit of given number   */

class Solution{

	public static void main(String[] args){

		int n = 942111423;
		int i = n;
		int count = 0;

		while(i>0){

			count++;
			i/=10;
		}
		System.out.println(count);
	}
}
