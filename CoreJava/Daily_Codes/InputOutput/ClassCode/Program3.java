import java.io.*;
class Demo{

	public static void main(String [] a)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Building Name : ");
		String bName = br.readLine();

		System.out.print("Wing : ");
		char wing = (char)br.read();
		br.skip(1);

		System.out.print("Flat No : ");
		int fNo = Integer.parseInt(br.readLine());

		System.out.println(bName +" "+wing+" "+fNo);
	}
}
