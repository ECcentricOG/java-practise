/*	2	3	5	7
 *	11	13	17	19
 *	23	29	31	37
 *	41	43	47	53		*/

class Solution{

	public static void main(String [] args){
		int n = 4;
		int num = 55;
	
		for(int i=1;i<=n;i++){
	
			for(int j=1;j<=n;j++){
		
				for(int k=1;k<=num;k++){
			
					int count = 0;
							
						for(int m=1;m<=l;m++){
						
							if(k%m == 0){
	
								count++;
							}
		
							if(count == 2){
		
								System.out.print((k)+"	 ");
							}
						}
				}	
			}
		}
	
			System.out.println();
	}	
}	
