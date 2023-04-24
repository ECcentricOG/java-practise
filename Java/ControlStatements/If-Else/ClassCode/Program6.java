/* Give an interger input whether it's odd or even */

class Demo{

	public static void main(String [] args){

		int num = 7;

		if(num % 2 == 0){
			System.out.println(num+" is Even");
		}else if(num % 2 == 1){
			System.out.println(num+" is Odd");
		}else{
			System.out.println("Zero is neither ever nor odd");
		}
	}
}
