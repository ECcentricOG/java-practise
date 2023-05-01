/*	A   B   C   D
 *	B   C   D
 *	C   D
 *	D		*/

class Solution{

	public static void main(String [] args){

		int n = 4;
		char ch = 'A';

		for(int i=1;i<=n;i++){

			char ch1 = ch;

			for(int j=1;j<=n-i+1;j++){

				System.out.print(ch1++ +"   ");
			}

			System.out.println();
			ch++;
		}
	}
}
