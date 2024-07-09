/* Calculate profit or loss
 * Write a program that takes the cost price and selling price (Take it hardcore) and calculates it's profit or loss   */
class Demo{

	public static void main(String [] args){

		double sellingPrice = 900.0d;
		double costPrice = 500.0d;

		if(sellingPrice > costPrice){
			System.out.println("Profit of "+(sellingPrice - costPrice));
		}else if(sellingPrice < costPrice){
			System.out.println("Loss of "+(sellingPrice - costPrice));
		}else{
			System.out.println("Na Nafa Na Tota");
		}
	}
}
