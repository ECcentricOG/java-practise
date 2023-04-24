/*	10	
 *	I   H
 *	7   6   5
 *	D   C   B   A		*/

class Solution{

	public static void main(String [] args){

		int n = 4;
		int num = 10;
		char ch = 'J';

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(i%2 == 1){

					System.out.print((num)+"   ");
				}else{

					System.out.print(ch +"   ");
				}
				num--;
				ch--;
			}

			System.out.println();
		}
	}
}
