/* 	1
 *  	4	9
 *  	16	25	36
 *  	49	64	81	100		*/

class Solution{

	public static void main(String [] args){

		int n = 4;
		int num = 1;

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				System.out.print((num*num)+"	");
				num++;
			}

			System.out.println();
		}
	}
}
