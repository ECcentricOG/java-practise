/*	1
 *	2 c
 *	4 e 6
 *	7 h 9 j		*/

class Solution{

	public static void main(String [] u){

		int n = 4;
		int num = 1;
		char ch = 'a';

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(j%2 == 1){

					System.out.print((num)+" ");
				}else{

					System.out.print(ch +" ");
				}

				num++;
				ch++;
			}

			System.out.println();
		}
	}
}
