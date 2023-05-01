import java.io.*;
class Solution{

	static boolean perfectNo(int x){

		int sum = 0;
		for(int i=1;i<x;i++){

			if(x%i == 0){
		
				sum = sum + i;
			}
		}
		boolean isPerfect = false;
		if(sum == x){

			isPerfect = true;
		}
		return isPerfect;
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

			if(perfectNo(ary[i])){

				System.out.println("Perfect number "+ary[i]+" found at index : "+i);
			}
		}
        }       
}   
