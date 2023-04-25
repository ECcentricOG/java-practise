import java.io.*;
class Solution{

	void palFun(int x){

		int rev = 0;
		for(int i=x;i>0;i/=10){

			int rem = i%10;
			rev = (rev*10)+rem;
		}
		if(x == rev){

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

			obj.palFun(i);
                }
        }
}  
