/* Print Pattern 	5 5 5 5
 * 			5 5 5 5
 * 			5 5 5 5                */

class Demo{

	public static void main(String [] args){

		int row = 3;
		int col = 4;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=col;j++){

				System.out.print("5 ");
			}

			System.out.println();
		}
	}
}
