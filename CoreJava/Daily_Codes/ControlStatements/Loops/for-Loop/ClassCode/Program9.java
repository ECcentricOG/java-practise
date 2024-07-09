/* Take N as input .Print whether N is armstrong number or not 
 * i/p = 23		2x2 = 4   3x3 = 9    4+9=13  13!=53
 * o/p = Not an Armstrong number
 *
 * i/p = 153		1x1x1 = 1   5x5x5 = 125   3x3x3 = 27      1+125+27 = 153    153==153   
 * o/p = Armstrong number
 * */
import java.util.*;
class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int n = sc.nextInt();
		int count =0;
		int sum = 0;
	
		for(int i=n;i>0;i/=10){
			count++;
		}

		for(int i=n;i>0;i/=10){
			int rem = i%10;
			int mult = 1;

			for(int j=1;j<=count;j++){
				mult = mult*rem;
			}
			sum = sum + mult;
		}
		if(n == sum){
			System.out.println(n+" is an Armstrong number");
		}else{
			System.out.println(n+ " is not an Armstorng number");
		}
	}
}
