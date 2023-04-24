/* Print Pattern	1 1 1
 * 			2 2 2
 * 			3 3 3             */

class Demo{

	public static void main(String [] args){

		int row = 3;
		int col = 3;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=col;j++){

				System.out.print(i+" ");
			}

			System.out.println();
		}
	}
}
