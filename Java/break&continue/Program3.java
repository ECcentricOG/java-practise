/* Print number from 1 to 40 until a number occours which is divisible by both 3 and 5      */

class Demo{

	public static void main(String [] args){

		int n = 40;

		for(int i=1;i<=n;i++){
			
			if(i%3 == 0 && i%5 == 0){
			
				break;
			}

			System.out.println(i);
		}
	}
}


