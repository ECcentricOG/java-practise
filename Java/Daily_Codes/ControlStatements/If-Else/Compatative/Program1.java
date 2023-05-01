/* Write a java program to find the no of days in month according to calender year  */
import java.util.*;
class Solution{

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Month :- ");
		int month = sc.nextInt();
		System.out.print("Enter a Year :- ");
		int year = sc.nextInt();

		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			System.out.println("31 days");
		}else if(month == 2){
			if(year%4 == 0){
				System.out.println("29 days");
			}else{
				System.out.println("28 days");
			}
		}else{
				System.out.println("30 days");
		}
	}
}
