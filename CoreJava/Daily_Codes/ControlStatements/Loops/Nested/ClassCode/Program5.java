/* Print Pattern	3 3 3
 * 			4 4 4
 * 			5 5 5                  */

class Demo{

	public static void main(String [] arp){

		int row = 3;
		int col = 3;

		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=col;j++){

				System.out.print((i+2)+" ");
			}

			System.out.println();
		}
	}
}
