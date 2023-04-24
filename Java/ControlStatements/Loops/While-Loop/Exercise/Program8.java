/* Write a program to print the countdown of the days to submit the assignment        */

class Solution{

	public static void main(String [] args){

		int day = 7;

		while(day>=0){

			if(day == 0){

				System.out.println(day+" days Assignment is Overdue");
			}else{

				System.out.println(day+" days remaining");
			}
			day--;
		}
	}
}
