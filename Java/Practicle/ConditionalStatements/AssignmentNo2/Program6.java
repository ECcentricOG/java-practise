import java.io.*;
class Solution{

	void countFun(int x){

		int count = 0;
		for(int i=x;i>0;i/=10){
			
			count++;
		}
		System.out.println("the digit count in "+x+"is "+count);
	}

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter 5 numbers ");
                int a = Integer.parseInt(br.readLine());
                int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
	
		Solution obj = new Solution();
		obj.countFun(a);
		obj.countFun(b);
		obj.countFun(c);
		obj.countFun(d);
		obj.countFun(e);

              
        }
}  
