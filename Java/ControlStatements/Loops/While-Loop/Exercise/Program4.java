/* Write a program to print to count the odd digits of the given number   */

class Solution{

	public static void main(String[] args){

		int n = 942111423;
		int count = 0;
		
		while(n>0){

			int rem = n%10;
			if(rem%2 == 1){
				count++;
			}
			n/=10;
		}
		System.out.println(count);
	}
}
