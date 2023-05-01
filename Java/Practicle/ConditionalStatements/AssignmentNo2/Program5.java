import java.io.*;
class Solution{

	void perNo(int x){

		int sum = 0;
		for(int i=1;i<=x/2;i++){

			if(x%i == 0){
				
				sum = sum + i;
			}
		}

		if(sum == x){

			System.out.println(x);
		}
	}

        public static void main(String [] args)throws IOException{

		Solution obj = new Solution();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Start : ");
                int n = Integer.parseInt(br.readLine());
                System.out.print("Enter End : ");
                int m = Integer.parseInt(br.readLine());
                for(int i=n;i<=m;i++){

			obj.perNo(i);
                }
        }
}  
