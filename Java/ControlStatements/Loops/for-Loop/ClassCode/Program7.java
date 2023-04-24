/* Take N as input Print it's prime or not 
 * i/p = 5
 * o/p = Prime
 *
 * i/p = 8
 * o/p = Not a Prime 
 * */

import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i=1 ; i<=n ; i++){
			if(n%i == 0){
				count = count + 1;		
			}
		}
		if(count == 1 || count == 0){
			System.out.println(n+" is neither Prime nor Composite number");
		}else if(count == 2){
			System.out.println(n+" is a Prime number");
		}else{
			System.out.println(n+" is not a Prime number");
		}
	}
}
