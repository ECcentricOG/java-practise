/*	1
 *	8    9
 *	27   16   125
 *	64   25   216  49		*/

class Solution{

	public static void main(String [] args){

		int n = 4;
		int num = 1;

		for(int i=1;i<=n;i++){
			
			int num1 = num;

			for(int j=1;j<=i;j++){

				if(j%2 == 1){

					System.out.print((num1*num1*num1)+"   ");
				}else{

					System.out.print((num1*num1)+"   ");
				}
				num1++;
			}

			System.out.println();
			num++;
		}
	}
}
