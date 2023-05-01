/*	$
 *	@ @
 *	& & &
 *	# # # #
 *	$ $ $ $ $
 *	@ @ @ @ @ @
 *	& & & & & & &
 *	# # # # # # # #		*/

import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(i%4 == 1){
	
					System.out.print("$ ");
				}else if(i%4 == 2){

					System.out.print("@ ");
				}else if(i%4 == 3){

					System.out.print("& ");
				}else{

					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
