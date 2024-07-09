import java.io.*;
class Solution{

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Start : ");
                int n = Integer.parseInt(br.readLine());
                System.out.print("Enter End : ");
                int m = Integer.parseInt(br.readLine());
                for(int i=n;i<=m;i++){

			if(i*i*i <= m){

				System.out.println(i*i*i);
			}
                }
        }
}  
