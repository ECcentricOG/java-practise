/* Take an integer N as input
 * print multiples of 4 till N    */

class Demo{

	public static void main(String [] args){

		int n = 22;
		int i = 4;

		while(i <= n){
			if(i%4 == 0){
				System.out.println(i);
			}
			i+=4;
		}
	}
}
