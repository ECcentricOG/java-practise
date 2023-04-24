/* Write a Program for prime number       */
import java.util.*;
class Demo{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i =1;i<=n;i++){

			if(n%i == 0){
				count++;
			}

			if(count>2){
				break;
			}
		}
		if(count == 2){
			System.out.println(n+" is a Prime No");
		}else{
			System.out.println(n+" is not a Prime No");
		}
	}
}
