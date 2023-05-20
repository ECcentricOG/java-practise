import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char ch = (char)(64+n);

		for(int i=1;i<=n;i++){

			char ch1 = ch;

			for(int j=1;j<=n;j++){

				if(i%2 == 1)
					System.out.print(ch1-- +" ");
				else
					System.out.print(ch1++ +" ");
			}
			System.out.println();
			ch++;
		}
	}
}
