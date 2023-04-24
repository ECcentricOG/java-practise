/*	1 2 3 4
 *	4 5 6
 *	6 7 
 *	7		*/

class Solution{

	public static void main(String [] aeg){

		int n = 4;
		int num = 1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=n-i+1;j++){

				System.out.print((num++)+" ");
			}
			
			num = num - 1;
			System.out.println();
		}
	}
}
