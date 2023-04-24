/* 	9 8 7
 *  	9 8 7
 *  	9 8 7   
 *  	9 8 7   */

class Solution{

	public static void main(String []args){

		for(int i=1;i<=4;i++){

			int num = 9;

			for(int j=1;j<=3;j++){

				System.out.print((num--)+" ");
			}

			System.out.println();
		}
	}
}
