/*	F
 *	E F
 *	D E F
 *	C D E F
 *	B C D E F 
 *	A B C D E F		*/

class Solution{

	public static void main(String [] args){

		int n = 6;
		char ch = 'F';

		for(int i=1;i<=n;i++){
			
			char ch1 = ch;

			for(int j=1;j<=i;j++){

				System.out.print(ch1++ +" ");
			}

			ch--;
			System.out.println();
		}
	}
}
