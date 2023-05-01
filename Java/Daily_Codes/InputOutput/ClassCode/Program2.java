import java.io.*;
class Demo{

	public static void main(String [] u)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num = Integer.parseInt(br.readLine());

		System.out.println(num);
	}
}
