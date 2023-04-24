/*		F 5 D 3 B 1
 *		F 5 D 3 B 1
 *		F 5 D 3 B 1
 *		F 5 D 3 B 1
 *		F 5 D 3 B 1
 *		F 5 D 3 B 1          */

class Solution{

	public static void main(String [] args){

		for(int i=1;i<=6;i++){

			int num = 5;
			char ch = 'F';

			for(int j=1;j<=6;j++){

				if(j%2 == 1){

					System.out.print(ch +" ");
					ch-=2;
				}else{

					System.out.print((num) +" ");
					num-=2;
				}
			}

			System.out.println();
		}
	}
}
