/* Write a program to find maximum between 3 numbers  */

class Demo{

	public static void main(String [] args){

		int num1 = 42;
		int num2 = 32;
		int num3 = 42;

		if(num1 > num2 && num1 > num3){
			System.out.println(num1+" is greater than "+num2+" "+num3);
		}else if(num1 == num2 && num1 > num3){
			System.out.println(num1+" and "+num2+" are equal and greater than "+num3);
		}else if(num1 == num3 && num1 > num2){
			System.out.println(num1+" and "+num3+" are equal and greater than "+num2);
		}else if(num2 > num1 && num2 > num3){
			System.out.println(num2+" is greater than "+num1+" and "+num3);
		}else if(num2 == num3 && num2 >num1 ){
			System.out.println(num2+" and "+num3+" are equal and greater than "+num1);
		}else if(num3 > num1 && num3 > num2){
			System.out.println(num3+" is greater than "+num1+" "+num2);
		}else{
			System.out.println(num1+","+num2+"&"+num3+" are equal");
		}
	}
}
