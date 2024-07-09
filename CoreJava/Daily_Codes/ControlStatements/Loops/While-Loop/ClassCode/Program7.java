/* Give an integer N >= 0
 * print it's multiplication of digits   */
import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer :- ");
		int n = sc.nextInt();
		int mult = 1;

		while(n!=0){
			mult = mult*(n%10);
			n/=10;
		}
		System.out.println(mult);
	}
}
