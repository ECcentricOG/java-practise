/* 		 C B A
 *  		 C B A
 *  		 C B A              */

class Solution{

	public static void main(String [] args){

		for(int i=1;i<=3;i++){

			char ch = 'C';

			for(int j=1;j<=3;j++){

				System.out.print(ch-- +" ");
			}

			System.out.println();
		}
	}
}
