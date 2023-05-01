import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No of Values : ");
		int n = Integer.parseInt(br.readLine());
		int ary [] = new int[n];

		for(int i=0;i<n;i++){

			ary[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0;i<n;i++){

			System.out.print(ary[i]+"  ");
		}
	}
}
