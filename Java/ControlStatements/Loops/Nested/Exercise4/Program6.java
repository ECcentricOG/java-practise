/*	1 
 *	2  3
 *	3  4  5
 *	4  5  6  7		*/

class Solution{

	public static void main(String [] args){

		int n = 4;

	/*	for(int i=1;i<=n;i++){

			int num = i; 

			for(int j=1;j<=i;j++){

				System.out.print((num++)+"  ");
			}

			System.out.println();
		}	*/

		int num = 1;

		for(int i=1;i<=n;i++){

			int num1 = num;

			for(int j=1;j<=i;j++){

				System.out.print((num1++)+"  ");
			}

			System.out.println();
			num++;
		}
	}
}
