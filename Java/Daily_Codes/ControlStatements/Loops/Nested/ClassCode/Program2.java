/* Print Pattern 7 7 7
 * 		 7 7 7
 * 		 7 7 7
 * 		 7 7 7                */

class Demo{

	public static void main(String [] args){

		int row = 4;
		int col = 3;

		for(int i=1;i<=row;i++){
	
			for(int j=1;j<=col;j++){

				System.out.print("7 ");
			}

			System.out.println();
		}
	}
}
