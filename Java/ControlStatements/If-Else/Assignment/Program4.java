/* Write a java program that checks a number from 0 to 5 and print it's spelling, if a number is greater than 5 print the no is greater than 5  */

class Demo{

	public static void main(String [] args){

		int var = -6;

		if(var > 0 && var <= 5){
			if(var == 5){
				System.out.println("Five");
			}else if(var == 4){
				System.out.println("Four");
			}else if(var == 3){
				System.out.println("Three");
			}else if(var == 2){
				System.out.println("Two");
			}else{
				System.out.println("One");
			}
		}else{
			System.out.println("Invalid Input");
		}
	}
}
