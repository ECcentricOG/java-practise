import java.io.*;
class Demo{

	public static void main(String [] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Array Size : ");
		int n = Integer.parseInt(br.readLine());

		int ary[] = new int[n];

		for(int i=0;i<ary.length;i++) 
			ary[i] = Integer.parseInt(br.readLine());

		for(int x : ary)
			System.out.println(x);
	}
}
