/* Write a java program to check a no is even or odd */

class Demo{

	public static void main(String [] args){
	
		int var = 14;

		if(var == 0){
			System.out.println(var+" is neither even nor odd");
		}else if(var%2 == 0){
			System.out.println(var+" is even");
		}else{
			System.out.println(var+" is odd");
		}
	}
}
