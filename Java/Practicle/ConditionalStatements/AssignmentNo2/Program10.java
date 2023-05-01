import java.io.*;
class Solution{

	void armStg(int x){

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
		if(x == sum){

			System.out.println(x);
		}
	}

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Start : ");
                int n = Integer.parseInt(br.readLine());
                System.out.print("Enter End : ");
                int m = Integer.parseInt(br.readLine());
		Solution obj = new Solution();
                for(int i=n;i<=m;i++){
			
			obj.armStg(i);
                }
        }
}  
