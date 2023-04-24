/* Write a Program to count the odd digits of the given number  */

class Solution{

	public static void main(String [] args){

		int n = 942111423;
		int count = 0;
		
		for(int i=n;i>0;i/=10){
			
			int rem = i%10;

			if(rem%2 == 1){
				count++;
			}
		}
		System.out.println(count);
	}
}
