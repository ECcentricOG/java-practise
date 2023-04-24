/* Write a program to check the num is palindrome number or not  */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No. :- ");
		int num = sc.nextInt();
		int rem = 0;
		int rev = 0;
		int pallin = num;

		while(num>0){
			rem = num%10;
			rev = rem+(rev*10);
			num/=10;
		}
		if(pallin == rev){
			System.out.println(pallin+" is a Pallindrom");
		}else{
			System.out.println(pallin+" is not a Pallindrom");
		}
	}
}
