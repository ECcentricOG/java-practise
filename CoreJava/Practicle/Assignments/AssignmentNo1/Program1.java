import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int num = n;
		char ch = 'D';
		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){

				if(i%2 == 1)
					System.out.print((num)+" ");
				else
					System.out.print(ch + " ");
			}
			num--;
			ch--;
			System.out.println();
		}
	}
}
