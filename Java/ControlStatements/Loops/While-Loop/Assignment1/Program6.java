/* Write a program to print the sum of all even numbers and multiplication of all odd numbers between 1 to 10  */

class Demo{

	public static void main(String [] args){

		int num = 1;
		int sum = 0;
		int mul = 1;

		while(num<=10){
			if(num%2 == 0){
				sum = sum + num;
			}else{
				mul = mul*num;
			}
			num++;
		}
		System.out.println("Sum :- "+sum);
		System.out.println("Multi :- "+mul);
	}
}
