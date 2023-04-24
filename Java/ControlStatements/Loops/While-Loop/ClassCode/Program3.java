/* Take an integer N as input
 * print odd integer from 1 to N using loop  */

class Demo{

	public static void main(String [] args){

		int n = 10;
		int i = 1;

		while(i<=n){
			if(i%2 == 1){
				System.out.println(i);
			}
			i++;
		}
	}
}



