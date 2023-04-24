/* Write a java program , take a number , and print whether it is positive or negative  */
class Demo{

	public static void main(String [] args){

		int num = -9;

		/*if(num < 0){
			System.out.println(num+" is a negative no");
		}else if(num > 0){
			System.out.println(num+" is a positive no");
		}else{
			System.out.println(num+" is neither positive nor negative");
		}*/


		if(num == 0){
			System.out.println(num+" is neither negative nor positive");
		}
		else if(num >>> 31 == 1){
			System.out.println(num+" is negative");
		}else{
			System.out.println(num+" is positive");
		}
	}
}
