import java.io.*;
class Solution{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Start : ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("Enter End : ");
		int m = Integer.parseInt(br.readLine());
		int count = 0;

		for(int i=n;i<=m;i++){

			if(i%2 == 0){

				if(i%5 == 0){

					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("Count : "+count);
	}	
}
