import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Arrat Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary = new int [n];
		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0;i<ary.length;i++){

			int count = 0;
			for(int j=ary[i];j>0;j/=10){
			
				count++;
			}
			System.out.println(count);
		}
	}
}
