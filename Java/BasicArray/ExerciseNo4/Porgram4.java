import java.io.*;
class Solution{

	static boolean primeNo(int x){
	
		int count = 0;
		for(int i=1;i<=x;i++){

			if(x%i == 0){
		
				count++;
			}

			if(count == 3){

				break;
			}
		}
		boolean isPrime = false;

		if(count == 2){

			isPrime = true;
		}
		return isPrime;
	}

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Arrat Size : ");
                int n = Integer.parseInt(br.readLine());
                int [] ary = new int [n];
                for(int i=0;i<ary.length;i++){

                        ary[i] = Integer.parseInt(br.readLine());
                }

		for(int i=0;i<ary.length;i++){

			if(primeNo(ary[i])){

				System.out.println("Prime No "+ary[i]+" found at index : "+i);
			}
		}
        }       
}   
