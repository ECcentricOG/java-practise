import java.io.*;
class Solution{

	static boolean strongNo(int x){

		int sum = 0;
		for(int i=x;i>0;i/=10){

			int rem = i%10;
			int mult = 1;

			for(int j=1;j<=rem;j++){
			
				mult = mult * j;
			}
			sum = sum + mult;
		}
		boolean isStrong = false;

		if(x == sum){

			isStrong = true;
		}
		return isStrong;
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

			if(strongNo(ary[i])){

				System.out.println("Strong number "+ary[i]+" found at index : "+i);
			}
		}
        }       
}   
