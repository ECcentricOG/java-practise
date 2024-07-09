/* Electricity Bill Problem
 * Given an integer of input A which represent units of electricity comsumed at your house
 * calculate and print bill amount
 * units <= 100 : price per unit 1
 * units > 100 : price per unit 2  */

class Demo{

	public static void main(String [] args){

		int units = 200;

		if(units <= 100){
			System.out.println("Bill :- "+units*1);
		}else{
			System.out.println("Bill :- "+((units - 100)*2+100));
		}
	}
}
