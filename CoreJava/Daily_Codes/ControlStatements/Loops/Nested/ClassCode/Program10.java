/*	A A A A 
 * 	1 1 1 1
 * 	B B B B
 * 	2 2 2 2        */

class Demo{

	public static void main(String [] args){

		int num = 1;
		char ch = 'A';

		for(int i=1;i<=4;i++){

			for(int j=1;j<=4;j++){

				if(i%2 == 0){

					System.out.print((num)+" ");
				}else{

					System.out.print(ch +" ");
				}
			}
			if(i%2 == 0){

				num++;
			}else{

				ch++;
			}

			System.out.println();
		}
	}
}
