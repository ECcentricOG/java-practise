/*	1	2	9
 *	4	25	6
 *	49	8	81		*/

class Solution{

	public static void main(String [] args){

		int even = 2;
		int odd = 1;
		for(int i=1;i<=3;i++){

			for(int j=1;j<=3;j++){

				if((i+j)%2 == 1){

					System.out.print(even+"    ");
					even+=2;
				}else{

					System.out.print((odd*odd)+"    ");
					odd+=2;
				}
			}

			System.out.println();
		}
	}
}
