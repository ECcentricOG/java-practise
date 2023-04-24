import java.io.*;
class Solution{

	static boolean armstgNo(int x){

		int count = 0;
		for(int i=x;i>0;i/=10){

			count++;
		}
		int sum = 0;
		for(int i=x;i>0;i/=10){

			int rem = i%10;
			int mult = 1;
			for(int j=1;j<=count;j++){
	
				mult = mult * rem;
			}
			sum = sum + mult;
		}
		boolean isArmstg = false;
		if(x == sum){

			isArmstg = true;
		}
		return isArmstg;
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

			if(armstgNo(ary[i])){

				System.out.println("Armstrong number "+ary[i]+" found at index : "+i);
			}
		}
        }       
}   
