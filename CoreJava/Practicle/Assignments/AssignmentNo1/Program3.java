import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char ch = 'a';

		for(int i=1;i<=n;i++){

			char ch1 = ch;

			for(int j=1;j<=i;j++){

				System.out.print(ch1-- +" ");
			}
			System.out.println();
			ch++;
		}
	}
}
