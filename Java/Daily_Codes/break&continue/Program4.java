/* Print all Nos from 1 to 50 except those are divisible by both 3 and 5 or divisible by 4         */

class Demo{

	public static void main(String [] args){
	
		int n = 50;

		for(int i=1;i<=n;i++){

			if(i%3 == 0 && i%5 == 0 || i%4 == 0){

				continue;
			}

			System.out.println(i);
		}
	}
}
