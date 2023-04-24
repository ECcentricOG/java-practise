//	1   2   3   4
//	2   3   4
//	3   4
//	4

class Solution{

	public static void main(String [] args){

		int n = 4;
	/*	int num = 1;

		for(int i=1;i<=n;i++){

			int num1 = num;

			for(int j=1;j<=n-i+1;j++){

				System.out.print((num1++)+"   ");
			}

			System.out.println();
			num++;
		}	*/


		for(int i=1;i<=n;i++){

			int num = i;

			for(int j=1;j<=n-i+1;j++){

				System.out.print((num++)+"  ");
			}

			System.out.println();
		}
	}
}
