/* Write a program to count digits from given number  */

class Solution{

	public static void main(String [] args){

		int n = 942111423;
		int count = 0;

		for(int i=n;i>0;i/=10){

			count++;
		}
		System.out.println(count);
	}
}
