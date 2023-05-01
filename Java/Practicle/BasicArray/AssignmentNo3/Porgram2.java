import java.io.*;
class Solution{

	static void revNo(int x){

		int rev = 0;
		for(int i=x;i>0;i/=10){

			int rem = i%10;
			rev = (rev*10)+rem;
		}
		System.out.print(rev + "  ");	
	}

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Arrat Size : ");
                int n = Integer.parseInt(br.readLine());
                int [] ary = new int [n];
                for(int i=0;i<ary.length;i++){

                        ary[i] = Integer.parseInt(br.readLine());
                }
	
		System.out.println("Ans");

		for(int i=0;i<ary.length;i++){
	
			revNo(ary[i]);
		}
	}
}	
