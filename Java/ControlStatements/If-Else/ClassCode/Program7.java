/* Given an integer value as input
 * print fizz if it is divisible by 3
 * print buzz if it is divisible by 5
 * print fizz buzz if it is divisible by both
 * if not then print not divisible by both */

class Demo{

	public static void main(String [] args){

		int num = 15;

		if(num % 3 == 0 && num % 5 == 0){
			System.out.println("Fizz-Buzz");
		}else if(num % 3 == 0){
			System.out.println("Fizz");
		}else if(num % 5 == 0){
			System.out.println("Buzz");
		}else{
			System.out.println("Not divisible by both");
		}
	}
}
