import java.io.*;
class Solution{

	void fun(int x){

		int count = 0;
		for(int i=1;i<=x;i++){

			if(x%i == 0){
	
				count++;
			}
			if(count == 3){

				break;
			}
		}
		if(count == 3){

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

			obj.fun(i);
		}
	}
}
