/*	A b C d
 *	E f G h
 *	I j K l
 *	M n O p
 *	Q r S t
 *	U v W x              */


class Solution{

	public static void main(String [] args){

		char cap = 'A';
		char sml = 'b';

		for(int i=1;i<=6;i++){

			for(int j=1;j<=4;j++){

				if(j%2 == 1){

					System.out.print(cap +" ");
					cap+=2;
				}else{

					System.out.print(sml +" ");
					sml+=2;
				}
			}

			System.out.println();
		}
	}
}
