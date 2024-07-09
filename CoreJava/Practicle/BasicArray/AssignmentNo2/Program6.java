import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());
		int [] ary = new int[n];
		for(int i=0;i<ary.length;i++){

			ary[i] = Integer.parseInt(br.readLine());
		}

		int max = ary[0];

		for(int i=1;i<ary.length;i++){

			if(ary[i] > max){

				max = ary[i];
			}
		}
		System.out.println("Max is "+max);
	}
}
