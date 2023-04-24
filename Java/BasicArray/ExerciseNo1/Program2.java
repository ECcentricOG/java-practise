import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());

		int [] ary = new int[n];
		int pro = 1;

		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());

			if(ary[i]%2 == 0){

				pro = pro*ary[i];
			}
		}
		System.out.println("Product is "+pro);
	}
}
