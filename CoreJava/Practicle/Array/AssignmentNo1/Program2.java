import java.io.*;
class Demo{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = 5;
		int [] ary = new int [size];

		for(int i=0;i<ary.length;i++) {

			ary[i] = Integer.parseInt(br.readLine());
		}

		for(int x : ary){

			System.out.println(x);
		}
	}
}
